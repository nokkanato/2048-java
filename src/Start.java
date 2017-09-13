import javax.swing.*;
import java.awt.*;

public class Start {
    public static void main(String[] args){
        GameFrame frame = new GameFrame("2048 the game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        frame.add(panel);

    }
}
