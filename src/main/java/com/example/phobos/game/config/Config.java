package com.example.phobos.game.config;

import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;

import java.util.List;

public class Config {


    public static List<Screen> getScreens() {
        return Screen.getScreens();
    }

    public static int[] getScreenSize(Screen screen) {
        Rectangle2D size = screen.getBounds();
        return new int[]{(int) size.getWidth(), (int) size.getHeight()};
    }


}
