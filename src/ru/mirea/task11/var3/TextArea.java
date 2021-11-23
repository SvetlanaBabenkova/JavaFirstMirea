package ru.mirea.task11.var3;

import javax.swing.*;
import java.awt.*;

public class TextArea extends JFrame {

    private TextArea(){
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea ta = new JTextArea();
        ta.setFont(new Font("Times New Roman", Font.PLAIN, 14));

        String[] colors = {"Black", "Green", "Pink"};
        JComboBox<String> cols = new JComboBox<>(colors);
        cols.setSelectedIndex(0);

        String[] f = {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fonts = new JComboBox<>(f);
        fonts.setSelectedIndex(0);

        fonts.addItemListener(e -> ta.setFont(new Font(f[fonts.getSelectedIndex()], Font.PLAIN, 14)));

        cols.addItemListener(e -> {
            Color c;
            switch (cols.getSelectedIndex()){
                case 1:
                    c = Color.GREEN;
                    break;
                case 2:
                    c = Color.PINK;
                    break;
                default: c = Color.BLACK;
            }
            ta.setForeground(c);
        });

        getContentPane().add(cols, BorderLayout.NORTH);
        getContentPane().add(fonts, BorderLayout.SOUTH);
        getContentPane().add(ta);

    }

    public static void main(String[] args) {
        new TextArea().setVisible(true);
    }
}