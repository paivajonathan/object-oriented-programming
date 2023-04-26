public class Aniversario extends CartaoWeb {

	public Aniversario(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.printf("Feliz aniversário, %s!", getDestinatario());
	}

}