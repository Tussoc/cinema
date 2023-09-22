package com.progmasters.cinema.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "screening")
@Data
@NoArgsConstructor
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column()
    private String title;

    @Column()
    private LocalDateTime screeningDate;

    @Column()
    private Integer totalSeatCount;

    @Column(columnDefinition = "TEXT")
    private String pictureUrl;

    @OneToMany(mappedBy = "screening")
    private List<Reservation> reservationList=new ArrayList<>();
}
