public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado e1 = new Empregado("Cleiton Carvalho", "Rua Pindorama", "8483-4324", 1, 1000, 5);
		Empregado e2 = new Empregado("Roberto Souza", "Rua Magalhães", "11998767876", 1, 1000, 5);

		System.out.println(e1.getNome());
		System.out.println(e1.getEndereco());
		System.out.println(e1.getTelefone());
		System.out.println(e1.getCodigoSetor());
		System.out.println(e1.getSalarioBase());
		System.out.println(e1.getImposto());
		System.out.println(e1.calcularSalario());

		System.out.println("-----------------------------");

		System.out.println(e2.getNome());
		System.out.println(e2.getEndereco());
		System.out.println(e2.getTelefone());
		System.out.println(e2.getCodigoSetor());
		System.out.println(e2.getSalarioBase());
		System.out.println(e2.getImposto());
		System.out.println(e2.calcularSalario());
	}
}