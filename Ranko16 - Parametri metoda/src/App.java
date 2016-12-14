class Frog {
	private String name;
	private String color;
	private int age;
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age ) {
		this.age = age;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getName() {
		return name;
		
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;

	}
	public void setInfo(String name, int age, String color) {
		setName(name);
		setAge(age);
		setColor(color);
	}
	public void makeSound(){
		System.out.println("Ovo je" + this.name + "Kre, kre");
		}
		
	}

public class App {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
	
		
		frog1.setName("Zabac");
		frog1.setAge(1);
		frog1.setColor("Zelena");
		
		Frog frog2 = new Frog();
		
		frog2.setName("Zaba");
		frog2.setAge(2);
		frog2.setColor("Smedja");
		
		
		System.out.println(frog1.getColor()+" "+ frog1.getName());
		System.out.println(frog2.getName()+" "+ frog2.getAge());
		
		frog1.makeSound();
		frog2.makeSound();
		
		
		

	}

}
//1. Zaba treba da ima i atribut koji opisuje njenu boju
//2. kreirati jos jedan objekat
//3. Iskoristiti funkciju setinfo (inicijaliyovati novi objekat pomocu ove funkcije),  nprfrog2.setInfo..
//4. Napisati funkciju make sound 