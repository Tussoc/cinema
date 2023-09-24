package com.progmasters.cinema.dto;

import com.progmasters.cinema.domain.Reservation;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReservationListItem {

    private String name;
    private Integer numberOfSeats;
    private Long screeningId;

    public ReservationListItem(Reservation reservation) {
        this.name = reservation.getName();
        this.numberOfSeats = reservation.getNumberOfSeats();
        this.screeningId = reservation.getScreening().getId();
    }
}
