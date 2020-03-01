// Programa Java para crear una ventana y colocar cuatro etiquetas

import javax.swing.*;
import java.awt.*;

public class RectangleProgramTwo extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGTH = 300;
    private JLabel longitudL, anchoL, areaL, perimetroL;

    public RectangleProgramTwo() {
        setTitle("Area y perimetro de un rectangulo");
        longitudL = new JLabel("Introduzca la longitud: ", SwingConstants.RIGHT);
        anchoL = new JLabel("Introduzca el ancho: ", SwingConstants.RIGHT);
        areaL = new JLabel("Area: ", SwingConstants.RIGHT);
        perimetroL = new JLabel("Perimetro: ", SwingConstants.RIGHT);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 1));
        pane.add(longitudL);
        pane.add(anchoL);
        pane.add(areaL);
        pane.add(perimetroL);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        RectangleProgramTwo rectObject = new RectangleProgramTwo();
    }
}
