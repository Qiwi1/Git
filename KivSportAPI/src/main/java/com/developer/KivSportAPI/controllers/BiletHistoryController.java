package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.BiletHistoryEntity;
import com.developer.KivSportAPI.service.BiletHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bilethistory")
public class BiletHistoryController {
    private final BiletHistoryService biletHistoryService;

    public BiletHistoryController(BiletHistoryService biletHistoryService) {
        this.biletHistoryService = biletHistoryService;
    }

    @GetMapping
    public List<BiletHistoryEntity> findAllBiletHistory(){
        return biletHistoryService.findAllBiletHistory();
    }

    @GetMapping("/{id}")
    public Optional<BiletHistoryEntity> findBiletHistoryById(@PathVariable("id") Long id){
        return biletHistoryService.findById(id);
    }

    @PostMapping
    public BiletHistoryEntity saveBiletHistory(@RequestBody BiletHistoryEntity biletHistory){
        return biletHistoryService.saveBiletHistory(biletHistory);
    }

    @PutMapping
    public BiletHistoryEntity updateBiletHistory(@RequestBody BiletHistoryEntity biletHistory){
        return biletHistoryService.updateBiletHistory(biletHistory);
    }

    @DeleteMapping("/{id}")
    public void deleteBiletHistory(@PathVariable("id") Long id){
        biletHistoryService.deleteBiletHistory(id);
    }
}
