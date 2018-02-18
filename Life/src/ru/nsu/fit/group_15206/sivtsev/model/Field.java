package ru.nsu.fit.group_15206.sivtsev.model;


import java.util.Vector;

public class Field {
    private Vector<Vector<Cell>> cellVector;

    public Field(int x, int y){
        cellVector = new Vector<>();
        for (int i = 0; i < y; ++i){
            Vector<Cell> vectorRow = new Vector<>();
            int realX = (cellVector.indexOf(vectorRow) % 2 == 0) ? x-1 : x;
            for (int j = 0; j < realX; ++j){
                vectorRow.add(new Cell());
            }
            cellVector.add(vectorRow);
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
