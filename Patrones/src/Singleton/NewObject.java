package Singleton;

public class NewObject {
	// Campos de clase
	private String nombre;
	private static NewObject instance;

	// Constructores
	private NewObject() {

	}

	// Metodos Getters and Setters
	public static NewObject getInstance() {

		if (instance == null) {
			instance = new NewObject();
		}

		instance.setNombre(null);
		
		return instance;
	}

	public static NewObject getInstance(String nom) {

		if (instance == null) {
			instance = new NewObject();
		}
		
		instance.setNombre(nom);

		return instance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
