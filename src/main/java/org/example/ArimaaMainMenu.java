package org.example;


import javax.swing.*;
import java.awt.*;

public class ArimaaMainMenu extends JFrame {

    private GamePanel gamePanel;
    private SettingsPanel settingsPanel;
    private JPanel mainMenu;
    public ArimaaMainMenu() {
        gamePanel = new GamePanel(this, e -> {showMainMenu();});
        settingsPanel = new SettingsPanel(this, e -> {showMainMenu();});
        initUI();


    }

    public void initUI() {
        setTitle("Arimaa Main Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        mainMenu= new JPanel();
        mainMenu.setLayout(new GridLayout(3, 1));

        JButton playButton = new JButton("Play");
        playButton.addActionListener(e -> showGameModeSelectionUI());

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));

        JButton settingsButton = new JButton("Settings");
        settingsButton.addActionListener(e -> showGameSettingUI());

        mainMenu.add(playButton);
        mainMenu.add(settingsButton);
        mainMenu.add(exitButton);

        getContentPane().add(mainMenu);

        int size = 600;
        setSize(size, size);

        setLocationRelativeTo(null);
    }

    private void showGameModeSelectionUI() {
        getContentPane().removeAll();

        getContentPane().add(gamePanel);

        revalidate();
        repaint();
    }
    private void showGameSettingUI() {
        getContentPane().removeAll();

        getContentPane().add(settingsPanel);

        revalidate();
        repaint();
    }
    public void showMainMenu() {
        getContentPane().removeAll();

        getContentPane().add(mainMenu);

        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ArimaaMainMenu mainMenu = new ArimaaMainMenu();
            mainMenu.setVisible(true);
        });
    }
}