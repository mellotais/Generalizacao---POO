package exerc6;

public class Madeiras extends InstrumentoMusical {
	private String tipo;//Palheta Simples , Palheta Dupla, Aresta

	public Madeiras(float tamanho, String tipo) {
		super(tamanho);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Madeiras [tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
}
