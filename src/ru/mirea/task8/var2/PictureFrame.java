package ru.mirea.task8.var2;

import javax.swing.JFrame;

class PictureFrame extends JFrame {
    public PictureFrame(){
        setTitle("ImageTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        Picture component = new Picture();
        add(component);

    }

    public static final int DEFAULT_WIDTH = 1000;
    public static final int DEFAULT_HEIGHT = 600;
}

