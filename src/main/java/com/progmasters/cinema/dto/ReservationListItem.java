package com.progmasters.cinema.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReservationListItem {

    private String name;
    private Integer numberOfSeats;
    private String screening;

}
