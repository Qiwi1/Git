package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.BiletHistoryEntity;

import java.util.List;
import java.util.Optional;

public interface BiletHistoryService {
    List<BiletHistoryEntity> findAllBiletHistory();
    Optional<BiletHistoryEntity> findById(Long id);
    BiletHistoryEntity saveBiletHistory(BiletHistoryEntity biletHistory);
    BiletHistoryEntity updateBiletHistory(BiletHistoryEntity biletHistory);
    void deleteBiletHistory(Long id);
}
