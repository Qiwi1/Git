package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.StadionEntity;
import com.developer.KivSportAPI.models.SickLeavEntity;

import java.util.List;
import java.util.Optional;

public interface SickLeavService {
    List<SickLeavEntity> findAllSickLeav();
    Optional<SickLeavEntity> findById(Long id);
    SickLeavEntity saveSickLeav(SickLeavEntity sickLeav);
    SickLeavEntity updateSickLeav(SickLeavEntity sickLeav);
    void deleteSickLeav(Long id);
}
