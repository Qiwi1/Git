package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.StadionEntity;
import com.developer.KivSportAPI.service.StadionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stadion")
public class StadionController {
    private final StadionService stadionService;

    public StadionController(StadionService stadionService) {
        this.stadionService = stadionService;
    }

    @GetMapping
    public List<StadionEntity> findAllStadion(){
        return stadionService.findAllStadion();
    }

    @GetMapping("/{id}")
    public Optional<StadionEntity> findStadionById(@PathVariable("id") Long id){
        return stadionService.findById(id);
    }

    @PostMapping
    public StadionEntity saveStadion(@RequestBody StadionEntity stadion){
        return stadionService.saveStadion(stadion);
    }

    @PutMapping
    public StadionEntity updateStadion(@RequestBody StadionEntity stadion){
        return stadionService.updateStadion(stadion);
    }

    @DeleteMapping("/{id}")
    public void deleteStadion(@PathVariable("id") Long id){
        stadionService.deleteStadion(id);
    }
}
