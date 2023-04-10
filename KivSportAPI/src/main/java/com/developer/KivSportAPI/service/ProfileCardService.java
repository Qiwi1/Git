package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.BiletEntity;
import com.developer.KivSportAPI.models.ProfileCardEntity;

import java.util.List;
import java.util.Optional;

public interface ProfileCardService {
    List<ProfileCardEntity> findAllProfileCard();
    Optional<ProfileCardEntity> findById(Long id);
    ProfileCardEntity saveProfileCard(ProfileCardEntity profileCard);
    ProfileCardEntity updateProfileCard(ProfileCardEntity profileCard);
    void deleteProfileCard(Long id);
}
