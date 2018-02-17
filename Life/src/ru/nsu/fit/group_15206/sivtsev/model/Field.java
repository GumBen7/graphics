package ru.nsu.fit.group_15206.sivtsev.model;

import ru.nsu.fit.group_15206.sivtsev.controller.Controller;

import java.util.Map;
import java.util.Vector;

public class Field {
    private Vector<Vector<Cell>> cellVector;
    private int[][] firstPos = {{-1, -1,},
                                {-1, 0},
                                {0, -1},
                                {0, 1},
                                {1, -1},
                                {1, 0}};
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

    public int getFirstAmount(int x, int y){

        return 0;
    }

    public double getImpact(int x, int y) {
        return (Controller.getFstImpact() + Controller.getSndImpact());
    }
}
