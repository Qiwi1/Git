package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.SalaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<SalaryEntity, Long> {
}
