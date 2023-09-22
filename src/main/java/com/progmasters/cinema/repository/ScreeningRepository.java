package com.progmasters.cinema.repository;

import com.progmasters.cinema.domain.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {

}
