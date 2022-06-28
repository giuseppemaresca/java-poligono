package jana60;
public class Rettangolo implements Poligono {
	
	//Attributi
	
	private double base,altezza;
	

	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcolaPerimetro() {
	double perimetro= (base+altezza)*2;
		return perimetro;
	}

	@Override
	public double calcolaArea() {
		double area=base*altezza;
		return area;
	}
	public String toString()
	{
		return  "Perimetro: "	+ calcolaPerimetro()	+ "\n"	+ "Area: "		+ (calcolaArea())		;	
	}
}
