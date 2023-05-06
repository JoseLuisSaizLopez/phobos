package com.example.phobos.game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCharacterCombination;
import javafx.stage.Stage;

public class GameInit extends Application {

    @Override
    public void start(Stage stage) {
        Level level = new Level();
        loadLevel(level);
        Group root = new Group();
        root.getChildren().add(level.getGameView());
        stage.setScene(new Scene(root));
        stage.setTitle("Dune");
        stage.setFullScreenExitKeyCombination(KeyCharacterCombination.NO_MATCH);
        stage.setFullScreen(true);
        stage.show();
        level.start();
    }

    private void loadLevel(Level level) {

    }


}
