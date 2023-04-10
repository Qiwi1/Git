package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.BiletCheckEntity;
import com.developer.KivSportAPI.service.BiletCheckService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/biletcheck")
public class BiletCheckController {
    private final BiletCheckService biletCheckService;

    public BiletCheckController(BiletCheckService biletCheckService) {
        this.biletCheckService = biletCheckService;
    }

    @GetMapping
    public List<BiletCheckEntity> findAllBiletCheck(){
        return biletCheckService.findAllBiletCheck();
    }

    @GetMapping("/{id}")
    public Optional<BiletCheckEntity> findBiletCheckById(@PathVariable("id") Long id){
        return biletCheckService.findById(id);
    }

    @PostMapping
    public BiletCheckEntity saveBiletCheck(@RequestBody BiletCheckEntity biletCheck){
        return biletCheckService.saveBiletCheck(biletCheck);
    }

    @PutMapping
    public BiletCheckEntity updateBiletCheck(@RequestBody BiletCheckEntity biletCheck){
        return biletCheckService.updateBiletCheck(biletCheck);
    }

    @DeleteMapping("/{id}")
    public void deleteBiletCheck(@PathVariable("id") Long id){
        biletCheckService.deleteBiletCheck(id);
    }
}
