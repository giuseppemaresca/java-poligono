package jana60;

public class Quadrato implements Poligono {
	private double base;
	private double altezza;
	
	
	public Quadrato(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	//Metodo Perimetro
	public double calcolaPerimetro()
	{
           double perimetro= (base+altezza)*2;
           return perimetro;
    }
	//Metodo Area
	public double calcolaArea()
	{
		double area =base*altezza;
		return area;
	}
	
	public String toString()
	{
		return 					"\n"	+ "Perimetro: "	+ calcolaPerimetro()	+
				"\n"	+ "Area: "		+ (calcolaArea())		;	
	}

}
