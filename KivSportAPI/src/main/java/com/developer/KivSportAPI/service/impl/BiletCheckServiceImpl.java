package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.BiletCheckEntity;
import com.developer.KivSportAPI.repository.BiletCheckRepository;
import com.developer.KivSportAPI.service.BiletCheckService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletCheckServiceImpl implements BiletCheckService {

    private final BiletCheckRepository biletCheckRepository;

    public BiletCheckServiceImpl(BiletCheckRepository biletCheckRepository) {
        this.biletCheckRepository = biletCheckRepository;
    }

    @Override
    public List<BiletCheckEntity> findAllBiletCheck() {
        return biletCheckRepository.findAll();
    }

    @Override
    public Optional<BiletCheckEntity> findById(Long id) {
        return biletCheckRepository.findById(id);
    }

    @Override
    public BiletCheckEntity saveBiletCheck(BiletCheckEntity biletCheck) {
        return biletCheckRepository.save(biletCheck);
    }

    @Override
    public BiletCheckEntity updateBiletCheck(BiletCheckEntity biletCheck) {
        return biletCheckRepository.save(biletCheck);
    }

    @Override
    public void deleteBiletCheck(Long id) {
        biletCheckRepository.deleteById(id);
    }
}
