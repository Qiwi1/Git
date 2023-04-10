package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.BiletEntity;
import com.developer.KivSportAPI.repository.BiletRepository;
import com.developer.KivSportAPI.service.BiletService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletServiceImpl implements BiletService {

    private final BiletRepository biletRepository;

    public BiletServiceImpl(BiletRepository biletRepository) {
        this.biletRepository = biletRepository;
    }

    @Override
    public List<BiletEntity> findAllBilet() {
        return biletRepository.findAll();
    }

    @Override
    public Optional<BiletEntity> findById(Long id) {
        return biletRepository.findById(id);
    }

    @Override
    public BiletEntity saveBilet(BiletEntity bilet) {
        return biletRepository.save(bilet);
    }

    @Override
    public BiletEntity updateBilet(BiletEntity bilet) {
        return biletRepository.save(bilet);
    }

    @Override
    public void deleteBilet(Long id) {
        biletRepository.deleteById(id);
    }
}
