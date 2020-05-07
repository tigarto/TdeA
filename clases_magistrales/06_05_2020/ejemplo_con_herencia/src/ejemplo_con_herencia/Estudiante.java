package ejemplo_con_herencia;

public class Estudiante extends Persona{
	private String universidad;
	
	public Estudiante() {		
		super(); // public Persona()
		this.universidad = "";
	}
	
	public Estudiante(String nombre, String ID, String universidad) {
		super(nombre,ID); // public Persona(String nombre, String ID)
		this.universidad = universidad;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	@Override
	public String toString() {
		return "Estudiante [universidad=" + universidad + "]";
	}

	

		
	
}
