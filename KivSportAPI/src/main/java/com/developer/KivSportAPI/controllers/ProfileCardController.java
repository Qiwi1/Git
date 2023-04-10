package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.ProfileCardEntity;
import com.developer.KivSportAPI.service.ProfileCardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profilecard")
public class ProfileCardController {
    private final ProfileCardService profileCardService;

    public ProfileCardController(ProfileCardService profileCardService) {
        this.profileCardService = profileCardService;
    }

    @GetMapping
    public List<ProfileCardEntity> findAllProfileCard(){
        return profileCardService.findAllProfileCard();
    }

    @GetMapping("/{id}")
    public Optional<ProfileCardEntity> findProfileCardById(@PathVariable("id") Long id){
        return profileCardService.findById(id);
    }

    @PostMapping
    public ProfileCardEntity saveProfileCard(@RequestBody ProfileCardEntity profileCard){
        return profileCardService.saveProfileCard(profileCard);
    }

    @PutMapping
    public ProfileCardEntity updateProfileCard(@RequestBody ProfileCardEntity profileCard){
        return profileCardService.updateProfileCard(profileCard);
    }

    @DeleteMapping("/{id}")
    public void deleteProfileCard(@PathVariable("id") Long id){
        profileCardService.deleteProfileCard(id);
    }
}
