package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.BiletCharacteristiczEntity;
import com.developer.KivSportAPI.repository.BiletCharacteristiczRepository;
import com.developer.KivSportAPI.service.BiletCharacteristiczService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletCharacteristiczServiceImpl implements BiletCharacteristiczService {

    private final BiletCharacteristiczRepository biletCharacteristiczRepository;

    public BiletCharacteristiczServiceImpl(BiletCharacteristiczRepository biletCharacteristiczRepository) {
        this.biletCharacteristiczRepository = biletCharacteristiczRepository;
    }

    @Override
    public List<BiletCharacteristiczEntity> findAllBiletCharacteristicz() {
        return biletCharacteristiczRepository.findAll();
    }

    @Override
    public Optional<BiletCharacteristiczEntity> findById(Long id) {
        return biletCharacteristiczRepository.findById(id);
    }

    @Override
    public BiletCharacteristiczEntity saveBiletCharacteristicz(BiletCharacteristiczEntity biletCharacteristicz) {
        return biletCharacteristiczRepository.save(biletCharacteristicz);
    }

    @Override
    public BiletCharacteristiczEntity updateBiletCharacteristicz(BiletCharacteristiczEntity biletCharacteristicz) {
        return biletCharacteristiczRepository.save(biletCharacteristicz);
    }

    @Override
    public void deleteBiletCharacteristicz(Long id) {
        biletCharacteristiczRepository.deleteById(id);
    }
}
