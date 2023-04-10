package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.VacationEntity;
import com.developer.KivSportAPI.models.VacationTypeEntity;

import java.util.List;
import java.util.Optional;

public interface VacationTypeService {
    List<VacationTypeEntity> findAllVacationType();
    Optional<VacationTypeEntity> findById(Long id);
    VacationTypeEntity saveVacationType(VacationTypeEntity vacationType);
    VacationTypeEntity updateVacationType(VacationTypeEntity vacationType);
    void deleteVacationType(Long id);
}
