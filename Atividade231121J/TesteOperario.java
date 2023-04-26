public class TesteOperario {
	public static void main(String[] args) {
		Operario op1 = new Operario("Vitor", "Rua das flores", "7623-8762", 5, 2000, 5, 500, 3);

		System.out.println(op1.getNome());
		System.out.println(op1.getEndereco());
		System.out.println(op1.getTelefone());

		System.out.println(op1.getCodigoSetor());
		System.out.println(op1.getSalarioBase());
		System.out.println(op1.getImposto());

		System.out.println(op1.getValorProducao());
		System.out.println(op1.getComissao());

		System.out.println(op1.calcularSalario());
	}
}