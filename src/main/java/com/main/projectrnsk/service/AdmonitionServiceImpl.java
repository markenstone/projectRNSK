package com.main.projectrnsk.service;

import com.main.projectrnsk.models.Admonition;
import com.main.projectrnsk.repo.AdmonitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdmonitionServiceImpl implements AdmonitionService{

    @Autowired
    private AdmonitionRepository admonitionRepository;
    @Override
    public List<Admonition> getAllAdmonition() {
        return admonitionRepository.findAll();
    }

    @Override
    public Admonition findAdmonition(Long id) {
        return admonitionRepository.getById(id);
    }

    @Override
    public void saveAdmonition(Admonition admonition) {
        admonitionRepository.save(admonition);
    }

    @Override
    public void deleteAdmonition(Admonition admonition) {
        admonitionRepository.delete(admonition);
        }
}
