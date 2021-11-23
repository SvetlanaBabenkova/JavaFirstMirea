package ru.mirea.task8.var2;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Picture extends JFrame{

        private JLabel pictureLabel;
        private Container controls;

        public Picture() {
            super("picture");
            setResizable(false);
            setLocationRelativeTo(null);
            this.setSize(400, 300);
            this.startPicture();

        }

        private void startPicture() {
            controls = new Container();
            controls = getContentPane();
            controls.setLayout(new FlowLayout());
            pictureLabel = new JLabel(new ImageIcon("C:\\Users\\Xiaomi\\OneDrive\\Изображения\\Saved Pictures\\lisa.jpg"));
            controls.add(pictureLabel);
        }
    }
