/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tigarto
 */
public class StudentAppTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        
        System.out.println("** Creando un array de 5 objetos tipo estudiante **");
        /* Creación de referencia a un array de Objetos tipo Estudiante*/
        Student estudiantes[] = new Student[numStudents];
        for(int i = 0; i < numStudents; i++) {
            // Inicializando cada uno de los elementos del array
            estudiantes[i] = new Student(names[i],ids[i],notas[i]);                                            
        }
        
        System.out.println("** Prueba de la función printInfo **");        
        /* Imprimiendo los estudiantes - Verificación del metodo printInfo*/
        for(Student estudiante: estudiantes) {
            estudiante.printInfo();
            System.out.println();
        }
                
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
        
        System.out.println("** Prueba de los metodos setter **");
        /* Probando los metodos setter*/
        estudiantes[4].setName("Pepe");
        estudiantes[4].setId("006");
        float [] notasPepe =  {1f,2f,3f,4f};
        estudiantes[4].setGrades(notasPepe);
        
        /* Imprimiendo la información de pepe */
        estudiantes[4].printInfo();
        
        System.out.println("\n** Prueba los metodos para asignar y obtener la nota individual **");
        /* Cambiando la ultima nota de pepe por 3.2*/
        estudiantes[4].setGrade(3, 3.2f);
        System.out.println("Nota[3]: " + estudiantes[4].getGrade(3));   
        System.out.println();
        estudiantes[4].printInfo();
    }    
}
