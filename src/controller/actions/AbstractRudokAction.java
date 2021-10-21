package controller.actions;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class AbstractRudokAction extends AbstractAction {
    public Icon loadIcon(String fileName){
        Icon ikonica = new ImageIcon(fileName);
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            System.err.println("Greska pri ucitavanju ikonice...");
        }
        Image scaleImage = img.getScaledInstance(32, 32,Image.SCALE_DEFAULT);

        return new ImageIcon(scaleImage);
    }

}
