package ejemplo_sin_herencia;

public class TestClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Clase principal");
		Persona persona1 = new Persona("Homero Simpson","000001");
		Estudiante estudiante1 = new Estudiante("Lisa Simpson","000100",
											    "Universidad de Springfield");
		System.out.println(persona1);
		System.out.println(estudiante1);
	}

}
