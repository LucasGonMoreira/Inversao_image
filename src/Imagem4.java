import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Imagem4 {
    public static void main(String[] args) throws IOException {

        String img = "src\\ImagePath\\Imagem4.jpg";
        BufferedImage imagem = ImageIO.read(new File(img));

        int width = imagem.getWidth();
        int height = imagem.getHeight();

        BufferedImage imagemNova = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        for (int largura=0; largura<width; largura++){
            for (int altura=0; altura<height; altura++){

                int rgb = imagem.getRGB(largura,altura);

                Color cor = new Color(rgb);

                int green = 255-cor.getGreen();
                int red = 255-cor.getRed();
                int blue = 255-cor.getBlue();

                Color corNova = new Color(green,red,blue);

                imagemNova.setRGB(largura,altura,corNova.getRGB());

            }
        }
        ImageIO.write(imagemNova, "png",new File("src\\ImagePath\\Imagem4_nova.png"));
    }
}
