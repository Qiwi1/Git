package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.BiletCharacteristiczEntity;
import com.developer.KivSportAPI.service.BiletCharacteristiczService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/biletcharacteristicz")
public class BiletCharacteristiczController {
    private final BiletCharacteristiczService biletCharacteristiczService;

    public BiletCharacteristiczController(BiletCharacteristiczService biletCharacteristiczService) {
        this.biletCharacteristiczService = biletCharacteristiczService;
    }

    @GetMapping
    public List<BiletCharacteristiczEntity> findAllBiletCharacteristicz(){
        return biletCharacteristiczService.findAllBiletCharacteristicz();
    }

    @GetMapping("/{id}")
    public Optional<BiletCharacteristiczEntity> findBiletCharacteristiczById(@PathVariable("id") Long id){
        return biletCharacteristiczService.findById(id);
    }

    @PostMapping
    public BiletCharacteristiczEntity saveBiletCharacteristicz(@RequestBody BiletCharacteristiczEntity biletCharacteristicz){
        return biletCharacteristiczService.saveBiletCharacteristicz(biletCharacteristicz);
    }

    @PutMapping
    public BiletCharacteristiczEntity updateBiletCharacteristicz(@RequestBody BiletCharacteristiczEntity biletCharacteristicz){
        return biletCharacteristiczService.updateBiletCharacteristicz(biletCharacteristicz);
    }

    @DeleteMapping("/{id}")
    public void deleteBiletCharacteristicz(@PathVariable("id") Long id){
        biletCharacteristiczService.deleteBiletCharacteristicz( id);
    }
}
