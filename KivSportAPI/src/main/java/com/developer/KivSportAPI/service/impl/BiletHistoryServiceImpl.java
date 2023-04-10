package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.BiletHistoryEntity;
import com.developer.KivSportAPI.repository.BiletHistoryRepository;
import com.developer.KivSportAPI.service.BiletHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletHistoryServiceImpl implements BiletHistoryService {

    private final BiletHistoryRepository biletHistoryRepository;

    public BiletHistoryServiceImpl(BiletHistoryRepository biletHistoryRepository) {
        this.biletHistoryRepository = biletHistoryRepository;
    }

    @Override
    public List<BiletHistoryEntity> findAllBiletHistory() {
        return biletHistoryRepository.findAll();
    }

    @Override
    public Optional<BiletHistoryEntity> findById(Long id) {
        return biletHistoryRepository.findById(id);
    }

    @Override
    public BiletHistoryEntity saveBiletHistory(BiletHistoryEntity biletHistory) {
        return biletHistoryRepository.save(biletHistory);
    }

    @Override
    public BiletHistoryEntity updateBiletHistory(BiletHistoryEntity biletHistory) {
        return biletHistoryRepository.save(biletHistory);
    }

    @Override
    public void deleteBiletHistory(Long id) {
        biletHistoryRepository.deleteById(id);
    }
}
