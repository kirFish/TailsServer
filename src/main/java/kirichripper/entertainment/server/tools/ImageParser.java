package kirichripper.entertainment.server.tools;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class ImageParser {


    public static byte[] toByteArray(String path) throws IOException {

        BufferedImage image = ImageIO.read(new File(path));
        Base64.Encoder enc = Base64.getEncoder();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        ImageIO.write(image, "jpg", outputStream);

        return enc.encode(outputStream.toByteArray());
    }
}


