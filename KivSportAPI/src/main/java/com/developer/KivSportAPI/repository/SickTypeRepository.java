package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.SickTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SickTypeRepository extends JpaRepository<SickTypeEntity, Long> {
}
