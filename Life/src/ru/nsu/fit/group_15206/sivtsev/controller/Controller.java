package ru.nsu.fit.group_15206.sivtsev.controller;

import ru.nsu.fit.group_15206.sivtsev.model.Field;
import ru.nsu.fit.group_15206.sivtsev.model.Life;
import ru.nsu.fit.group_15206.sivtsev.view.View;

public class Controller {
    private Life life;
    private Field field;
    private View view;

    public Controller(Config config, View view) {
        field = new Field(config.m, config.n);
        life = new Life(field);
        life.setDefaultSettings();
    }

    public void init(int n){
        playLife(n);
    }

    public void playLife(int n) {
        for (int i = 0; i < n; ++i){
            life.setField(life.step());
        }
    }

}
