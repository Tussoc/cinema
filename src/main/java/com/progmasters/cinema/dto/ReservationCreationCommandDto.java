package com.progmasters.cinema.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class ReservationCreationCommandDto {

   private String name;
   private Integer numberOfSeats;
   private Long screeningId;

}
