public class Rectangulo {

    /*Atributos*/
    private double base;
    private double altura;

    /*Metodos*/

    public Rectangulo() {
        base = 0;
        altura = 0;
    }

    public Rectangulo(double b, double h) {
        base = b;
        altura = h;
    }

    public Rectangulo(double l) {
        base = altura = l;
    }

    public void setBase(double b) {
        base = b;
    }

    public void setAltura(double h) {
        altura = h;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setDimensiones(double b, double h) {
        base = b;
        altura = h;
    }

    public double calcularArea(){
        double A = base*altura;
        return A;
    }

    public double calcularPerimetro(){
        return 2*(base + altura);
    }

    public double[] getDimensiones() {
        double dim[] = new double[2];
        dim[0] = base;
        dim[1] = altura;
        return dim;
    }
}