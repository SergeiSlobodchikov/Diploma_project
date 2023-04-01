package Details;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainClass extends JFrame {

    private JLabel imageLabel;

    public MainClass() {
        super("Отображение изображения");
        imageLabel = new JLabel();
        add(imageLabel, BorderLayout.CENTER);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void showImage(String imagePath) {
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            ImageIcon icon = new ImageIcon(image);
            imageLabel.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.showImage("8872ee86f671e161eee89ff65c2df9ae.jpeg");
    }
}