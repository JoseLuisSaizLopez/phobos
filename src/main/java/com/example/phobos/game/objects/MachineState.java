package com.example.phobos.game.objects;

import javafx.animation.Animation;

public class MachineState {

    public String name;

    public MachineAnimation animation;

    public MachineState(String name, MachineAnimation animation) {
        this.name = name;
        this.animation = animation;
    }


}
