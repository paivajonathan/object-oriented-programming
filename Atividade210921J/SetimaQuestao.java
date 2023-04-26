public class SetimaQuestao {
	public static void main(String[] args) {
		int[] a = {3, 5, 7, 8, 10};
		int[] b = new int[5];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i] * 2;
		}

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}