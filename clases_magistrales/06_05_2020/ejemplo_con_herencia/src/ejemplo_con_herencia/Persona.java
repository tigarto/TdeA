package ejemplo_con_herencia;

public class Persona {
	
	protected String nombre;
	protected String ID;
	
	public Persona() {
		this.nombre = "";
		this.ID = "";
	}
	
	public Persona(String nombre, String ID) {
		this.nombre = nombre;
		this.ID = ID;
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
