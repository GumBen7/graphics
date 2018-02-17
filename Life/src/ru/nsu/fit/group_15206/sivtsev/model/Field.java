package ru.nsu.fit.group_15206.sivtsev.model;


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

    public int getHeight(){
        return cellVector.size();
    }
    public int getWidth(){
        return cellVector.get(0).size();
    }

    public Vector<Vector<Cell>> getCellVector(){
        return cellVector;
    }

    public void setCellAlive(int x, int y){
        cellVector.get(y).get(x).setAlive();
    }
    public void setCellDead(int x, int y){
        cellVector.get(y).get(x).setDead();
    }

    public Cell getCell(int x, int y){
        return cellVector.get(y).get(x);
    }

    public boolean getCellStatus(int x, int y){
        return cellVector.get(y).get(x).isAlive();
    }


}
