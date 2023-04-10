package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.StadionEntity;

import java.util.List;
import java.util.Optional;

public interface StadionService {
    List<StadionEntity> findAllStadion();
    Optional<StadionEntity> findById(Long id);
    StadionEntity saveStadion(StadionEntity stadion);
    StadionEntity updateStadion(StadionEntity stadion);
    void deleteStadion(Long id);
}
