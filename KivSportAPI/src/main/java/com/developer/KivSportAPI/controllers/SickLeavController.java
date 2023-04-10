package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.SickLeavEntity;
import com.developer.KivSportAPI.service.SickLeavService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sickleav")
public class SickLeavController {
    private final SickLeavService sickLeavService;

    public SickLeavController(SickLeavService sickLeavService) {
        this.sickLeavService = sickLeavService;
    }

    @GetMapping
    public List<SickLeavEntity> findAllSickLeav(){
        return sickLeavService.findAllSickLeav();
    }

    @GetMapping("/{id}")
    public Optional<SickLeavEntity> findSickLeavById(@PathVariable("id") Long id){
        return sickLeavService.findById(id);
    }

    @PostMapping
    public SickLeavEntity saveSickLeav(@RequestBody SickLeavEntity sickLeav){
        return sickLeavService.saveSickLeav(sickLeav);
    }

    @PutMapping
    public SickLeavEntity updateSickLeav(@RequestBody SickLeavEntity sickLeav){
        return sickLeavService.updateSickLeav(sickLeav);
    }

    @DeleteMapping("/{id}")
    public void deleteSickLeav(@PathVariable("id") Long id){
        sickLeavService.deleteSickLeav(id);
    }
}
