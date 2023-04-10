package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.ProfileCardEntity;
import com.developer.KivSportAPI.models.ProfileEntity;

import java.util.List;
import java.util.Optional;

public interface ProfileService {
    List<ProfileEntity> findAllProfile();
    Optional<ProfileEntity> findById(Long id);
    ProfileEntity findByProfilelogin(String profilelogin);
    ProfileEntity saveProfile(ProfileEntity profile);
    ProfileEntity updateProfile(ProfileEntity profile);
    void deleteProfile(Long id);
}
