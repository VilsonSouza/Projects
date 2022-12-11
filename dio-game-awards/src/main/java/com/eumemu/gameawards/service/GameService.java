package com.eumemu.gameawards.service;

import com.eumemu.gameawards.domain.model.Game;

import java.util.List;

public interface GameService {

    List<Game> findAll();

    Game findById(long id);

    void insert(Game game);

    void update(Long id,Game game);

    void delete(Long id);

    void vote(Long id);
}
