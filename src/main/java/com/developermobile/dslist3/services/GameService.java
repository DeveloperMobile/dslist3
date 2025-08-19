package com.developermobile.dslist3.services;

import com.developermobile.dslist3.dto.GameDTO;
import com.developermobile.dslist3.dto.GameMinDTO;
import com.developermobile.dslist3.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return repository.findAll().stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        return new GameDTO(repository.findById(id).get());
    }
}
