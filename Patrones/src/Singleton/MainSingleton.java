package Singleton;

public class MainSingleton {

	public static void main(String[] args) {
		
		NewObject objeto1 = NewObject.getInstance("objeto 1");
		NewObject objeto2 = NewObject.getInstance();
		
		
		System.out.println(objeto1.getNombre());
		System.out.println(objeto2.getNombre());
	}

}
