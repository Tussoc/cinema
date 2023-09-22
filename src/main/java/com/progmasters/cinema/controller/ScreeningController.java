package com.progmasters.cinema.controller;

import com.progmasters.cinema.dto.ScreeningCreateCommandDto;
import com.progmasters.cinema.dto.ScreeningListItem;
import com.progmasters.cinema.service.ScreeningService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/screenings")
@Slf4j
public class ScreeningController {

    private final ScreeningService screeningService;

    @Autowired
    public ScreeningController(ScreeningService screeningService) {
        this.screeningService = screeningService;
    }

    @PostMapping
    public ResponseEntity<Void> saveScreening(@RequestBody @Valid ScreeningCreateCommandDto command) {
        screeningService.saveScreening(command);
        log.info("HTTP request, post-> /api/screenings body: " + command.toString());
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ScreeningListItem>> getAllScreening() {
        List<ScreeningListItem> screeningListItems = screeningService.getAllScreeningsByDate();
        return new ResponseEntity<>(screeningListItems, HttpStatus.OK);
    }
}
