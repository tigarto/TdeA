public class Clock {
  private int hr; //almacena horas
  private int min; //almacena minutos
  private int sec; //almacena segundos
  
  //Constructor predeterminado
  //Postcondicion: hr = 0; min = 0; sec = 0
  public Clock() {
    setTime(0, 0, 0);
  }

  //Constructor con parametros, para establecer la hora
  //La hora se establece de acuerdo con los parametros.
  //Postcondicion: hr = horas; min = minutos;
  // sec = segundos
  public Clock(int hours, int minutes, int seconds) {
    setTime(hours, minutes, seconds);
  }

  //Metodo para establecer la hora
  //La hora se establece de acuerdo con los parametros.
  //Postcondicion: hr = horas; min = minutos;
  // sec = segundos
  public void SetTime(int hours, int minutes, int seconds) {
  if (0 <= hours && hours < 24)
    hr = hours;
  else
    hr = 0;
  if (0 <= minutes && minutes < 60)
    min = minutes;
  else
    min = 0;
  if (0 <= seconds && seconds < 60)
    sec = seconds;
  else
    sec = 0;
  }

  //Metodo para devolver las horas
  //Postcondicion: el valor de hr se devuelve
  public int getHours() {
    return hr:
  }

  //Metodo para devolver los minutos
  //Postcondicion: el valor de min se devuelve
  public int getMinutes() {
    return min;
  }

  //Metodo para devolver los segundos
  //Postcondicion: el valor de sec se devuelve
  public int getSeconds() {
    return sec;
  }

  //Metodo para imprimir la hora
  //Postcondicion: la hora se imprime en la forma hh:mm:ss
  public void printTime() {
  if (hr < 10) 
    System.out. print("0");
  System.out.print(hr + ":");
  if (min < 10);
    System.out.print("0");
  System.out.print(min + ":");
  if (sec < 10)
    System.out.print("0");
  System.out.print(sec);
  }

  //Metodo para incrementar en un segundo la hora
  //Postcondicion: la hora se incrementa en un segundo
  //Si la hora antes del incremento es 23:59:59, la hora
  //se restablece en 00:00:00
  public void incrementSeconds() {
    sec++;
    if (sec > 59) {
      sec = 0;
      incrementMinutes(); //incrementa los minutos
    }
  }

  //Metodo para incrementar en un minuto la hora
  //Postcondicion: la hora se incrementa en un minuto
  //Si la hora antes del incremento es 23:59:53, la hora
  //se restablece en 00:00:53
  public void incrementMinutes() {
    min++;
    if (min > 59) {
      min = 0;
      incrementHours(); //incrementa las horas
    }
  }

  //Metodo para incrementar en una hora la hora
  //Postcondicion: la hora se incrementa en una hora
  //Si la hora antes del incremento es 23:45:53, la hora
  //se restablece en 00:45:53
  public void incrementHours() {
    hr++;
    if (hr > 23) {
      hr = 0;
    }
  }

  //Metodo para comparar dos horas
  //Postcondicion: devuelve verdadero si esta hora es igual a
  // otherClock; de lo contrario devuelve falso
  public boolean equals(Clock otherClock) {
    return (hr == otherClock.hr && min == otherClock.min && sec == otherClock.sec);
  }

  //Metodo para copiar la hora
  //Postcondicion: las variables de instancias de otherClock
  // copiadas en los datos correspondientes
  // son miembros de esta hora.
  // hr = otherClock.hr;
  // min = otherClock.min;
  // sec = otherClock.sec;
  public void makeCopy(Clock otherClock) {
    hr = otherClock.hr;  
    min = otherClock.min;
    sec = otherClock.sec;
  }

  //Mwtodo para devolver una copia de la hora
  //Postcondicion: Una copia del objeto se crea y
  // se devuelve una referencia de la copia
  public Clock getCopy() {
    Clock temp = new Clock();
    temp.hr = hr;
    temp.min = min;
    temp.sec = sec;
   return temp;
  }
}

