package pieces;


import Chess.Board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Pieces {
    public int columns, rows;
    public int xPos, yPos;

    public boolean isWhite;
    public String name;
    public int value;

    BufferedImage sheet;

    public Pieces() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("/pieces.png");
            sheet = ImageIO.read(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected int sheetScale = sheet.getWidth()/6;
    BufferedImage sprite;
    Board board;

    public Pieces(Board board) {
        this.board = board;
    }
    public void paint(Graphics2D g2d){
       g2d.drawImage(sprite,xPos,yPos,null);
    }
}
