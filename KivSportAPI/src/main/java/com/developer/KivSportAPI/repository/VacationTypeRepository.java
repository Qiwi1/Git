package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.VacationTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationTypeRepository extends JpaRepository<VacationTypeEntity, Long> {
}
