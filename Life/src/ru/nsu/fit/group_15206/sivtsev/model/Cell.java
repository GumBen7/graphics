package ru.nsu.fit.group_15206.sivtsev.model;

public class Cell {
    private boolean isAlive;

    public Cell(){
        isAlive = false;
    }
    public Cell(boolean b){
        isAlive = b;
    }
    public boolean isAlive(){
        return isAlive;
    }
    public void invert(){
        isAlive = !isAlive;
    }
    public void setAlive(){
        isAlive = true;
    }
    public void setDead(){
        isAlive = false;
    }
    public void setStatus(boolean b){
        isAlive = b;
    }
}
