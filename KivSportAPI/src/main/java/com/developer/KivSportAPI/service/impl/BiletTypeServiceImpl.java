package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.BiletTypeEntity;
import com.developer.KivSportAPI.repository.BiletTypeRepository;
import com.developer.KivSportAPI.service.BiletTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletTypeServiceImpl implements BiletTypeService {

    private final BiletTypeRepository biletTypeRepository;

    public BiletTypeServiceImpl(BiletTypeRepository biletTypeRepository) {
        this.biletTypeRepository = biletTypeRepository;
    }

    @Override
    public List<BiletTypeEntity> findAllBiletType() {
        return biletTypeRepository.findAll();
    }

    @Override
    public Optional<BiletTypeEntity> findById(Long id) {
        return biletTypeRepository.findById(id);
    }

    @Override
    public BiletTypeEntity saveBiletType(BiletTypeEntity biletType) {
        return biletTypeRepository.save(biletType);
    }

    @Override
    public BiletTypeEntity updateBiletType(BiletTypeEntity biletType) {
        return biletTypeRepository.save(biletType);
    }

    @Override
    public void deleteBiletType(Long id) {
        biletTypeRepository.deleteById(id);
    }
}
