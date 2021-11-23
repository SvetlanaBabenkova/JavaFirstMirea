package ru.mirea.task8.var2;

import javax.swing.*;

public class TestPicture {

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Picture a = new Picture();
                    a.setVisible(true);
                    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                }
            });
        }
    }
