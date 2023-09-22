package com.progmasters.cinema.controller;

import com.progmasters.cinema.dto.ScreeningCreateCommandDto;
import com.progmasters.cinema.service.ScreeningService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<Void> saveScreening(@RequestBody ScreeningCreateCommandDto command) {
        screeningService.saveScreening(command);
        log.info("HTTP request, post-> /api/screenings body: " + command.toString());
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
