package com.developermobile.dslist3.services;

import com.developermobile.dslist3.dto.GameListDTO;
import com.developermobile.dslist3.dto.GameMinDTO;
import com.developermobile.dslist3.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        return repository.findAll().stream().map(GameListDTO::new).toList();
    }

}
