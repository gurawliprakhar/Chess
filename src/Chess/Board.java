package Chess;
import pieces.Knight;
import pieces.Pieces;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {
    public int tileSize = 100;
    public int rows = 8;
    public int columns = 8;
    public Color lightColor = new Color(255, 206, 158);
    public Color darkColor = new Color(209, 139, 71);
    ArrayList<Pieces> pieceList = new ArrayList<>();
    public Board() {
        setPreferredSize(new Dimension(columns * tileSize, rows * tileSize));
    }
    public void addPiece(){
        pieceList.add(new Knight(this,2,0,false));
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
        for(Pieces piece : pieceList){
            piece.paint(g2d);
        }
    }
}