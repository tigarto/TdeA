//Programa Java para crear una ventana.

import javax.swing.*;

public class RectangleProgramOne extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    public RectangleProgramOne() {
        setTitle("Area y perimetro de un rectangulo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        RectangleProgramOne rectProg = new RectangleProgramOne();
    }
}
