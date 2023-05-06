package com.example.phobos.game.engine;

import com.example.phobos.game.config.Config;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Paint;
import javafx.stage.Screen;

public class GameView extends Canvas {

    private static int[] screenSize = Config.getScreenSize(Config.getScreens().get(0));

    public GameView() {
        super(screenSize[0], screenSize[1]);
    }



}
