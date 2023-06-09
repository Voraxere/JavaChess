import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import imagehandler.ImageHandling;


public class DrawBoard extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess");
        Canvas canvas = new DrawBoard();
        canvas.setSize(845, 845);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        // Initialize the black and white pawn images
        ImageHandling.bPawn = ImageHandling.loadImage("bpawn.png");
        ImageHandling.wPawn = ImageHandling.loadImage("wpawn.png");
    }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        for (int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if (i % 2 == 0){
                    if (j % 2 == 0){
                        g.fillRect(i*105+5, j*105+5, 100, 100);
                    }
                }
                else{
                    if (j % 2 != 0){
                        g.fillRect(i*105+5, j*105+5, 100, 100);
                    }
                }
            }
        }

        // Placing the pawns (display images of pawns)
        for (int i = 0; i < 8; i++){
            g.drawImage(ImageHandling.bPawn, i*105+5, 5, 100, 100, this);
            g.drawImage(ImageHandling.wPawn, i*105+5, 5+7*105, 100, 100, this);
        }

        // this isn't showing any pawns. Why could this be?
        g.drawImage(ImageHandling.bPawn, 5, 5, 100, 100, this);
    }
}
