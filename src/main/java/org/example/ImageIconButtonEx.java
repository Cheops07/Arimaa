package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageIconButtonEx extends JFrame {
    private JLabel label;
    private JTextField textField;
    public ImageIconButtonEx() {
        initUI();
    }

    private void initUI() {
        label = new JLabel("Hello");
        textField = new JTextField();

        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(textField.getText());
            }
        });
        JButton quitBtn = new JButton("Quit");
        JButton saveBtn = new JButton("saveIcon");
        JButton homeBtn = new JButton("Home");
        quitBtn.addActionListener((e) -> {
                    System.exit(0);
                }
        );
        saveBtn.addActionListener((e) -> {
                    recreateLayout(quitBtn);
                }
        );
        homeBtn.addActionListener(e -> {
            label.setText("");
            textField.setText("");
        });
        createLayout(quitBtn, saveBtn, homeBtn, label, textField);

        setTitle("JButtons");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void recreateLayout(JButton button){

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);


        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(button)
        );

        gl.setVerticalGroup(gl.createParallelGroup()
                .addComponent(button)
        );

        gl.linkSize(button);

        pack();
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                .addComponent(arg[2])
                .addComponent(arg[3])
                .addComponent(arg[4])
        );

        gl.setVerticalGroup(gl.createParallelGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                .addComponent(arg[2])
                .addComponent(arg[3])
                .addComponent(arg[4])
        );

        gl.linkSize(arg[0], arg[1], arg[2], arg[3] , arg[4]);

        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new ImageIconButtonEx();
            ex.setVisible(true);
        });
    }
}