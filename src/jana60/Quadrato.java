package jana60;

public class Quadrato implements Poligono {
	private double lato;

	public Quadrato(double lato) throws Exception {
		datiValid(lato);
		this.lato = lato;
	}

	// Metodo Perimetro
	public double calcolaPerimetro() {
		double perimetro = lato * 4;
		return perimetro;
	}

	// Metodo Area
	public double calcolaArea() {
		double area = lato * lato;
		return area;
	}

	private void datiValid(double dato) throws IllegalArgumentException {
		if (dato <= 0)
			throw new IllegalArgumentException("ATTENZIONE: Nessuno dei dati può essere minore/uguale a 0!");
	}

	public String toString() {
		return "\n" + "Perimetro: " + calcolaPerimetro() + "\n" + "Area: " + (calcolaArea());
	}

}
