package org.example;

import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {

    private final int row;
    private final int column;
    private final boolean isBlackCell;
    private Figure figure;
    public Cell(int row, int column){
        super();
        this.row = row;
        this.column = column;
        this.setBackground(Color.white);
        isBlackCell = row == 2 && column == 2 || row == 2 && column == 5 || row == 5 && column == 2 || row == 5 && column == 5;
        if(isBlackCell){
            this.setBackground(Color.black);
        }
        this.setBorder(BorderFactory.createLineBorder(Color.black));


    }

    public boolean isBlackCell(){
        return isBlackCell;
    }
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void deleteFigure(){
        this.remove(figure);
        figure = null;
    }
    public void addFigure(Figure figure){
        this.add(figure);
        this.figure = figure;
    }
    public Figure getFigure(){
        return figure;
    }
}
