package com.developer.KivSportAPI.service;


import com.developer.KivSportAPI.models.BiletTypeEntity;

import java.util.List;
import java.util.Optional;

public interface BiletTypeService {
    List<BiletTypeEntity> findAllBiletType();
    Optional<BiletTypeEntity> findById(Long id);
    BiletTypeEntity saveBiletType(BiletTypeEntity biletType);
    BiletTypeEntity updateBiletType(BiletTypeEntity biletType);
    void deleteBiletType(Long id);
}
