
/*
Fecha: 25/10/2019
Autor: Luis Joyanes Aguilar (ejercicio 10.1 - pagina 248)

Resumen:
El programa escrito a continuación lee NUM enteros en un arreglo,
multiplica los elementos del arreglo y visualiza el producto.

*/

import java.util.Scanner;

class Inicial
{
    public static void main(String [] a)
    {
        final int NUM = 10;
        Scanner entrada = new Scanner(System.in);
        int []nums= new int[NUM];
        int total = 1;
        System.out.println("Por favor, introduzca " + NUM + " datos");
        for (int i = 0; i < NUM; i++)
        {
            nums[i] = entrada.nextInt();
        }
        System.out.print("\nLista de números: ");
        for (int i = 0; i < NUM; i++)
        {
            System.out.print(" " + nums[i]);
            total *= nums[i];
        }
        System.out.println("\nEl producto de los números es " + total);
    }
}