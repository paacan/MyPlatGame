package main;

public class Game {

    private WindowForGame windowForGame;
    private GamePanel gamePanel;

    public Game() {
        gamePanel = new GamePanel();
        windowForGame = new WindowForGame(gamePanel);
        gamePanel.requestFocus();

    }
}
