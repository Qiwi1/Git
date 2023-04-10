package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.BiletCheckEntity;

import java.util.List;
import java.util.Optional;

public interface BiletCheckService {
    List<BiletCheckEntity> findAllBiletCheck();
    Optional<BiletCheckEntity> findById(Long id);
    BiletCheckEntity saveBiletCheck(BiletCheckEntity biletCheck);
    BiletCheckEntity updateBiletCheck(BiletCheckEntity biletCheck);
    void deleteBiletCheck(Long id);
}
