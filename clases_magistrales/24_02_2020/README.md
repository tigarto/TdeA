# Arrays y objetos #

* **Fecha**:24/04/2020

## Lecturas previas ##
Antes de la clase se recomienda leer y simular la información contenida en los siguientes enlaces:
1. [Introducción a la programación orientada a objetos](https://github.com/tigarto/TdeA/blob/master/objetos/objetos.ipynb)
2. [Arrays de objetos](https://github.com/tigarto/TdeA/blob/master/objetos/objetos2.ipynb)
3. [Clase Vector](https://github.com/tigarto/TdeA/blob/master/Vector.ipynb)

## Ejemplos ##
1. Crear una clase llamada Student (por ahora esta clase será muy sencilla) con los campos y métodos mostrados en la siguiente tabla:

|Campo|Descripción|
|--|--|
|name|Nombre del estudiante|
|id|Identificación del estudiante|
|grades|Notas del estudiante. Cada estudiante tendrá 4 notas|


|Métodos|Descripción|
|--|--|
|setName|Asignar nombre al estudiante|
|setId|Asignar ID al estudiante|
|getName|Obtener nombre del estudiante|
|getId|Obtener ID de estudiante|
|setGrades|Asignar notas al estudiante|
|getGrades|Obtener notas del estudiante|
|printInfo|Imprime información del estudiante|
|setGrade|Especifica el valor de la i-esima nota|
|getGrade|Obtiene el valor de la i-esima nota|


**Solución**: A continuación se muestra el código [Student.java](Student.java) en el cual esta codificada la clase anteriormente descrita.

```java
public class Student {
    /* miembros */
    String name;      // Nombre del estudiante
    String id;        // Identificación del estudiante
    float grades[];   // Calificaciones del estudiante (para el ejemplo serán 4)
    
    
    /**
      Constructor 
      Crea un estudiante sin inicializar atributos con valores pasados como parametros
    */
    public Student() {
        this.name = null;
        this.id = null;
        this.grades = new float[4];
    }
    
    /**
     Constructor 
     Crea un estudiante con un nombre y un id dados
     @param name es el nombre del estudiante
     @param id es la identificaion del estudiante
    */
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new float[4];
    }
    
    /**
     Constructor 
     Crea un estudiante con un nombre, un id y unas calificaciones dadas
     @param name es el nombre del estudiante
     @param id es la identificaion del estudiante
     @param grades son las calificaciones del estudiante.
    */
    public Student(String name, String id, float[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
    
    /**
     Asigna un nombre al estudiante
     @param  name es el nombre del estudiante
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
     Asigna una identificación a un estudiante
     @param  id es la identificacion del estudiante
    */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     Asigna las notas al esdudiante
     @param grades son las notas del estudiante
    */
    public void setGrades(float[] grades) {
        this.grades = grades;
    }
    
    /**
     Obtiene el nombre del estudiante
     @return el nombre del estudiante
    */
    public String getName() {
        return name;
    }
    
    /**
     Obtiene la identificación del estudiante
     @return la identificación del
    */
    public String getId() {
        return id;
    }
    
    /**
     Obtiene las notas del estudiante
     @return las notas del estudiante
    */
    public float[] getGrades() {
        return grades;
    }
    
    /**
     Imprime la información asociada al estudiante (nombre, id, notas)
    */
    public void printInfo() {
        System.out.println("-Nombre: " + this.name);
        System.out.println("-Identificación: " + this.id);
        System.out.println("-Notas:");
        int i = 1;
        for(float nota: this.grades) {
            System.out.println("  " + i + ". " + nota);                    
            i++;
        }
    }    
    
    /**
     Asigna un valor a una nota especifica (dentro de la lista de todas las notas)
     @param numGrade numero de la i-seima nota
     @param grade valor a asignar a la i-esima nota
     */
    public void setGrade(int numGrade, float grade) {
        this.grades[numGrade] = grade;
    }
        
    /**
     Obtiene el valor de una nota especifica (dentro de la lista de todas las notas)
     @param numGrade numero de la i-seima nota
     @return valor de la i-esima nota
     */
    public float getGrade(int numGrade) {
        return this.grades[numGrade];    
    }
}
```


2. Suponiendo que se tiene una lista de 5 estudiantes dada por:

|Nombre|ID|Nota 1|Nota 2|Nota 3|Nota 3|
|------|--|-----|---|---|---|
|Milhouse|001|2.5|2.4|2.9|3.3|
|Bart|002|0|0|0|0.5|
|Lisa|003|5|5|5|4.9|
|Nelson|004|2.9|3.1|1.2|4.0|
|Rafa|005|2.9|1.5|2.9|3.2|


**Nota**: el código solución de todas los puntos que se muestran a continuación vienen de fragmentos tomados del siguiente archivo [StudentAppTest.java](StudentAppTest.java)); cuando este código se ejecuta (lo cual puede hacer dando siguiendo el siguiente [enlace](https://repl.it/@HENRYALBERTOALB/studentTest)) la salida completa es la siguiente:

```
** Creando un array de 5 objetos tipo estudiante **
** Prueba de la función printInfo **
-Nombre: Milhouse
-Identificación: 001
-Notas:
  1. 2.5
  2. 2.4
  3. 2.9
  4. 3.3

-Nombre: Bart
-Identificación: 002
-Notas:
  1. 0.0
  2. 0.0
  3. 0.0
  4. 0.5

-Nombre: Lisa
-Identificación: 003
-Notas:
  1. 5.0
  2. 5.0
  3. 5.0
  4. 4.9

-Nombre: Nelson
-Identificación: 004
-Notas:
  1. 2.9
  2. 3.1
  3. 1.2
  4. 4.0

-Nombre: Rafa
-Identificación: 005
-Notas:
  1. 2.9
  2. 1.5
  3. 2.9
  4. 3.2

** Prueba de los metodos getter **
---------------------------
Nombre: Lisa
ID: 003
Notas:
5.0 5.0 5.0 4.9
---------------------------
** Prueba de los metodos setter **
-Nombre: Pepe
-Identificación: 006
-Notas:
  1. 1.0
  2. 2.0
  3. 3.0
  4. 4.0

** Prueba los metodos para asignar y obtener la nota individual **
Nota[3]: 3.2

-Nombre: Pepe
-Identificación: 006
-Notas:
  1. 1.0
  2. 2.0
  3. 3.0
  4. 3.2
```

En este código se llevan a cabo las tareas que se solicitan a continuación. A continuación se mostrará el fragmento de código de cada tarea y se mostrará la salida asociada a este fragmento:

Hacer las siguientes actividades:
  * Crear un vector de 5 objetos tipo Student a partir de la tabla anterior e inicializarlos.

```java
final int numStudents = 5;
        
// Array con los nombres
String names[] = { 
                    "Milhouse",
                    "Bart",
                    "Lisa",
                    "Nelson",
                    "Rafa"
                 };
        
// Array con los ids
String ids[] = { 
                    "001",
                    "002",
                    "003",
                    "004",
                    "005"
               };
        
// Matrix con las notas
float notas[][] = { 
                    { 2.5f, 2.4f, 2.9f, 3.3f },
                    { 0f, 0f, 0f, 0.5f },
                    {5f, 5f, 5f, 4.9f},
                    {2.9f, 3.1f, 1.2f, 4.0f},
                    {2.9f, 1.5f, 2.9f, 3.2f}
                  };
        
/* Creación de referencia a un array de Objetos tipo Estudiante*/
Student estudiantes[] = new Student[numStudents];
for(int i = 0; i < numStudents; i++) {
    // Inicializando cada uno de los elementos del array
    estudiantes[i] = new Student(names[i],ids[i],notas[i]);                                            
}       
```

* Imprimir cada uno de los elementos del vector creado. (Para ello use el método printInfo).

```java
System.out.println("** Prueba de la función printInfo **");        
/* Imprimiendo los estudiantes - Verificación del metodo printInfo*/
for(Student estudiante: estudiantes) {
    estudiante.printInfo();
    System.out.println();
}
```

Para el caso la salida en pantalla de este segmento de código será:

```
** Prueba de la función printInfo **
-Nombre: Milhouse
-Identificación: 001
-Notas:
  1. 2.5
  2. 2.4
  3. 2.9
  4. 3.3

-Nombre: Bart
-Identificación: 002
-Notas:
  1. 0.0
  2. 0.0
  3. 0.0
  4. 0.5

-Nombre: Lisa
-Identificación: 003
-Notas:
  1. 5.0
  2. 5.0
  3. 5.0
  4. 4.9

-Nombre: Nelson
-Identificación: 004
-Notas:
  1. 2.9
  2. 3.1
  3. 1.2
  4. 4.0

-Nombre: Rafa
-Identificación: 005
-Notas:
  1. 2.9
  2. 1.5
  3. 2.9
  4. 3.2
```

* Probar los métodos **getter** obteniendo los miembros del elemento del array asociado a **Bart**:

```java
System.out.println("** Prueba de los metodos getter **");
/* Verificando los metodos getter */
String nomBart = estudiantes[1].getName();
String idBart = estudiantes[1].getId();
float  [] notasBart = estudiantes[1].getGrades();
        
/* Imprimiendo las variables obtenidas */
System.out.println("---------------------------");        
System.out.println("Nombre: " + nomBart);
System.out.println("ID: " + idBart);
System.out.println("Notas: ");
for(int i = 0; i < 4; i++) {
  System.out.print(notasBart[i] + " ");                    
}        
System.out.println();
System.out.println("---------------------------");
```

En el codigo anterior, se imprimió en pantalla los miembros obtenidos. La salida fue la siguiente:

```** Prueba de los metodos getter **
---------------------------
Nombre: Bart
ID: 002
Notas: 
0.0 0.0 0.0 0.5 
---------------------------
```

* Probar los metodos **setter** cambiando los datos de **Rafa** por los siguientes:
  * **Nombre**: Pepe.
  * **id**: 006
  * **Notas**: 1, 2, 3, 4

El fragmento de código que hace esto se muestra a continuación: 

```java
System.out.println("** Prueba de los metodos setter **");
        /* Probando los metodos setter*/
        estudiantes[4].setName("Pepe");
        estudiantes[4].setId("006");
        float [] notasPepe =  {1f,2f,3f,4f};
        estudiantes[4].setGrades(notasPepe);
        
        /* Imprimiendo la información de pepe */
        estudiantes[4].printInfo();
```

Para ver que el método funcionara se imprimió la información del elemento del array asociado a Pepe. La salida en pantalla de este fragmento fue la siguiente:

```
** Prueba de los metodos setter **
-Nombre: Pepe
-Identificación: 006
-Notas:
  1. 1.0
  2. 2.0
  3. 3.0
  4. 4.0
```

* Probar los metodos para asignar y obtener una nota individual cambiando la ultima nota de Pepe (4) por una nota de 3.2. Verifique que el cambio se haya hecho efectivo mediante imprimiento en pantalla.

```java
System.out.println("\n** Prueba los metodos para asignar y obtener la nota individual **");
/* Cambiando la ultima nota de pepe por 3.2*/
estudiantes[4].setGrade(3, 3.2f);
System.out.println("Nota[3]: " + estudiantes[4].getGrade(3));   
System.out.println();
estudiantes[4].printInfo();
```

```
** Prueba los metodos para asignar y obtener la nota individual **
Nota[3]: 3.2

-Nombre: Pepe
-Identificación: 006
-Notas:
  1. 1.0
  2. 2.0
  3. 3.0
  4. 3.2
```
3. En el anterior codigo se creo un programa con el cual fue posible probar el correcto funcionamiento de la clase **Student**. Para este punto, realizar una aplicación que permita la interacción con un usuario según su rol tal y como muestra a continuación.

**Funciones estudiante**:
* Consultar Datos
* Consultar notas

**Funciones profesor**:
* Imprimir la lista
* Mostrar datos de un estudiante 
* Corregir nota.


**Solución**: La solución se encuentra decrita en el siguiente archivo: [StudentApp.java](StudentApp.java). En el siguiente [enlace](https://repl.it/@HENRYALBERTOALB/studentApp2) se puede ejecutar la aplicación online.

## Enlaces ##
1. https://www.javaguicodexample.com/javadesktopguinetbeans4.html

