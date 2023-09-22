package com.progmasters.cinema.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ReservationCreationCommandDto {

   private String title;
   private LocalDateTime screeningDate;
   private Integer numberOfSeats;
   private String screening;

}
