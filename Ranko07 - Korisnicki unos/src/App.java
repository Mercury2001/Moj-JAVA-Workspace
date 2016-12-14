import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// Kreiranje skener objekta
				Scanner input = new Scanner(System.in);
				
				
				// Ime
				System.out.println("Unesite vase ime: ");
				
				String line = input.nextLine();
				
				System.out.println("Unesite vase prezime: ");
				
				String line2 = input.nextLine();
				
				System.out.println("Unesite vasu godinu rodjenja: ");
				
				String line3 = input.nextLine();
				
				System.out.println("Unesite vas pol: ");
				
				String line4 = input.nextLine();
				
				System.out.println(" Vase ime je: " + line + " Prezime je: " + line2 + " Godina rodjenja je: " + line3 + " Pol je: " + line4);
				
				input.close();
				
				
				
				
			
				
				// Izvrsavanje skenera i arhiviranje rezultata
			
				
				// Svaki skener i citac treba zatvoriti nakon upotrebe (dobra praksa)
				input.close();
				
			
	
/*

			    Scanner dd = new Scanner(System.in);

			    System.out.println("Enter number.");
			    int a = dd.nextInt();
			    System.out.println("Enter number.");
			    int b = dd.nextInt();
			    System.out.println("Enter number.");
			    int c = dd.nextInt();
			  
			    dd.close();
	*/	
	}

}
