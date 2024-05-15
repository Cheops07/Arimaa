package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

public class ArimaaBoard extends JPanel {
    private HashMap<Point, Cell> cells;


    public ArimaaBoard(ArimaaMainMenu parentFrame) {
        super(new GridLayout(8, 8));
        cells = new HashMap<>();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                int cellWidth = getWidth() / 8;
                int cellHeight = getHeight() / 8;

                int column = x / cellWidth;
                int row = y / cellHeight;

                Cell clickedCell = cells.get(new Point(row, column));

                if (clickedCell != null && clickedCell.isBlackCell()) {
                    System.out.println("Черная ячейка");
                } else {
                    System.out.println("Белая ячейка");
                    if(clickedCell.getFigure() != null){
                        System.out.println(clickedCell.getFigure().getPower());
                    }
                }

            }
        });

        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                Cell cell = new Cell(row, column);
                if(row == 1 || row == 6) {
                    Figure figure = new Figure(1, Figure.COLOR.GOLD);
                    cell.addFigure(figure);
                }
                this.add(cell);
                cells.put(new Point(row, column), cell);
            }
        }
    }
}
