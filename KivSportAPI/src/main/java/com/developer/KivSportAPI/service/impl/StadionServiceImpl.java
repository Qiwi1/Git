package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.StadionEntity;
import com.developer.KivSportAPI.repository.StadionRepository;
import com.developer.KivSportAPI.service.StadionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StadionServiceImpl implements StadionService {

    private final StadionRepository stadionRepository;

    public StadionServiceImpl(StadionRepository stadionRepository) {
        this.stadionRepository = stadionRepository;
    }

    @Override
    public List<StadionEntity> findAllStadion() {
        return stadionRepository.findAll();
    }

    @Override
    public Optional<StadionEntity> findById(Long id) {
        return stadionRepository.findById(id);
    }

    @Override
    public StadionEntity saveStadion(StadionEntity stadion) {
        return stadionRepository.save(stadion);
    }

    @Override
    public StadionEntity updateStadion(StadionEntity stadion) {
        return stadionRepository.save(stadion);
    }

    @Override
    public void deleteStadion(Long id) {
        stadionRepository.deleteById(id);
    }
}
