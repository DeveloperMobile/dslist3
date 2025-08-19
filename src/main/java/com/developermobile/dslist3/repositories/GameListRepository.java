package com.developermobile.dslist3.repositories;

import com.developermobile.dslist3.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
