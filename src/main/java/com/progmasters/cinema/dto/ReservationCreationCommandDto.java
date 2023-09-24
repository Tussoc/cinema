package com.progmasters.cinema.dto;

import lombok.Data;


@Data
public class ReservationCreationCommandDto {

   private String name;
   private Integer numberOfSeats;
   private Long screeningId;

}
