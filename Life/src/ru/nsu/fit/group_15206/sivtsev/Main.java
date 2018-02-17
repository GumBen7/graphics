package ru.nsu.fit.group_15206.sivtsev;

import ru.nsu.fit.group_15206.sivtsev.controller.Controller;

public class Main {
    public static void main(String args[]) {
        Controller controller = new Controller(4,5);
        controller.init(3);
    }
}
