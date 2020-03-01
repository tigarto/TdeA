//Dada la longitud y ancho de un rectangulo, este programa Java
//determina su area y perimetro.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleProgram extends JFrame {

    private JLabel longitudL, anchoL, areaL, perimetroL;
    private JTextField longitudTF, anchoTF, areaTF, perimetroTF;
    private JButton calculateB, exitB;
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    public RectangleProgram() {
        //Crea las cuatro etiquetas
        longitudL = new JLabel("Introduzca la longitud: ", SwingConstants.RIGHT);
        anchoL = new JLabel("Introduzca el ancho: ",SwingConstants.RIGHT);
        areaL = new JLabel("Area: ", SwingConstants.RIGHT );
        perimetroL = new JLabel("Perimetro: ",SwingConstants.RIGHT);

        //Crea los cuatro campos de texto
        longitudTF = new JTextField(10);
        anchoTF = new JTextField(10);
        areaTF = new JTextField(10);
        perimetroTF = new JTextField(10);
        
        //Crea el boton Calcular
        calculateB = new JButton("Calcular");
        cbHandler = new CalculateButtonHandler();
        calculateB.addActionListener(cbHandler);
        
        //Crea el boton Salir
        exitB = new JButton("Salir");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);

        //Establece el titulo de la ventana
        setTitle("Area y perimetro de un rectangulo");

        //Se obtiene el contenedor
        Container pane = getContentPane();

        //Se establece el diseño
        pane.setLayout(new GridLayout(5, 2));
        
        //Coloca los componentes en el panel
        pane.add(longitudL);
        pane.add(longitudTF);
        pane.add(anchoL);
        pane.add(anchoTF);
        pane.add(areaL);
        pane.add(areaTF);
        pane.add(perimetroL);
        pane.add(perimetroTF);
        pane.add(calculateB);
        pane.add(exitB);

        //Establece el tamaño de la ventana y la despliega
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class CalculateButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double ancho, longitud, area, perimetro;
            longitud = Double.parseDouble(longitudTF.getText());
            ancho = Double.parseDouble(anchoTF.getText());
            area = longitud * ancho;
            perimetro = 2 * (longitud + ancho);
            areaTF.setText("" + area);
            perimetroTF.setText("" + perimetro);
        }
    }

    private class ExitButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        RectangleProgram rectObject = new RectangleProgram();
    }
}
