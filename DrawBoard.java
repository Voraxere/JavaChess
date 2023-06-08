import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawBoard extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess");
        Canvas canvas = new DrawBoard();
        canvas.setSize(845, 845);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
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

    }
}
