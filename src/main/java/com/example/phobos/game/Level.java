package com.example.phobos.game;

import com.example.phobos.game.engine.GameLoop;
import com.example.phobos.game.engine.GameView;
import com.example.phobos.game.objects.Entity;

import java.util.ArrayList;
import java.util.List;

public class Level {

    GameView gameView;
    GameLoop gameLoop;

    private List<Entity> entities = new ArrayList<>();

    public Level() {
        gameView = new GameView();
        gameLoop = new GameLoop(this);
    }

    public void start() {
        gameLoop.start();
    }

    public void update() {
        for (Entity entity:entities) {
            entity.update();
        }
    }

    public void render() {
        for (Entity entity:entities) {
            entity.render(gameView.getGraphicsContext2D());
        }
    }

    /*
    *  DTO
    * */

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public GameView getGameView() {
        return gameView;
    }

}
