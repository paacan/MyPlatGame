package main;

import javax.swing.*;

public class WindowForGame {
    private JFrame jFrame;


    public WindowForGame(GamePanel gamePanel) {
        JFrame jframe = new JFrame();
        jframe.setSize(400,400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);


    }
}
