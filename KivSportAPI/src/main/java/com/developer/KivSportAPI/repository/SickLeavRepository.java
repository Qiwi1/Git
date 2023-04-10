package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.SickLeavEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SickLeavRepository extends JpaRepository<SickLeavEntity, Long> {
}
