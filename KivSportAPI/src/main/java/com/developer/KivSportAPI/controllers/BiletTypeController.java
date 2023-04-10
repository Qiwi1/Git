package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.BiletTypeEntity;
import com.developer.KivSportAPI.service.BiletTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bilettype")
public class BiletTypeController {
    private final BiletTypeService biletTypeService;

    public BiletTypeController(BiletTypeService biletTypeService) {
        this.biletTypeService = biletTypeService;
    }

    @GetMapping
    public List<BiletTypeEntity> findAllBiletType(){
        return biletTypeService.findAllBiletType();
    }

    @GetMapping("/{id}")
    public Optional<BiletTypeEntity> findBiletTypeById(@PathVariable("id") Long id){
        return biletTypeService.findById(id);
    }

    @PostMapping
    public BiletTypeEntity saveBiletType(@RequestBody BiletTypeEntity biletType){
        return biletTypeService.saveBiletType(biletType);
    }

    @PutMapping
    public BiletTypeEntity updateBiletType(@RequestBody BiletTypeEntity biletType){
        return biletTypeService.updateBiletType(biletType);
    }

    @DeleteMapping("/{id}")
    public void deleteBiletType(@PathVariable("id") Long id){
        biletTypeService.deleteBiletType(id);
    }
}
