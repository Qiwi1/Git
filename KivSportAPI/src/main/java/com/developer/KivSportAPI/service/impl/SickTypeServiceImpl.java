package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.SickTypeEntity;
import com.developer.KivSportAPI.repository.SickTypeRepository;
import com.developer.KivSportAPI.service.SickTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SickTypeServiceImpl implements SickTypeService {

    private final SickTypeRepository sickTypeRepository;

    public SickTypeServiceImpl(SickTypeRepository sickTypeRepository) {
        this.sickTypeRepository = sickTypeRepository;
    }

    @Override
    public List<SickTypeEntity> findAllSickType() {
        return sickTypeRepository.findAll();
    }

    @Override
    public Optional<SickTypeEntity> findById(Long id) {
        return sickTypeRepository.findById(id);
    }

    @Override
    public SickTypeEntity saveSickType(SickTypeEntity sickType) {
        return sickTypeRepository.save(sickType);
    }

    @Override
    public SickTypeEntity updateSickType(SickTypeEntity sickType) {
        return sickTypeRepository.save(sickType);
    }

    @Override
    public void deleteSickType(Long id) {
        sickTypeRepository.deleteById(id);
    }
}
