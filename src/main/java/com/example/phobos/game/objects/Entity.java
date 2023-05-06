package com.example.phobos.game.objects;

import javafx.scene.canvas.GraphicsContext;

public abstract class Entity {

    public int posX, posY;

    public Entity(int x, int y) {
        posX = x;
        posY = y;
    }

    public void update() {}

    public void render(GraphicsContext graphics) {}


}
