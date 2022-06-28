package jana60;
public class TestMain {

	public static void main(String[] args) throws Exception {
		try {		 
	      System.out.println("Esempio di rettangolo con base 5 e altezza 10 : ");
	      Rettangolo n=new Rettangolo(5,10);
	      
	      System.out.println(n.toString());
	      
	      System.out.println("Esempio di quadrato lato 14: ");
	    
	      Quadrato q=new Quadrato(14);
	      
	      System.out.println(q.toString());
	      
	      System.out.println("Esempio di triangolo con base 5, lati 10 e altezza 8 : ");
	      
	      Triangolo t=new Triangolo(5,10,10,8);
	      
	      System.out.println(t.toString());
	      
	} catch (Exception e)
		{
		System.out.println("C'è un errore, riprova. ");
		System.out.println(e.getMessage());
		}
		
	}
}
