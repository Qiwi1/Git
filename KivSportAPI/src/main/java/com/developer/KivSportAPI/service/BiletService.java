package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.BiletEntity;

import java.util.List;
import java.util.Optional;

public interface BiletService {
    List<BiletEntity> findAllBilet();
    Optional<BiletEntity> findById(Long id);
    BiletEntity saveBilet(BiletEntity bilet);
    BiletEntity updateBilet(BiletEntity bilet);
    void deleteBilet(Long id);
}
