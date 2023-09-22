package com.progmasters.cinema.dto;

import jakarta.validation.constraints.Min;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ScreeningCreateCommandDto {

    private String title;
    private LocalDateTime screeningDate;
    @Min(value = 10, message = "ASD")
    private Integer totalSeatCount;
    private String pictureUrl;

}
