package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.BiletCharacteristiczEntity;

import java.util.List;
import java.util.Optional;

public interface BiletCharacteristiczService {
    List<BiletCharacteristiczEntity> findAllBiletCharacteristicz();
    Optional<BiletCharacteristiczEntity> findById(Long id);
    BiletCharacteristiczEntity saveBiletCharacteristicz(BiletCharacteristiczEntity biletCharacteristicz);
    BiletCharacteristiczEntity updateBiletCharacteristicz(BiletCharacteristiczEntity biletCharacteristicz);
    void deleteBiletCharacteristicz(Long id);
}
