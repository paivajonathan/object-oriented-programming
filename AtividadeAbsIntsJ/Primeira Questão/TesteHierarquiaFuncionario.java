
import java.util.ArrayList;

public class TesteHierarquiaFuncionario {
	public static void main(String[] args) {
		Funcionario g1 = new Gerente("Joao", "8372917", 3000);
		Funcionario a1 = new Assistente("José", "9084329", 2000);
		Funcionario v1 = new Vendedor("Mateus", "98743928", 4000, 300);

		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		lista.add(g1);
		lista.add(a1);
		lista.add(v1);

		double valorTotal = 0;

		for (Funcionario f : lista) {
			valorTotal += f.calcularSalario();
		}

		System.out.println("A soma do salário dos três é igual a " + valorTotal);
	}

}