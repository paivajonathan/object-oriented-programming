public class TesteCartaoWeb {
	public static void main(String[] args) {
		CartaoWeb[] cw = { 
			new DiaDosNamorados("João"), 
			new Natal("José"), 
			new Aniversario("Jonas") };

		for (CartaoWeb i : cw) {
			i.showMessage();
			System.out.println();
		}

	}
}