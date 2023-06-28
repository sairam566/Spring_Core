package test.classes;

public class Sai {
	public static void greet() {
		System.out.println("Greetings from Sai");
		System.out.println("Sai Class is Loaded by: "+ Sai.class.getClassLoader());
	}
}
