package com.progmasters.cinema.repository;

import com.progmasters.cinema.domain.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {

    @Query("SELECT s from Screening s ORDER BY s.screeningDate ASC ")
    List<Screening> findByrOrderByScreeningDateAsc();

}
