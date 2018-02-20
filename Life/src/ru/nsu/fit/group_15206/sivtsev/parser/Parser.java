package ru.nsu.fit.group_15206.sivtsev.parser;

import ru.nsu.fit.group_15206.sivtsev.controller.Config;

import java.io.Reader;
import java.util.Vector;

public abstract class Parser {
    public static Config parseFromReader(Reader reader){
        Config config = new Config();
        config.m = 4; config.n = 5;
        config.w = 1;
        config.k = 5;
        config.all = 2;
        config.coords = new Vector<>();
        int[] xy = {1,2}, xy2 = {2,3};
        config.coords.add(xy); config.coords.add(xy2);
        return config;
    }
}
