package com.progmasters.cinema.service;

import com.progmasters.cinema.domain.Reservation;
import com.progmasters.cinema.dto.ReservationCreationCommandDto;
import com.progmasters.cinema.repository.ReservationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@Data
public class ReservationService {

    private ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }


    public void saveReservation(ReservationCreationCommandDto command) {
        Reservation reservation = new Reservation();
        reservation.setName(command.getTitle());
        reservation.setNumberOfSeats(command.getNumberOfSeats());
        reservation.setScreening();
    }
}
