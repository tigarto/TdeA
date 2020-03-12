//Programa para probar varias operaciones de la clase Clock
import java.util.*;
public class TestProgClock {
  static Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
    Clock myClock = new Clock(5, 4, 30); //Linea 1
    Clock yourClock = new Clock(); //Linea 2
    int horas; //Linea 3
    int minutos; //Linea 4
    int segundos; //Linea 5
    System.out.print("Linea 6: myClock: "); //Linea 6
    myClock.printTime(); //Linea 7
    System.out.println(); //Linea 8
    System.out.print("Linea 9: yourClock: "); //Linea 9
    yourClock.printTime(); //Linea 10
    System.out.println(); //Linea 11
    yourClock.setTime(5, 45, 16); //Linea 12
    System.out.print("Linea 13: Despues de establecer " + "la hora, yourClock: "); //Linea 13
    yourClock.printTime(); //Linea 14
    System.out.println(); //Linea 15
    if (myClock.equals(yourClock)) //Linea 16
      System.out.println("Linea 17: Las dos " + 
                         "horas son iguales."); //Linea 17
    else //Linea 18
      System.out.println("Linea 19: Las dos " + 
                         "horas no son " + 
                         "iguales."); //Linea 19
    System.out.print("Linea 20: Ingrese horas, " + 
                     "minutos y segundos: "); //Linea 20
   horas = console.nextInt(); //Linea 21
   minutos = console.nextInt(); //Linea 22
   segundos = console.nextInt(); //Linea 23
   System.out.println(); //Linea 24
   myClock.setTime(horas, minutos, segundos); //Linea 25
   System.out.print("Linea 26: Nueva hora de " +
                    "myClock: "); //Linea 26
   myClock.printTime(); //Linea 27
   System.out.println(); //Linea 28
   myClock.incrementSeconds();//Linea 29
   System.out.print("Linea 30: Despues " + 
                    "de incrementar en un segundo " + 
                    "la hora, myClock: "); //Linea 30
   myClock.printTime(); //Linea 31
   System.out.println(); //Linea 32
   yourClock.makeCopy(myClock); //Linea 33
   System.out.print("Linea 34: Despues de copiar " + 
                    "myClock en yourClock, " + 
                    "yourClock: "); //Linea 34
   yourClock.printTime(); //Linea 35
   System.out.println(); //Linea 36
   }//termina main
}