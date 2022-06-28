package jana60;

public class Rettangolo implements Poligono {

	// Attributi

	private double base, altezza;

	// Costruttore
	public Rettangolo(double base, double altezza) throws Exception {

		datiValid(base);
		datiValid(altezza);

		this.base = base;
		this.altezza = altezza;
	}

	// Metodi Validatori

	private void datiValid(double dato) throws IllegalArgumentException {
		if (dato <= 0) {
			throw new IllegalArgumentException("Deve essere un numero superiore a 0 ");
		}
	}

	@Override
	public double calcolaPerimetro() {
		double perimetro = (base + altezza) * 2;
		return perimetro;
	}

	@Override
	public double calcolaArea() {
		double area = base * altezza;
		return area;
	}

	public String toString() {
		return "Perimetro: " + calcolaPerimetro() + "\n" + "Area: " + (calcolaArea());
	}
}
