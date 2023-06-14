import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageHandling {
    public static Image bPawn;
    public static Image wPawn;

    public static Image loadImage(String path) {
        Image image = null;
        try {
            image = ImageIO.read(ImageHandling.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}