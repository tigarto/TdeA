/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tigarto
 */
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
