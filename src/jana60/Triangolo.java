package jana60;

public class Triangolo implements Poligono {

	private double base, lato2, lato3, altezza;

	public Triangolo(double base, double lato2, double lato3, double altezza) throws Exception {

		datiValid(base);
		datiValid(lato2);
		datiValid(lato3);
		datiValid(altezza);

		this.base = base;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.altezza = altezza;
	}

	private void datiValid(double dato) throws IllegalArgumentException {
		if (dato <= 0)
			throw new IllegalArgumentException("ATTENZIONE: Nessuno dei dati può essere minore/uguale a 0!");
	}

	@Override
	public double calcolaPerimetro() {
		double perimetro = base + lato2 + lato3;
		return perimetro;
	}

	@Override
	public double calcolaArea() {
		double area = (base * altezza) / 2;
		return area;
	}

	public String toString() {
		return "\n" + "Perimetro: " + calcolaPerimetro() + "\n" + "Area: " + (calcolaArea());
	}

}
