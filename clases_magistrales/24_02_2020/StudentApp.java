import java.util.Scanner;

public class StudentApp {
    
    static final int numStudents = 5;
    static Student estudiantes[] = new Student[numStudents];
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mainOpc = 0, profesorOpc = 0, estudianteOpc = 0;
        String id;
        Student est;
        int estSeleccionado = 0;
        int numNota;
        float nota;
        cargarDatos();
        System.out.println("==============================================================");
        System.out.println("=   SISTEMA DE CONSULTA DE NOTAS - PRIMARIA DE SPRINGFIELD   =");
        System.out.println("==============================================================");
        do {
            mainMenu();
            System.out.print("Elija una opcion: ");
            mainOpc = entrada.nextInt();
            switch(mainOpc) {
                case 1:                    
                    do {
                        menuProfesor();
                        System.out.print("Elija una opcion: ");
                        profesorOpc = entrada.nextInt();
                        switch(profesorOpc) {
                            case 1:
                                imprimirLista();
                                break;
                            case 2:
                                imprimirLista();
                                System.out.println("");
                                System.out.print("Ingrese la ID del estudiante para obtener sus datos: ");
                                entrada.nextLine();
                                id = entrada.nextLine();
                                est = obtenerDatosEstudiante(id);
                                System.out.println("\nInformacion del estudiante --> ");
                                est.printInfo();
                                break;
                            case 3:
                                imprimirLista();
                                System.out.println("");
                                System.out.print("Ingrese la ID del estudiante para obtener sus datos: ");
                                entrada.nextLine();  // Ojo
                                id = entrada.nextLine();                                                         
                                for(int i = 0; i < numStudents; i++) {
                                    if(estudiantes[i].getId().equals(id)) {
                                        estSeleccionado = i;
                                        break;                                    
                                    }                                
                                }             
                                System.out.print("Ingrese el numero de la nota a corregir (1 - 4): ");
                                numNota = entrada.nextInt();
                                System.out.print("Ingrese la nota: ");
                                nota = entrada.nextFloat();
                                estudiantes[estSeleccionado].setGrade(numNota - 1, nota);
                                break;
                            case 4:
                                System.out.println("Saliendo del menu del profesor ");
                                break;
                            default:
                                System.out.println("Opcion invalida");                               
                        }                        
                    }
                    while(profesorOpc != 4);
                    break;
                case 2:                    
                    do {
                        menuEstudiante();
                        System.out.print("Elija una opcion: ");
                        estudianteOpc = entrada.nextInt();
                        switch(estudianteOpc) {
                            case 1: 
                                System.out.print("Ingrese su ID: ");                                
                                entrada.nextLine();
                                id = entrada.nextLine();         
                                est = obtenerDatosEstudiante(id);
                                est.printInfo();
                                break;
                            case 2:
                                System.out.print("Ingrese su ID: ");                                
                                entrada.nextLine();
                                id = entrada.nextLine(); 
                                est = obtenerDatosEstudiante(id);
                                System.out.print("Notas: ");
                                float avg = 0;
                                for(float n: est.getGrades()) {
                                    System.out.print (n + " ");
                                    avg += n;
                                }
                                avg /= 4;
                                System.out.println("Promedio: " + avg);
                                break;
                            case 3:
                                System.out.println("Saliendo del menu del estudiante ");
                                break;
                            default:
                                System.out.println("Opcion invalida");                               
                        }                        
                    } while(estudianteOpc != 3);
                    break;
                case 3:
                    System.out.println("Saliendo sel sistema ");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        
        }while(mainOpc != 3);
        
        
        /* Test 1 - Metodos del menu del profesor
        cargarDatos();
        imprimirLista();
        Student est = obtenerDatosEstudiante("001");
        est.printInfo();
        */
        
        
    
    }
    
    public static void mainMenu() {
        System.out.println("==== Menu Principal ====");
        System.out.println("1. Ingresar al menu del profesor");
        System.out.println("2. Ingresar al menu del estudiante");
        System.out.println("3. Salir");
    }
    
    public static void menuEstudiante(){
        System.out.println("Menu");
        System.out.println("1. Consultar datos");
        System.out.println("2. Consultar notas");
        System.out.println("3. Salir");
    }
    
    public static void menuProfesor(){
        System.out.println("Menu");
        System.out.println("1. Mostrar lista estudiantes");
        System.out.println("2. Imprimir datos del estudiante");
        System.out.println("3. Corregir nota");
        System.out.println("4. Salir");
    }
    
    public static void cargarDatos() {
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
        
        for(int i = 0; i < numStudents; i++) {
            // Inicializando cada uno de los elementos del array
            estudiantes[i] = new Student(names[i],ids[i],notas[i]);                                            
        }       
    }
    
    public static void imprimirLista () {
        System.out.println("#   Id     Nombre"); 
        for(int i = 0; i < numStudents; i++) {
            System.out.println(i + ".  " + estudiantes[i].getId() + "    " + estudiantes[i].getName());
        }
    }
    
    public static Student obtenerDatosEstudiante(String id) {
        Student e = new Student();
        for(int i = 0; i < numStudents; i++) {
            if(estudiantes[i].getId().endsWith(id)) {
                e = estudiantes[i];
                break;
            }        
        }
        return e;
    }    
}
