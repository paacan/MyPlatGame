package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInputs implements KeyListener {
    private GamePanel gamePanel;

    public KeyInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {

            case KeyEvent.VK_A:
                System.out.println("это а");
                gamePanel.changeXDelta(-5);
                break;
            case KeyEvent.VK_S:
                System.out.println("это с");
                gamePanel.changeYDelta(+5);
                break;
            case KeyEvent.VK_D:
                System.out.println("это д");
                gamePanel.changeXDelta(+5);
                break;
            case KeyEvent.VK_W:
                System.out.println("это в");
                gamePanel.changeYDelta(-5);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
