public class Circulo implements FormaGeometrica {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}

	@Override
	public String mostrarDados() {
		return String.format("Raio: %f", this.raio);
	}

}