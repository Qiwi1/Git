package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.BiletCharacteristiczEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiletCharacteristiczRepository extends JpaRepository<BiletCharacteristiczEntity, Long> {
}
