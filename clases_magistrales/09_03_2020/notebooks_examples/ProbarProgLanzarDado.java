//Programa para probar varias operaciones de la clase LanzarDado.

import java.util.*; //Linea 1
public class ProbarProgLanzarDado //Linea 2
{ //Linea 3
    static Scanner console = new Scanner(System.in); //Linea 4
    public static void main(String[] args) //Linea 5
    { //Linea 6
        Dado dado1 = new Dado(); //Linea 7
        Dado dado2 = new Dado(); //Linea 8
        System.out.println("Linea 9: dado1: " + dado1); //Linea 9
        System.out.println("Linea 10: dado2: " + dado2); //Linea 10
        System.out.println("Linea 11: Despues de lanzar " + 
                           "dado1: " + 
                           dado1.lanzar()); //Linea 11
        System.out.println("Linea 12: Despues de lanzar " + 
                           "dado2: " + 
                           dado2.lanzar()); //Linea 12
        System.out.println("Linea 13: La suma de los " + 
                           "numeros mostrados en los dados es: " + 
                           (dado1.getNum() + dado2.getNum())); //Linea 13
        System.out.println("Linea 14: Despues de lanzar de nuevo " + 
                           "la suma de los numeros obtenidos es: " + 
                           (dado1.lanzar() + dado2.lanzar())); //Linea 14
    } //termina main //Linea 15
} //Linea 16