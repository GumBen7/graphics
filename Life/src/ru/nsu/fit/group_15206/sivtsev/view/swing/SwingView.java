package ru.nsu.fit.group_15206.sivtsev.view.swing;

import ru.nsu.fit.group_15206.sivtsev.controller.Config;
import ru.nsu.fit.group_15206.sivtsev.model.Field;
import ru.nsu.fit.group_15206.sivtsev.view.View;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class SwingView extends JPanel implements View{
    private BufferedImage image;
    public SwingView(Config config){
        image = new BufferedImage(config.m*config.k, config.n*config.k, BufferedImage.TYPE_INT_ARGB);//исправь потом
    }
    public void paint(Graphics g){
        g.drawImage(image, 0,0, this);
    }
    @Override
    public void showField(Field f) {
        paint(getGraphics());
    }


}
