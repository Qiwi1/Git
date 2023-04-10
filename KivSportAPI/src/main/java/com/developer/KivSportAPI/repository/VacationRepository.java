package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.VacationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationRepository extends JpaRepository<VacationEntity, Long> {
}
