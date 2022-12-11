package com.eumemu.gameawards.service.implementation;

import com.eumemu.gameawards.domain.model.Game;
import com.eumemu.gameawards.domain.model.GameRepository;
import com.eumemu.gameawards.service.GameService;
import com.eumemu.gameawards.service.exception.BusinessException;
import com.eumemu.gameawards.service.exception.NoContentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameRepository repository;
    @Override
    public List<Game> findAll() {
        List<Game> games = repository.findAll(Sort.by(Sort.Direction.DESC,"votes"));
        return games;
    }

    @Override
    public Game findById(long id) {
        Optional<Game> game = repository.findById(id);

        return game.orElseThrow(()-> new NoContentException());
    }

    @Override
    public void insert(Game game) {
        if(game.getId() != null){
            throw new BusinessException("O id e diferente de NULL");
        }
        else{
            repository.save(game);
        }

    }

    @Override
    public void update(Long id, Game game) {
        Game gameDb = findById(id);
        if (gameDb.getId().equals(game.getId())){
            repository.save(game);
        }
        else{
            throw new BusinessException("Os IDs para alteracao são divergentes");
        }
    }

    @Override
    public void delete(Long id) {
        Game gameDB=findById(id);
        repository.delete(gameDB);
    }

    @Override
    public void vote(Long id) {
        Game gameDb = findById(id);
        gameDb.setVotes(gameDb.getVotes()+1);
        update(id,gameDb);
    }
}
