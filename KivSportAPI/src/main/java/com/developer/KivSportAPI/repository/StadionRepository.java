package com.developer.KivSportAPI.repository;

import com.developer.KivSportAPI.models.StadionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadionRepository extends JpaRepository<StadionEntity, Long> {
}
