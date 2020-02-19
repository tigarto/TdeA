public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ensayo");
        Rectangulo A = new Rectangulo();
        A.setDimensiones(3, 2);
        System.out.println("Rectangulo A:");
        System.out.println("Base = " + A.getBase());
        System.out.println("Altura = " + A.getAltura());
        Rectangulo B = new Rectangulo();
        B.setBase(1);
        B.setAltura(6);
        System.out.println("Rectangulo B:");
        System.out.println("Base = " + B.getBase());
        System.out.println("Altura = " + B.getAltura());
        Rectangulo C = new Rectangulo();
        System.out.println("Rectangulo C:");
        System.out.println("Base = " + C.getBase());
        System.out.println("Altura = " + C.getAltura());
        C.setDimensiones(2, 2);
        System.out.println("Rectangulo C:");
        System.out.println("Base = " + C.getBase());
        System.out.println("Altura = " + C.getAltura());
        Rectangulo D = new Rectangulo(6, 5);
        System.out.println("Rectangulo D:");
        System.out.println("Base = " + D.getBase());
        System.out.println("Altura = " + D.getAltura());
        Rectangulo E = new Rectangulo(6);
        System.out.println("Rectangulo D:");
        System.out.println("Base = " + E.getBase());
        System.out.println("Altura = " + E.getAltura());
        // Calcular Area y perimetro de A e imprimirlos
        double areaA, perimetroA;
        areaA = A.calcularArea();
        perimetroA = A.calcularPerimetro();
        System.out.println("Area(A) = " + areaA);
        System.out.println("Perimetro(A) = " + perimetroA);
        double dimA[] = new double[2];
        dimA = A.getDimensiones();
        System.out.println("base(A) = " + dimA[0]);
        System.out.println("altura(A) = " + dimA[1]);
    }
}