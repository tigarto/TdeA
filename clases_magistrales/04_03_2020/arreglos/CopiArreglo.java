/*
* Fecha: 25/10/2019
* Autor: Luis Joyanes Aguilar
* Ejercicio 10.2 (pagina 249)
*
* Resumen:
* Definir dos arreglos de tipo double, v y w con 15 y 20 elementos respectivamente;
* en el primero se guardan los valores de la función e^(2*x - 1); el segundo
* inicializa cada elemento al ordinal del elemento; después se copian los 10 últimos
* elementos de v a partir del elemento 11 de w; por ultimo, se escriben los
* elementos de ambos arreglos.
* */

public class CopiArreglo
{
    public static void main(String [] a)
    {
        final int N = 15;
        final int M = 20;
        double [] v = new double[N];
        double [] w = new double [M];
        double x = 1.0;

        for (int i = 0; i < N; x+=0.2,i++) {
            v[i] = Math.exp(2 * x - 1);
        }

        for (int i = 0; i < M; i++) {
            w[i] = (double) i;
        }

        // Se imprimen los elementos del vector v
        System.out.println("\n Valores del vector v");
        for (int i = 0; i < N; i++) {
            System.out.print(v[i] + " ");
        }

        // Es realizada la copia de v a w
        System.arraycopy(v, (N-1)-10 +1, w, 10, 10);

        // Se imprimen los elementos del vector w
        System.out.println("\n Valores del vector w");
        for (int i = 0; i < M; i++) {
            System.out.print(w[i] + " ");
        }
    }
}
