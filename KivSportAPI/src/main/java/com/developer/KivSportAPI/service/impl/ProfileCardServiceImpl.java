package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.ProfileCardEntity;
import com.developer.KivSportAPI.repository.ProfileCardRepository;
import com.developer.KivSportAPI.service.ProfileCardService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileCardServiceImpl implements ProfileCardService {

    private final ProfileCardRepository profileCardRepository;

    public ProfileCardServiceImpl(ProfileCardRepository profileCardRepository) {
        this.profileCardRepository = profileCardRepository;
    }

    @Override
    public List<ProfileCardEntity> findAllProfileCard() {
        return profileCardRepository.findAll();
    }

    @Override
    public Optional<ProfileCardEntity> findById(Long id) {
        return profileCardRepository.findById(id);
    }

    @Override
    public ProfileCardEntity saveProfileCard(ProfileCardEntity profileCard) {
        return profileCardRepository.save(profileCard);
    }

    @Override
    public ProfileCardEntity updateProfileCard(ProfileCardEntity profileCard) {
        return profileCardRepository.save(profileCard);
    }

    @Override
    public void deleteProfileCard(Long id) {
        profileCardRepository.deleteById(id);
    }
}
