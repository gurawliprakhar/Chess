package Chess;

import javax.swing.*;
import java.awt.*;

public class Chess {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Chess");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Add chess icon
            ImageIcon chessIcon = new ImageIcon("chess_icon.png");
            frame.setIconImage(chessIcon.getImage());

            Board board = new Board();
            frame.add(board);

            // Set a fixed size for the JFrame
            frame.setSize(800, 800);

            // Center the JFrame on the screen
            frame.setLocationRelativeTo(null);

            frame.setVisible(true);
        });
    }
}
