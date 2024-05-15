package org.example;

import javax.swing.*;
import java.net.URL;

public class Figure extends JLabel {
    enum COLOR{ GOLD , SILVER}
    private final int power;
    private final COLOR color;


    private static String[] listFileName = {"Rabbit","Cat", "Dog","Horse", "Camel", "Elephant"};
    public Figure(int power, COLOR color) {
        this.power = power;
        this.color = color;

        String fileName = listFileName[power - 1]+ (color == COLOR.GOLD ? 1 : 2) + ".jpg";
        ClassLoader classLoader = getClass().getClassLoader();
        URL fileURL = classLoader.getResource(fileName);
        this.setIcon(new ImageIcon(fileURL));

    }

    public int getPower(){
        return power;
    }






 }
