package ejemplo_sin_herencia;

public class Estudiante {
	String nombre;
	String ID;
	String universidad;
	
	public Estudiante() {
		this.nombre = "";
		this.ID = "";
		this.universidad = "";
	}
	
	public Estudiante(String nombre, String ID, String universidad) {
		this.nombre = nombre;
		this.ID = ID;
		this.universidad = universidad;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", ID=" + ID + ", universidad=" + universidad + "]";
	}

	

}
