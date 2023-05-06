module com.example.phobos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.phobos to javafx.fxml;
    exports com.example.phobos.game;
    exports com.example.phobos.build;
    opens com.example.phobos.build to javafx.fxml;
    exports com.example.phobos.game.config;
    exports com.example.phobos.game.objects;
    exports com.example.phobos.game.engine;
}