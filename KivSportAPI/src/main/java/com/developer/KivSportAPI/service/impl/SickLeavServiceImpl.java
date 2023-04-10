package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.SickLeavEntity;
import com.developer.KivSportAPI.repository.SickLeavRepository;
import com.developer.KivSportAPI.service.SickLeavService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SickLeavServiceImpl implements SickLeavService {

    private final SickLeavRepository sickLeavRepository;

    public SickLeavServiceImpl(SickLeavRepository sickLeavRepository) {
        this.sickLeavRepository = sickLeavRepository;
    }

    @Override
    public List<SickLeavEntity> findAllSickLeav() {
        return sickLeavRepository.findAll();
    }

    @Override
    public Optional<SickLeavEntity> findById(Long id) {
        return sickLeavRepository.findById(id);
    }

    @Override
    public SickLeavEntity saveSickLeav(SickLeavEntity sickLeav) {
        return sickLeavRepository.save(sickLeav);
    }

    @Override
    public SickLeavEntity updateSickLeav(SickLeavEntity sickLeav) {
        return sickLeavRepository.save(sickLeav);
    }

    @Override
    public void deleteSickLeav(Long id) {
        sickLeavRepository.deleteById(id);
    }
}
