package Chess;
import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    private int tileSize = 100;
    private int rows = 8;
    private int columns = 8;
    private Color lightColor = new Color(255, 206, 158);
    private Color darkColor = new Color(209, 139, 71);

    public Board() {
        setPreferredSize(new Dimension(columns * tileSize, rows * tileSize));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                Color color = (c + r) % 2 == 0 ? lightColor : darkColor;
                g2d.setColor(color);
                g2d.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);
            }
        }
    }
}