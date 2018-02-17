package ru.nsu.fit.group_15206.sivtsev.controller;

import ru.nsu.fit.group_15206.sivtsev.model.Field;

public class Controller {
    private Field field;

    private static double LIVE_BEGIN;
    private static double LIVE_END;
    private static double BIRTH_BEGIN;
    private static double BIRTH_END;
    private static double FST_IMPACT;
    private static double SND_IMPACT;

    public void setDefaultSettings() {
        LIVE_BEGIN = 2.;
        LIVE_END = 3.3;
        BIRTH_BEGIN = 2.3;
        BIRTH_END = 2.9;
        FST_IMPACT = 1.;
        SND_IMPACT = 0.3;
    }

    public static double getLiveBegin() {
        return LIVE_BEGIN;
    }

    public static void setLiveBegin(double liveBegin) {
        LIVE_BEGIN = liveBegin;
    }

    public static double getLiveEnd() {
        return LIVE_END;
    }

    public static void setLiveEnd(double liveEnd) {
        LIVE_END = liveEnd;
    }

    public static double getBirthBegin() {
        return BIRTH_BEGIN;
    }

    public static void setBirthBegin(double birthBegin) {
        BIRTH_BEGIN = birthBegin;
    }

    public static double getBirthEnd() {
        return BIRTH_END;
    }

    public static void setBirthEnd(double birthEnd) {
        BIRTH_END = birthEnd;
    }

    public static double getFstImpact() {
        return FST_IMPACT;
    }

    public static void setFstImpact(double fstImpact) {
        FST_IMPACT = fstImpact;
    }

    public static double getSndImpact() {
        return SND_IMPACT;
    }

    public static void setSndImpact(double sndImpact) {
        SND_IMPACT = sndImpact;
    }

    public Controller(int x, int y){
        field = new Field(x,y);
        setDefaultSettings();
    }




}
