package com.example.phobos.game.objects;

import javafx.scene.canvas.GraphicsContext;

public class GameObject extends Entity {

    GameModel model;
    int currentState;

    public GameObject(int spawnX, int spawnY, GameModel model) {
        super(spawnX, spawnY);
        this.model = model;
    }


    @Override
    public void update() {
        super.update();
        model.states.get(currentState).animation.update();
    }

    @Override
    public void render(GraphicsContext graphics) {
        super.render(graphics);
        graphics.drawImage(model.states.get(currentState).animation.getSpriteShot(), posX, posY);
    }
}
