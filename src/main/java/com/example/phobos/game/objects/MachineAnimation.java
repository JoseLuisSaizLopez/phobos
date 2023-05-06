package com.example.phobos.game.objects;

import javafx.scene.image.Image;

import java.util.List;

public class MachineAnimation {

    List<Sprite> sprites;
    int currentSprite = 0;
    int delayMillis;
    boolean isLoop;
    boolean isFinished = false;

    public MachineAnimation(List<Sprite> sprites, int delayMillis, boolean isLoop) {
        this.sprites = sprites;
        this.delayMillis = delayMillis;
        this.isLoop = isLoop;
    }


    public void update() {
        if (currentSprite<sprites.size()) {
            currentSprite++;
        } else if (isLoop) {
            currentSprite = 0;
        } else {
            isFinished = true;
        }
    }

    public Image getSpriteShot() {
        return sprites.get(currentSprite).image;
    }

}
