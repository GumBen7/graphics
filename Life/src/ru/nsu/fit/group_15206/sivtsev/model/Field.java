package ru.nsu.fit.group_15206.sivtsev.model;

import ru.nsu.fit.group_15206.sivtsev.controller.Controller;

import java.util.Vector;

public class Field {
    private Vector<Vector<Cell>> cellVector;
    private final int[][] firstLevel = {{-1, -1},
                                      {0, -1},
                                      {-1, 0},
                                      {1, 0},
                                      {-1, 1},
                                      {0, 1}};
    private final int[][] secondLevel = {{0, -2},
                                       {1, -1},
                                       {1, 1},
                                       {0, 2},
                                       {-2, -1},
                                       {-2, 1}};
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

    public int getAliveNeighborsOfLevel(int x, int y, int[][] pos){
        int s = 0;
        for (int[] coord : pos){
            if (this.getCell(x+coord[0],y+coord[1]).isAlive()){
                ++s;
            }
        }
        return s;
    }

    public double getImpact(int x, int y) {
        return (Controller.getFstImpact()*getAliveNeighborsOfLevel(x,y,firstLevel) + Controller.getSndImpact()*getAliveNeighborsOfLevel(x,y,secondLevel));
    }
}
