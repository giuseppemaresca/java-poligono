package jana60;

public class Triangolo implements Poligono {
	
	private double base,lato2,lato3,altezza;

	public Triangolo(double base, double lato2, double lato3, double altezza) {
		this.base =base;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.altezza = altezza;
	}
	

	@Override
	public double calcolaPerimetro() {
		double perimetro=base+lato2+lato3;
		return perimetro;
	}

	@Override
	public double calcolaArea() {
	double area=(base*altezza)/2;
		return area;
	}
	public String toString()
	{
		return "\n"	+ "Perimetro: "	+ calcolaPerimetro()	+ "\n"	+ "Area: "		+ (calcolaArea())		;	
	}

}
