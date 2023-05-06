package com.example.phobos.build;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class BuildController {

    @FXML
    private GridPane gamePane;

    @FXML
    private Button mapSettings;

    @FXML
    protected void initialize() {
        addGridCells(50, 50);
        mapSettings.setOnAction(actionEvent -> showMapSettings());
    }

    private void showMapSettings() {

    }

    private void addGridCells(int width, int height) {
        gamePane.setHgap(0); // separación horizontal entre celdas
        gamePane.setVgap(0); // separación vertical entre celdas

        // Definir las columnas
        for (int i = 0; i < width; i++) {
            ColumnConstraints column = new ColumnConstraints(50);
            gamePane.getColumnConstraints().add(column);
        }

        // Definir las filas
        for (int i = 0; i < height; i++) {
            RowConstraints row = new RowConstraints(50);
            gamePane.getRowConstraints().add(row);
        }
    }


}