import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    DiaAnyo hoy;
        DiaAnyo cumpleanyos;
        int d, m;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca fecha de hoy, dia: ");
        d = entrada.nextInt();
        System.out.print("Introduzca el número de mes: ");
        m = entrada.nextInt();
        hoy = new DiaAnyo(d,m);
        System.out.print("Introduzca su fecha de nacimiento, dia: ");
        d = entrada.nextInt();
        System.out.print("Introduzca el número de mes: ");
        m = entrada.nextInt();
        cumpleanyos = new DiaAnyo(d,m);
        System.out.print( " La fecha de hoy es ");
        hoy.visualizar();
        System.out.print( " Su fecha de nacimiento es ");
        cumpleanyos.visualizar();
        if (hoy.igual(cumpleanyos))
            System.out.println( "¡Feliz cumpleaños ! ");
        else
            System.out.println( "¡Feliz dia ! ");
  }
}
