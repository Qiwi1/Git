package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.ProfileEntity;
import com.developer.KivSportAPI.service.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public List<ProfileEntity> findAllProfile(){
        return profileService.findAllProfile();
    }

    @GetMapping("/{id}")
    public Optional<ProfileEntity> findProfileById(@PathVariable("id") Long id){
        return profileService.findById(id);
    }

    @GetMapping("/login/{profilelogin}")
    public ProfileEntity findProfileByProfilelogin(@PathVariable("profilelogin") String profilelogin){
        return profileService.findByProfilelogin(profilelogin);
    }

    @PostMapping
    public ProfileEntity saveProfile(@RequestBody ProfileEntity profile){
        return profileService.saveProfile(profile);
    }

    @PutMapping
    public ProfileEntity updateProfile(@RequestBody ProfileEntity profile){
        return profileService.updateProfile(profile);
    }

    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable("id") Long id){
        profileService.deleteProfile(id);
    }
}
