package com.main.projectrnsk.service;

import com.main.projectrnsk.models.Admonition;
import com.main.projectrnsk.models.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AdmonitionService {
    public List<Admonition> getAllAdmonition();

    public Admonition findAdmonition(Long id);

    public void saveAdmonition(Admonition admonition);

    public  void deleteAdmonition(Admonition admonition);
}
