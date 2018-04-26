package fp.utiles;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Imagenes {
	
	/**
	 * Muestra una ventana de di�logo con el t�tulo y la imagen indicadas mediante los par�metros.
	 * @param titulo T�tulo de la ventana 
	 * @param url URL de la imagen a mostrar
	 */
	public static void show(String titulo, String url) {
		try {
			BufferedImage img = ImageIO.read(new URL(url));
			JOptionPane.showMessageDialog(null, new JLabel(new ImageIcon(img)), titulo, 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
