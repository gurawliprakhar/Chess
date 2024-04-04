package pieces;

import Chess.Board;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Knight extends Pieces {
    public Knight(Board board, int columns, int rows, boolean isWhite) {
        super(board);
        this.columns = columns;
        this.rows = rows;
        this.xPos = columns * board.tileSize;
        this.yPos = rows * board.tileSize;

        this.isWhite = isWhite;
        this.name = "knight";

        if (sheet != null && sheetScale > 0) {
            // Get the subimage
            BufferedImage subImage = sheet.getSubimage(3 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale);

            // Create a new BufferedImage for scaled instance
            this.sprite = new BufferedImage(sheetScale, sheetScale, BufferedImage.TYPE_INT_ARGB);

            // Draw the subimage onto the new BufferedImage
            Graphics2D g2d = this.sprite.createGraphics();
            g2d.drawImage(subImage, 0, 0, sheetScale, sheetScale, null);
            g2d.dispose();
        } else {
            System.out.println("Sheet or sheetScale is null or invalid. Please make sure the image sheet is loaded properly and sheetScale is greater than 0.");
        }
    }
}
