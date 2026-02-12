package tp3exosYaip4;
public class Animal {
	private static String name;
	
	public Animal(String name) {
		Animal.name = name;
	}
	
	public String toString() {
		return "Animal[name= " + name +"]";
	}
}