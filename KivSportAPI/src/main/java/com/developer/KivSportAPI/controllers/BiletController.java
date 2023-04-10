package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.BiletEntity;
import com.developer.KivSportAPI.service.BiletService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bilet")
public class BiletController {
    private final BiletService biletService;

    public BiletController(BiletService biletService) {
        this.biletService = biletService;
    }

    @GetMapping
    public List<BiletEntity> findAllBilet(){
        return biletService.findAllBilet();
    }

    @GetMapping("/{id}")
    public Optional<BiletEntity> findBiletById(@PathVariable("id") Long id){
        return biletService.findById(id);
    }

    @PostMapping
    public BiletEntity saveBilet(@RequestBody BiletEntity bilet){
        return biletService.saveBilet(bilet);
    }

    @PutMapping
    public BiletEntity updateBilet(@RequestBody BiletEntity bilet){
        return biletService.updateBilet(bilet);
    }

    @DeleteMapping("/{id}")
    public void deleteBilet(@PathVariable("id") Long id){
        biletService.deleteBilet(id);
    }
}
