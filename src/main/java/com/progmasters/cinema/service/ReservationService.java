package com.progmasters.cinema.service;

import com.progmasters.cinema.domain.Reservation;
import com.progmasters.cinema.domain.Screening;
import com.progmasters.cinema.dto.ReservationCreationCommandDto;
import com.progmasters.cinema.dto.ReservationListItem;
import com.progmasters.cinema.repository.ReservationRepository;
import com.progmasters.cinema.repository.ScreeningRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
@Data
public class ReservationService {

    private ReservationRepository reservationRepository;
    private ScreeningRepository screeningRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository, ScreeningRepository screeningRepository) {
        this.reservationRepository = reservationRepository;
        this.screeningRepository = screeningRepository;
    }

    public void saveReservation(ReservationCreationCommandDto command) {
        Screening screening = screeningRepository.findById(command.getScreeningId()).orElseThrow(EntityNotFoundException::new);
        Reservation reservation = new Reservation();
        reservation.setName(command.getName());
        reservation.setNumberOfSeats(command.getNumberOfSeats());
        reservation.setScreening(screening);
        screening.getReservationList().add(reservation);
        reservationRepository.save(reservation);
    }

    public List<ReservationListItem> findAllReservation() {
        List<Reservation> list = reservationRepository.findAll();
        List<ReservationListItem> listItems = list.stream().map(ReservationListItem::new).toList();
        return listItems;
    }
}
