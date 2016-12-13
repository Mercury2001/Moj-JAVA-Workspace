//Naziv klase
class Student {
	String ime;
	int godina;
	
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student Osoba1 = new Student();
		Osoba1.ime = "Janko Jankovic";
		Osoba1.godina = 2;
		
		Student Osoba2 = new Student();
		Osoba2.ime = "Pero Peric";
		Osoba2.godina =3;
		
		
		System.out.println("Student " + Osoba1.ime + " " + "godina studija" + " " + Osoba1.godina);
		
	}

}
