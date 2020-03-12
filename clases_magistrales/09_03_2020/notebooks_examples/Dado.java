public class Dado
{
  private int num;

  //Constructor predeterminado
  //Establece en 1 el numero predeterminado obtenido por un dado
  Dado()
  {
    num = 1;
  }

  //Metodo para lanzar un dado.
  //Este metodo utiliza un generador de numeros aleatorios para
  //generar aleatoriamente un numero entre 1 y 6 y almacena el numero
  //en la variable de instancia num y devuelve el numero.
  public int lanzar()
  {
    num = (int) (Math.random() * 6) + 1;
    return num;
  }

  //Metodo para devolver el numero de la cara superior del dado.
  //Devuelve el valor de la variable de instancia num.
  public int getNum()
  {
    return num;
  }

  //Devuelve el valor de la variable de instancia num como una cadena.
  public String toString()
  {
    return "" + num;
  }
}