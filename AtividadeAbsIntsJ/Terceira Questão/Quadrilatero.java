public abstract class Quadrilatero implements FormaGeometrica {
	private double lado1, lado2, lado3, lado4;

	public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}

	@Override
	public double calcularPerimetro() {
		return (this.lado1 + this.lado2 + this.lado3 + this.lado4);
	}

	@Override
	public double calcularArea() {
		return this.lado1 * this.lado3;	
	}

	@Override
	public String mostrarDados() {
		return String.format("Lado 1: %f, lado 2: %f, lado 3: %f, lado 4: %f", this.lado1, this.lado2, this.lado3, this.lado4);
	}

}