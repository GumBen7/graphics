package ru.nsu.fit.group_15206.sivtsev.view.swing;


import javax.swing.*;

public class MainFrame extends JFrame{

    public MainFrame(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (Exception e){
        }
    }

    public MainFrame(int x, int y, String title){
        this();
        setSize(x,y);
        setLocationByPlatform(true);
        setTitle(title);
    }
}
