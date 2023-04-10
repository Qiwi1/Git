package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.CharacteristiczEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacteristiczRepository extends JpaRepository<CharacteristiczEntity, Long> {
}
