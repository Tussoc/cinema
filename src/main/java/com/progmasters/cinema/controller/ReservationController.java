package com.progmasters.cinema.controller;

import com.progmasters.cinema.dto.ReservationCreationCommandDto;
import com.progmasters.cinema.dto.ReservationListItem;
import com.progmasters.cinema.service.ReservationService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reservations")
@Slf4j
public class ReservationController {

    private ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public ResponseEntity<Void> saveReservation(@RequestBody @Valid ReservationCreationCommandDto command) {
        reservationService.saveReservation(command);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ReservationListItem>> getAllReservations() {
        List<ReservationListItem> reservationList = reservationService.findAllReservation();
        return new ResponseEntity<>(reservationList, HttpStatus.OK);
    }
}
