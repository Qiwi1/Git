package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.ProfileCardEntity;
import com.developer.KivSportAPI.models.ProviderEntity;

import java.util.List;
import java.util.Optional;

public interface ProviderService {
    List<ProviderEntity> findAllProvider();
    Optional<ProviderEntity> findById(Long id);
    ProviderEntity saveProvider(ProviderEntity provider);
    ProviderEntity updateProvider(ProviderEntity provider);
    void deleteProvider(Long id);
}
