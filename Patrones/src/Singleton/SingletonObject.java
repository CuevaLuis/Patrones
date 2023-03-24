package Singleton;

public class SingletonObject {
	// Campos de clase
	private String nombre;
	private static SingletonObject instance;

	// Constructores
	private SingletonObject() {

	}

	// Metodos Getters and Setters
	public static SingletonObject getInstance() {

		if (instance == null) {
			instance = new SingletonObject();
		}

		instance.setNombre(null);
		
		return instance;
	}

	public static SingletonObject getInstance(String nom) {

		if (instance == null) {
			instance = new SingletonObject();
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
