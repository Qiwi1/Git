package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.TypeCardEntity;
import com.developer.KivSportAPI.service.TypeCardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/typecard")
public class TypeCardController {
    private final TypeCardService typeCardService;

    public TypeCardController(TypeCardService typeCardService) {
        this.typeCardService = typeCardService;
    }

    @GetMapping
    public List<TypeCardEntity> findAllTypeCard(){
        return typeCardService.findAllTypeCard();
    }

    @GetMapping("/{id}")
    public Optional<TypeCardEntity> findTypeCardById(@PathVariable("id") Long id){
        return typeCardService.findById(id);
    }

    @PostMapping
    public TypeCardEntity saveTypeCard(@RequestBody TypeCardEntity typeCard){
        return typeCardService.saveTypeCard(typeCard);
    }

    @PutMapping
    public TypeCardEntity updateTypeCard(@RequestBody TypeCardEntity typeCard){
        return typeCardService.updateTypeCard(typeCard);
    }

    @DeleteMapping("/{id}")
    public void deleteTypeCard(@PathVariable("id") Long id){
        typeCardService.deleteTypeCard(id);
    }
}
