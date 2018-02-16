package ru.nsu.fit.group_15206.sivtsev.controller;

import ru.nsu.fit.group_15206.sivtsev.model.Field;

public class Controller {
    private Field field;

    public Controller(int x, int y){
        field = new Field(x,y);
    }
}
