package ru.nsu.fit.group_15206.sivtsev.model;

import ru.nsu.fit.group_15206.sivtsev.controller.Controller;

import java.util.Vector;

public class Field {
    private Vector<Vector<Cell>> cellVector;

    public Field(int x, int y){
        cellVector = new Vector<>(y);
        for (Vector<Cell> vectorRow : cellVector){
            int realX = (cellVector.indexOf(vectorRow) % 2 == 0) ? x-1 : x;
            vectorRow = new Vector<>(realX);
            for (Cell newCell : vectorRow){
                newCell = new Cell();
            }
        }
    }

    public Cell getCell(int x, int y){
        return cellVector.get(y).get(x);
    }




}
