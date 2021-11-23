package ru.mirea.task9.var1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame
{
    Font font = new Font("Match result", Font.BOLD, 20);

    private int milan = 0;
    private int madrid = 0;
    private String teamName = "DRAW";

    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");

    JLabel result = new JLabel();
    JLabel lastScorer = new JLabel();
    JLabel winner = new JLabel();

    String resultLine = "Result: " + milan + " X " + madrid;
    String scorerInfo = "Last Scorer: N/A";
    String winnerInfo = "Winner: " + teamName;


    public Main()
    {
        JFrame frame = getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        milanButton.setBounds(50,250,150,100);
        milanButton.addActionListener(new ChangeMilanInfo());
        panel.add(milanButton, BorderLayout.WEST);

        madridButton.setBounds(200,250,150,100);
        madridButton.addActionListener(new ChangeMadridInfo());
        panel.add(madridButton, BorderLayout.EAST);

        result.setFont(font);
        result.setText(resultLine);
        result.setBounds(150, 20, 300, 100);
        panel.add(result, BorderLayout.CENTER);

        lastScorer.setFont(font);
        lastScorer.setText(scorerInfo);
        lastScorer.setBounds(150, 100, 300, 100);
        panel.add(lastScorer, BorderLayout.CENTER);

        winner.setFont(font);
        winner.setText(winnerInfo);
        winner.setBounds(150, 150, 300, 100);
        panel.add(winner, BorderLayout.CENTER);
    }

    private class ChangeMilanInfo implements ActionListener
    {


        public void actionPerformed(ActionEvent e) {
            milan++;
            resultLine = "Result: " + milan + " X " + madrid;
            result.setText(resultLine);

            if (milan > madrid)
                winnerInfo = "Winner: " + "Milan";
            else if(milan < madrid)
                winnerInfo = "Winner: " + "Madrid";
            else
                winnerInfo = "Winner: " + "draw";

            winner.setText(winnerInfo);

            teamName = "Milan";
            scorerInfo = "Last Scorer: " + teamName;
            lastScorer.setText(scorerInfo);
        }
    }

    private class ChangeMadridInfo implements ActionListener
    {

        public void actionPerformed(ActionEvent e) {
            madrid++;
            resultLine = "Result: " + milan + " X " + madrid;
            result.setText(resultLine);

            if (milan > madrid)
                winnerInfo = "Winner: " + "Milan";
            else if(milan < madrid)
                winnerInfo = "Winner: " + "Madrid";
            else
                winnerInfo = "Winner: " + "draw";

            winner.setText(winnerInfo);

            teamName = "Madrid";
            scorerInfo = "Last Scorer: " + teamName;
            lastScorer.setText(scorerInfo);
        }
    }

    static JFrame getFrame()
    {
        JFrame frame = new JFrame("Match result") {};
        frame.setVisible(true);
        frame.setBounds(250, 100, 440, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public static void main(String[]args)
    {
        new Main();
    }
}
