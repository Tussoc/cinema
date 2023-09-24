package com.progmasters.cinema.dto;

import com.progmasters.cinema.domain.Screening;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ScreeningListItem {

    private Long id;
    private String title;
    private LocalDateTime screeningDate;
    private Integer totalSeatCount;
    private String pictureUrl;

    public ScreeningListItem(Screening screening) {
        this.id = screening.getId();
        this.title = screening.getTitle();
        this.screeningDate = screening.getScreeningDate();
        this.totalSeatCount = screening.getTotalSeatCount();
        this.pictureUrl = screening.getPictureUrl();
    }
}
