package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.CharacteristiczEntity;
import com.developer.KivSportAPI.repository.CharacteristiczRepository;
import com.developer.KivSportAPI.service.CharacteristiczService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacteristiczServiceImpl implements CharacteristiczService {

    private final CharacteristiczRepository characteristiczRepository;

    public CharacteristiczServiceImpl(CharacteristiczRepository characteristiczRepository) {
        this.characteristiczRepository = characteristiczRepository;
    }

    @Override
    public List<CharacteristiczEntity> findAllCharacteristicz() {
        return characteristiczRepository.findAll();
    }

    @Override
    public Optional<CharacteristiczEntity> findById(Long id) {
        return characteristiczRepository.findById(id);
    }

    @Override
    public CharacteristiczEntity saveCharacteristicz(CharacteristiczEntity characteristicz) {
        return characteristiczRepository.save(characteristicz);
    }

    @Override
    public CharacteristiczEntity updateCharacteristicz(CharacteristiczEntity characteristicz) {
        return characteristiczRepository.save(characteristicz);
    }

    @Override
    public void deleteCharacteristicz(Long id) {
        characteristiczRepository.deleteById(id);
    }
}
