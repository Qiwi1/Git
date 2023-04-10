package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.ProviderEntity;
import com.developer.KivSportAPI.repository.ProviderRepository;
import com.developer.KivSportAPI.service.ProviderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderServiceImpl implements ProviderService {

    private final ProviderRepository providerRepository;

    public ProviderServiceImpl(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Override
    public List<ProviderEntity> findAllProvider() {
        return providerRepository.findAll();
    }

    @Override
    public Optional<ProviderEntity> findById(Long id) {
        return providerRepository.findById(id);
    }

    @Override
    public ProviderEntity saveProvider(ProviderEntity provider) {
        return providerRepository.save(provider);
    }

    @Override
    public ProviderEntity updateProvider(ProviderEntity provider) {
        return providerRepository.save(provider);
    }

    @Override
    public void deleteProvider(Long id) {
        providerRepository.deleteById(id);
    }
}
