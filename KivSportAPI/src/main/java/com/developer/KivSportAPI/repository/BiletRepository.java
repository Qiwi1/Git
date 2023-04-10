package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.BiletEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiletRepository extends JpaRepository<BiletEntity, Long> {
}
