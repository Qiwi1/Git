package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.CharacteristiczEntity;
import com.developer.KivSportAPI.service.CharacteristiczService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/characteristicz")
public class CharacteristiczController {
    private final CharacteristiczService characteristiczService;

    public CharacteristiczController(CharacteristiczService characteristiczService) {
        this.characteristiczService = characteristiczService;
    }

    @GetMapping
    public List<CharacteristiczEntity> findAllCharacteristicz(){
        return characteristiczService.findAllCharacteristicz();
    }

    @GetMapping("/{id}")
    public Optional<CharacteristiczEntity> findCharacteristiczById(@PathVariable("id") Long id){
        return characteristiczService.findById(id);
    }

    @PostMapping
    public CharacteristiczEntity saveCharacteristicz(@RequestBody CharacteristiczEntity characteristicz){
        return characteristiczService.saveCharacteristicz(characteristicz);
    }

    @PutMapping
    public CharacteristiczEntity updateCharacteristicz(@RequestBody CharacteristiczEntity characteristicz){
        return characteristiczService.updateCharacteristicz(characteristicz);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacteristicz(@PathVariable("id") Long id){
        characteristiczService.deleteCharacteristicz(id);
    }
}
