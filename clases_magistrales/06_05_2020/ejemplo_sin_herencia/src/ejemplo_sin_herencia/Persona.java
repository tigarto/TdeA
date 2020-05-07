package ejemplo_sin_herencia;

public class Persona {
	
	String nombre;
	String ID;
	
	public Persona() {
		this.nombre = "";
		ID = "";
	}
	
	public Persona(String nombre, String iD) {
		this.nombre = nombre;
		ID = iD;
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", ID=" + ID + "]";
	}	

}
