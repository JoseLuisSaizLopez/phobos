package com.example.phobos.game.engine;

import com.example.phobos.game.Level;

public class GameLoop extends Thread {

    Level level;

    public GameLoop(Level level) {
        this.level = level;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            level.update();
            level.render();
            try {Thread.sleep(50);} catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}
