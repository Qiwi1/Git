package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.ProviderEntity;
import com.developer.KivSportAPI.service.ProviderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    private final ProviderService providerService;

    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @GetMapping
    public List<ProviderEntity> findAllProvider(){
        return providerService.findAllProvider();
    }

    @GetMapping("/{id}")
    public Optional<ProviderEntity> findProviderById(@PathVariable("id") Long id){
        return providerService.findById(id);
    }

    @PostMapping
    public ProviderEntity saveProvider(@RequestBody ProviderEntity provider){
        return providerService.saveProvider(provider);
    }

    @PutMapping
    public ProviderEntity updateProvider(@RequestBody ProviderEntity provider){
        return providerService.updateProvider(provider);
    }

    @DeleteMapping("/{id}")
    public void deleteProvider(@PathVariable("id") Long id){
        providerService.deleteProvider(id);
    }
}
