package tp3exosYaip4;
public class Person {
	private static String name;
	private static String adress;
	
	public Person(String name, String adress) {
		Person.name = name;
		Person.adress = adress;
	}
	
	public static String getName() {
		return name;
	}
	
	public static String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		Person.adress = adress;
	}
	
	public String toString() {
		return "Person [name= " + name +", adress= "+ adress+"]";
	}
	
	public static void main (String[] args) {
		Person p1 = new Person("Kevin" , "Martigues");
		System.out.println(Person.getName());
		System.out.println(Person.getAdress());
		p1.setAdress("Martigues");
		System.out.println(p1);
	}
}