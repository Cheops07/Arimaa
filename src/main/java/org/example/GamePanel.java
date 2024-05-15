package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {

    public GamePanel(ArimaaMainMenu parentFrame, ActionListener runnable) {
        super(new FlowLayout(FlowLayout.CENTER));
        JPanel childPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel childPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel childPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel childPanel4 = new JPanel(new FlowLayout((FlowLayout.CENTER)));

        this.setLayout(new GridLayout(4, 1));

        JButton hotseatButton = new JButton("Hot Seat");
        hotseatButton.setPreferredSize(new Dimension(600, 200));
        hotseatButton.addActionListener(e -> {
            parentFrame.getContentPane().removeAll();
            parentFrame.getContentPane().add(new ArimaaBoard(parentFrame));
            parentFrame.revalidate();
        });
        JButton onlineButton = new JButton("Online");
        onlineButton.setPreferredSize(new Dimension(600,200));
        onlineButton.addActionListener(e -> {
            parentFrame.getContentPane().removeAll();
            parentFrame.getContentPane().add(new ArimaaBoard(parentFrame));
            parentFrame.revalidate();
        });
        JButton aiButton = new JButton("Against AI");
        aiButton.setPreferredSize(new Dimension(600,200));
        aiButton.addActionListener(e -> {
            parentFrame.getContentPane().removeAll();
            parentFrame.getContentPane().add(new ArimaaBoard(parentFrame));
            parentFrame.revalidate();
        });
        JButton backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(600, 200));
        backButton.addActionListener(runnable
        );
        this.add(childPanel1);
        this.add(childPanel2);
        this.add(childPanel3);
        this.add(childPanel4);
        childPanel1.add(hotseatButton, BorderLayout.NORTH);
        childPanel2.add(onlineButton, BorderLayout.CENTER);
        childPanel3.add(aiButton, BorderLayout.SOUTH);
        childPanel4.add(backButton,BorderLayout.SOUTH);
    }
}

