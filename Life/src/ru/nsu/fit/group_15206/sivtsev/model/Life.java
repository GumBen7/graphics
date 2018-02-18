package ru.nsu.fit.group_15206.sivtsev.model;

import java.util.Vector;

public class Life {

    private Field field;

    private double LIVE_BEGIN;
    private double LIVE_END;
    private double BIRTH_BEGIN;
    private double BIRTH_END;
    private double FST_IMPACT;
    private double SND_IMPACT;

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

    public void setDefaultSettings() {
        LIVE_BEGIN = 2.;
        LIVE_END = 3.3;
        BIRTH_BEGIN = 2.3;
        BIRTH_END = 2.9;
        FST_IMPACT = 1.;
        SND_IMPACT = 0.3;
    }
    public double getLiveBegin() {
        return LIVE_BEGIN;
    }
    public void setLiveBegin(double liveBegin) {
        LIVE_BEGIN = liveBegin;
    }
    public double getLiveEnd() {
        return LIVE_END;
    }
    public void setLiveEnd(double liveEnd) {
        LIVE_END = liveEnd;
    }
    public double getBirthBegin() {
        return BIRTH_BEGIN;
    }
    public void setBirthBegin(double birthBegin) {
        BIRTH_BEGIN = birthBegin;
    }
    public double getBirthEnd() {
        return BIRTH_END;
    }
    public void setBirthEnd(double birthEnd) {
        BIRTH_END = birthEnd;
    }
    public double getFstImpact() {
        return FST_IMPACT;
    }
    public void setFstImpact(double fstImpact) {
        FST_IMPACT = fstImpact;
    }
    public double getSndImpact() {
        return SND_IMPACT;
    }
    public void setSndImpact(double sndImpact) {
        SND_IMPACT = sndImpact;
    }

    public Life(Field f){
        field = f;
    }

    public void setField(Field f){
        field = f;
    }

    public Field step(){
        Field f = new Field(field.getWidth(), field.getHeight());
        for (int i = 0; i < field.getHeight(); ++i){
            int realXSize = (i % 2 == 0) ? field.getWidth() - 1 : field.getWidth();
            for (int j = 0; j < realXSize; ++j){
                if (field.getCellStatus(j,i)){
                    if (getImpact(j,i) >= LIVE_BEGIN && getImpact(j,i) <= LIVE_END){
                        f.setCellAlive(j,i);
                    }
                }
                if (getImpact(j,i) > BIRTH_BEGIN && getImpact(j,i) < BIRTH_END){
                    f.setCellAlive(j,i);
                }
            }
        }
        return f;
    }

    public int getAliveNeighborsOfLevel(int x, int y, int[][] pos){
        int s = 0;
        for (int[] coord : pos){
            if (x+coord[0]>0 && x+coord[0]<field.getWidth()-1 && y+coord[1]>0 && y+coord[1]<field.getHeight()-1 && field.getCellStatus(x+coord[0],y+coord[1])){
                ++s;
            }
        }
        return s;
    }


    public double getImpact(int x, int y) {
        return (FST_IMPACT*getAliveNeighborsOfLevel(x,y,firstLevel) + SND_IMPACT*getAliveNeighborsOfLevel(x,y,secondLevel));
    }
}
