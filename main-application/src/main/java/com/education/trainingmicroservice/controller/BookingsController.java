package com.education.trainingmicroservice.controller;

import com.education.api.V1Api;
import com.education.api.model.AvailableSlotsRs;
import com.education.api.model.BookingRq;
import com.education.api.model.BookingRs;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class BookingsController implements V1Api {

    @Override
    public ResponseEntity<AvailableSlotsRs> v1ApiAvailableSlotsGet(LocalDate date) {
        return V1Api.super.v1ApiAvailableSlotsGet(date);
    }

    @Override
    public ResponseEntity<BookingRs> v1ApiBookingsPost(BookingRq bookingRequest) {
        return ResponseEntity.ok(BookingRs.builder()
                .bookingId("123")
                .build());
    }
}
