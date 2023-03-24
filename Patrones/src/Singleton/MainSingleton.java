package Singleton;

public class MainSingleton {

	public static void main(String[] args) {
		
		SingletonObject objeto1 = SingletonObject.getInstance("objeto 1");
		SingletonObject objeto2 = SingletonObject.getInstance();
		
		
		System.out.println(objeto1.getNombre());
		System.out.println(objeto2.getNombre());
	}

}
