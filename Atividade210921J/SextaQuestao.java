


public class SextaQuestao {
	public static void main(String[] args) {
		int[] quadImp = new int[10];
		int cont = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				quadImp[cont] = i * i;
				cont++;
			}
		}

		for (int i = 0; i < quadImp.length; i++) {
			System.out.print(quadImp[i] + " ");
		}
	}
}