package com.education.trainingmicroservice.controller;

import com.education.api.V1Api;
import com.education.api.model.AvailableSlotsResponseInner;
import com.education.api.model.BookingRequest;
import com.education.api.model.BookingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class BookingsController implements V1Api {

    @Override
    public ResponseEntity<List<AvailableSlotsResponseInner>> v1ApiAvailableSlotsGet(LocalDate date) {
        return V1Api.super.v1ApiAvailableSlotsGet(date);
    }

    @Override
    public ResponseEntity<BookingResponse> v1ApiBookingsPost(BookingRequest bookingRequest) {
        return ResponseEntity.ok(BookingResponse.builder()
                .bookingId("123")
                .build());
    }
}
