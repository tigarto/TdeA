//Programa Java para crear una ventana
//y colocar cuatro etiquetas y cuatro campos de texto

import javax.swing.*;
import java.awt.*;

public class RectangleProgramThree extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private JLabel longitudL, anchoL, areaL, perimetroL;
    private JTextField longitudTF, anchoTF, areaTF,
            perimetroTF;

    public RectangleProgramThree() {
        setTitle("Area y perimetro de un rectangulo");
        longitudL = new JLabel("Introduzca la longitud:", SwingConstants.RIGHT);
        anchoL = new JLabel("Introduzca el ancho:", SwingConstants.RIGHT);
        areaL  = new JLabel("Area: ", SwingConstants.RIGHT);
        perimetroL = new JLabel("Perimetro: ", SwingConstants.RIGHT);
        longitudTF = new JTextField(10);
        anchoTF = new JTextField(10);
        areaTF = new JTextField(10);
        perimetroTF = new JTextField(10);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 2));
        pane.add(longitudL);
        pane.add(longitudTF);
        pane.add(anchoL);
        pane.add(anchoTF);
        pane.add(areaL);
        pane.add(areaTF);
        pane.add(perimetroL);
        pane.add(perimetroTF);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        RectangleProgramThree rectObject
                = new RectangleProgramThree();
    }
}
