package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.SickLeavEntity;
import com.developer.KivSportAPI.models.SickTypeEntity;

import java.util.List;
import java.util.Optional;

public interface SickTypeService {
    List<SickTypeEntity> findAllSickType();
    Optional<SickTypeEntity> findById(Long id);
    SickTypeEntity saveSickType(SickTypeEntity sickType);
    SickTypeEntity updateSickType(SickTypeEntity sickType);
    void deleteSickType(Long id);
}
