package jana60;
import java.util.Scanner;
public class TestMain {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);		
		 
	      System.out.println("Esempio di rettangolo con base 5 e altezza 10 : ");
	      Rettangolo n=new Rettangolo(5,10);
	      
	      System.out.println(n.toString());
	      
	      System.out.println("Esempio di quadrato con base 7 e altezza 14 : ");
	    
	      Quadrato q=new Quadrato(7,14);
	      
	      System.out.println(q.toString());
	      
	      System.out.println("Esempio di triangolo con base 5, lati 10 e altezza 8 : ");
	      
	      Triangolo t=new Triangolo(5,10,10,8);
	      
	      System.out.println(t.toString());
	      scan.close();
	      
	}

}
