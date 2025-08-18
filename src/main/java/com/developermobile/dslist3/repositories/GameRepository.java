package com.developermobile.dslist3.repositories;

import com.developermobile.dslist3.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
