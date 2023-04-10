package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.SickTypeEntity;
import com.developer.KivSportAPI.service.SickTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sicktype")
public class SickTypeController {
    private final SickTypeService sickTypeService;

    public SickTypeController(SickTypeService sickTypeService) {
        this.sickTypeService = sickTypeService;
    }

    @GetMapping
    public List<SickTypeEntity> findAllSickType(){
        return sickTypeService.findAllSickType();
    }

    @GetMapping("/{id}")
    public Optional<SickTypeEntity> findSickTypeById(@PathVariable("id") Long id){
        return sickTypeService.findById(id);
    }

    @PostMapping
    public SickTypeEntity saveSickType(@RequestBody SickTypeEntity sickType){
        return sickTypeService.saveSickType(sickType);
    }

    @PutMapping
    public SickTypeEntity updateSickType(@RequestBody SickTypeEntity sickType){
        return sickTypeService.updateSickType(sickType);
    }

    @DeleteMapping("/{id}")
    public void deleteSickType(@PathVariable("id") Long id){
        sickTypeService.deleteSickType(id);
    }
}
