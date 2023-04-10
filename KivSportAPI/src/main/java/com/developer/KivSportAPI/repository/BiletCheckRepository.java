package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.BiletCheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiletCheckRepository extends JpaRepository<BiletCheckEntity, Long> {
}
