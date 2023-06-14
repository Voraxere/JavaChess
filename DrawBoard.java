import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawBoard extends Canvas {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Chess");
    Canvas canvas = new DrawBoard();
    canvas.setSize(845, 845);
    frame.add(canvas);
    frame.pack();

    // Create a JPanel to display the image
    JPanel panel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
          BufferedImage image = ImageIO.read(
            new File("/home/pace/Downloads/chess-pieces-16x16-sprites/sprites/wpawn.png")
          );
          g.drawImage(image, 10, 10, null);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    };

    frame.add(panel);
    frame.setVisible(true);
  }

  public void paint(Graphics g) {
    g.setColor(Color.GRAY);
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (i % 2 == 0) {
          if (j % 2 == 0) {
            g.fillRect(i * 105 + 5, j * 105 + 5, 100, 100);
          }
        } else {
          if (j % 2 != 0) {
            g.fillRect(i * 105 + 5, j * 105 + 5, 100, 100);
          }
        }
      }
    }
  }
}
