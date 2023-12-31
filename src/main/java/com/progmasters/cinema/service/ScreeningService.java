package com.progmasters.cinema.service;

import com.progmasters.cinema.domain.Screening;
import com.progmasters.cinema.dto.ScreeningCreateCommandDto;
import com.progmasters.cinema.dto.ScreeningListItem;
import com.progmasters.cinema.repository.ScreeningRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
@Data
public class ScreeningService {

    private ScreeningRepository screeningRepository;

    @Autowired
    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    public void saveScreening(ScreeningCreateCommandDto command) {
        screeningRepository.save(mapScreeningCreateCommandToScreening(command));
    }

    private Screening mapScreeningCreateCommandToScreening(ScreeningCreateCommandDto command) {
        Screening screening = new Screening();
        screening.setTitle(command.getTitle());
        screening.setScreeningDate(command.getScreeningDate());
        screening.setTotalSeatCount(command.getTotalSeatCount());
        screening.setPictureUrl(command.getPictureUrl());
        return screening;
    }

    public List<ScreeningListItem> getAllScreeningsByDate() {
        List<Screening> allScreening = screeningRepository.findByrOrderByScreeningDateAsc();
        List<ScreeningListItem> listItems = allScreening.stream().map(ScreeningListItem::new).collect(Collectors.toList());

        return listItems;
    }
}

