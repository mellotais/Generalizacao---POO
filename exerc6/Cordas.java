package exerc6;

public class Cordas extends InstrumentoMusical {
	private int quantidadeCordas;
	private String tipo; //friccionadas, percutidas, dedilhadas, sopradas
	
	public Cordas(float tamanho, int quantidadeCordas, String tipo) {
		super(tamanho);
		this.quantidadeCordas = quantidadeCordas;
		this.tipo = tipo;
	}

	public int getQuantidadeCordas() {
		return quantidadeCordas;
	}

	public void setQuantidadeCordas(int quantidadeCordas) {
		this.quantidadeCordas = quantidadeCordas;
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
		builder.append("- Cordas [quantidadeCordas=");
		builder.append(quantidadeCordas);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

}
