# Specifying that we are using the Gradle image with OpenJDK 17 for the build stage and giving it an alias "build"
FROM gradle:7.5.0-jdk17 AS build

# Setting the working directory inside the container for the build stage
WORKDIR /app

# Copying all files from the current directory (on the host machine) to the working directory of the container
COPY . .

# Executing the project build using Gradle
RUN gradle build --no-daemon

# Specifying that for the run stage, we will use Alpine image with OpenJDK 17
FROM openjdk:17-alpine

# Installing curl and cleaning up to keep the image small
RUN apk --no-cache add curl

# Setting the working directory for the run stage
WORKDIR /app

# Copying the JAR file from the build stage ("build") to the working directory of the current stage
COPY --from=build /app/build/libs/training-microservice-1.0.0.jar .

# Setting the command to run the JAR file
CMD ["java", "-jar", "training-microservice-1.0.0.jar"]