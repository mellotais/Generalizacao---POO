package exerc6;

public class InstrumentoMusical {
	private float tamanho; //centimetros

	public InstrumentoMusical(float tamanho) {
		super();
		this.tamanho = tamanho;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InstrumentoMusical [tamanho=");
		builder.append(tamanho);
		builder.append("]");
		return builder.toString();
	}
}
