package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.TypeCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCardRepository extends JpaRepository<TypeCardEntity, Long> {
}
