package com.progmasters.cinema.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ScreeningCreateCommandDto {

    private String title;
    private LocalDateTime screeningDate;
    private Integer totalSeatCount;
    private String pictureUrl;

}
