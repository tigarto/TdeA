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


**Solución**

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

Para comprender observe el siguiente [enlace](http://www.pythontutor.com/java.html#code=public%20class%20Student%20%7B%0A%20%20%0A%20%20%20%20/*%20miembros%20*/%0A%20%20%20%20String%20name%3B%20%20%20%20%20%20//%20Nombre%20del%20estudiante%0A%20%20%20%20String%20id%3B%20%20%20%20%20%20%20%20//%20Identificaci%C3%B3n%20del%20estudiante%0A%20%20%20%20float%20grades%5B%5D%3B%20%20%20//%20Calificaciones%20del%20estudiante%20%28para%20el%20ejemplo%20ser%C3%A1n%204%29%0A%20%20%20%20%0A%0A%20%20%20%20public%20Student%28%29%20%7B%0A%20%20%20%20%20%20%20%20this.name%20%3D%20null%3B%0A%20%20%20%20%20%20%20%20this.id%20%3D%20null%3B%0A%20%20%20%20%20%20%20%20this.grades%20%3D%20new%20float%5B4%5D%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%0A%20%20%20%20public%20Student%28String%20name,%20String%20id%29%20%7B%0A%20%20%20%20%20%20%20%20this.name%20%3D%20name%3B%0A%20%20%20%20%20%20%20%20this.id%20%3D%20id%3B%0A%20%20%20%20%20%20%20%20this.grades%20%3D%20new%20float%5B4%5D%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%0A%20%20%20%20public%20Student%28String%20name,%20String%20id,%20float%5B%5D%20grades%29%20%7B%0A%20%20%20%20%20%20%20%20this.name%20%3D%20name%3B%0A%20%20%20%20%20%20%20%20this.id%20%3D%20id%3B%0A%20%20%20%20%20%20%20%20this.grades%20%3D%20grades%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%0A%20%20%20%20public%20void%20setName%28String%20name%29%20%7B%0A%20%20%20%20%20%20%20%20this.name%20%3D%20name%3B%0A%20%20%20%20%7D%0A%0A%0A%20%20%20%20public%20void%20setId%28String%20id%29%20%7B%0A%20%20%20%20%20%20%20%20this.id%20%3D%20id%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%0A%20%20%20%20public%20void%20setGrades%28float%5B%5D%20grades%29%20%7B%0A%20%20%20%20%20%20%20%20this.grades%20%3D%20grades%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%0A%20%20%20%20public%20String%20getName%28%29%20%7B%0A%20%20%20%20%20%20%20%20return%20name%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%0A%20%20%20%20public%20String%20getId%28%29%20%7B%0A%20%20%20%20%20%20%20%20return%20id%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%0A%20%20%20%20public%20float%5B%5D%20getGrades%28%29%20%7B%0A%20%20%20%20%20%20%20%20return%20grades%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%0A%20%20%20%20public%20void%20printInfo%28%29%20%7B%0A%20%20%20%20%20%20%20%20System.out.println%28%22-Nombre%3A%20%22%20%2B%20this.name%29%3B%0A%20%20%20%20%20%20%20%20System.out.println%28%22-Identificaci%C3%B3n%3A%20%22%20%2B%20this.id%29%3B%0A%20%20%20%20%20%20%20%20System.out.println%28%22-Notas%3A%22%29%3B%0A%20%20%20%20%20%20%20%20int%20i%20%3D%201%3B%0A%20%20%20%20%20%20%20%20for%28float%20nota%3A%20this.grades%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20System.out.println%28%22%20%20%22%20%2B%20i%20%2B%20%22.%20%22%20%2B%20nota%29%3B%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20%20%20%20%20i%2B%2B%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%20%20%20%20%0A%20%20%20%20%0A%0A%20%20%20%20public%20void%20setGrade%28int%20numGrade,%20float%20grade%29%20%7B%0A%20%20%20%20%20%20%20%20this.grades%5BnumGrade%5D%20%3D%20grade%3B%0A%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20public%20float%20getGrade%28int%20numGrade%29%20%7B%0A%20%20%20%20%20%20%20%20return%20this.grades%5BnumGrade%5D%3B%20%20%20%20%0A%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20final%20int%20numStudents%20%3D%205%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20//%20Array%20con%20los%20nombres%0A%20%20%20%20%20%20%20%20String%20names%5B%5D%20%3D%20%7B%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%22Milhouse%22,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%22Bart%22,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%22Lisa%22,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%22Nelson%22,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%22Rafa%22%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20//%20Array%20con%20los%20ids%0A%20%20%20%20%20%20%20%20String%20ids%5B%5D%20%3D%20%7B%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%22001%22,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%22002%22,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%22003%22,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%22004%22,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%22005%22%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20//%20Matrix%20con%20las%20notas%0A%20%20%20%20%20%20%20%20float%20notas%5B%5D%5B%5D%20%3D%20%7B%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7B%202.5f,%202.4f,%202.9f,%203.3f%20%7D,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7B%200f,%200f,%200f,%200.5f%20%7D,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7B5f,%205f,%205f,%204.9f%7D,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7B2.9f,%203.1f,%201.2f,%204.0f%7D,%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7B2.9f,%201.5f,%202.9f,%203.2f%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20System.out.println%28%22**%20Creando%20un%20array%20de%205%20objetos%20tipo%20estudiante%20**%22%29%3B%0A%20%20%20%20%20%20%20%20/*%20Creaci%C3%B3n%20de%20referencia%20a%20un%20array%20de%20Objetos%20tipo%20Estudiante*/%0A%20%20%20%20%20%20%20%20Student%20estudiantes%5B%5D%20%3D%20new%20Student%5BnumStudents%5D%3B%0A%20%20%20%20%20%20%20%20for%28int%20i%20%3D%200%3B%20i%20%3C%20numStudents%3B%20i%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20//%20Inicializando%20cada%20uno%20de%20los%20elementos%20del%20array%0A%20%20%20%20%20%20%20%20%20%20%20%20estudiantes%5Bi%5D%20%3D%20new%20Student%28names%5Bi%5D,ids%5Bi%5D,notas%5Bi%5D%29%3B%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20%7D%0A%0A%20%20%20%20%7D%0A%7D&cumulative=false&curInstr=0&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false)

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
String nomBart = estudiantes[2].getName();
String idBart = estudiantes[2].getId();
float  [] notasBart = estudiantes[2].getGrades();
        
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
Nombre: Lisa
ID: 003
Notas: 
5.0 5.0 5.0 4.9 
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



Crear una lista con todos estos estudiantes. Y definir un programa que permita interactuar con esto.

Crear una lista usando POO y definir un programa que permita interactuar con estos.



