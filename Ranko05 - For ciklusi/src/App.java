
public class App {

	public static void main(String[] args) {
		
        /* Zadatak:
         *
         * 1 - Napisati ciklus koji ispisuje brojeve od 1 do 1000
         * 2 - Napisati ciklus koji ispisuje brojeve od 500 do 1
         * 3 - Napisati ciklus koji ispisuje parne brojeve od 2 do 1000
         * 4 - Napisati ciklus koji ispisuje neparne brojeve od 1 do 1000
         */
		System.out.println("Ciklus koji ispisuje brojeve od 1 do 1000");
        for(int j=1; j<1001; j++){	
        	System.out.printf(" j = %d \n", j);
        }
        System.out.println("Ciklus koji ispisuje brojeve od 500 do 1");	
        for(int k=500; k>1; k--){
        	System.out.printf(" k = %d \n", k);
	}
        System.out.println("Ciklus koji ispisuje parne brojeve od 2 do 1000");
        for(int l=2; l<1001; l=l+2){
        	System.out.printf(" l = %d \n", l);
	}
        System.out.println("Ciklus koji ispisuje neparne brojeve od 2 do 1000");
        for(int m=3; m<1001; m=m+2){
        	System.out.printf(" m = %d \n", m);
        }
	}

}
