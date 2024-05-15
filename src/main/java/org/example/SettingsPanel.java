package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsPanel extends JPanel {

    public SettingsPanel(ArimaaMainMenu parentFrame2, ActionListener runnable) {
        super(new FlowLayout(FlowLayout.CENTER));
        JPanel childPanel5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel childPanel6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel childPanel7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel childPanel8 = new JPanel(new FlowLayout((FlowLayout.CENTER)));

        this.setLayout(new GridLayout(4, 1));

        JButton musicButton = new JButton("Music");
        musicButton.setPreferredSize(new Dimension(600, 200));
        musicButton.addActionListener(e -> {
            parentFrame2.getContentPane().removeAll();
            parentFrame2.getContentPane().add(new ArimaaBoard(parentFrame2));
            parentFrame2.revalidate();
        });
        JButton sizeButton= new JButton("Size");
        sizeButton.setPreferredSize(new Dimension(600, 200));
        sizeButton.addActionListener(e -> {
            parentFrame2.getContentPane().removeAll();
            parentFrame2.getContentPane().add(new ArimaaBoard(parentFrame2));
            parentFrame2.revalidate();
        });
        JButton highscoreButton = new JButton("Highscore");
        highscoreButton.setPreferredSize(new Dimension(600, 200));
        highscoreButton.addActionListener(e -> {
            parentFrame2.getContentPane().removeAll();
            parentFrame2.getContentPane().add(new ArimaaBoard(parentFrame2));
            parentFrame2.revalidate();
        });
        JButton backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(600, 200));
        backButton.addActionListener(runnable);
        this.add(childPanel5);
        this.add(childPanel6);
        this.add(childPanel7);
        this.add(childPanel8);
        childPanel5.add(musicButton, BorderLayout.NORTH);
        childPanel6.add(sizeButton, BorderLayout.CENTER);
        childPanel7.add(highscoreButton, BorderLayout.SOUTH);
        childPanel8.add(backButton,BorderLayout.SOUTH);
    }
}
