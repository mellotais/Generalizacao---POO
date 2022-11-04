package exerc6;

public class Prato extends Percussao {
	private String categoria;

	public Prato(float tamanho, String tipo, String material, String categoria) {
		super(tamanho, tipo, material);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Prato [categoria=");
		builder.append(categoria);
		builder.append("]");
		return builder.toString();
	}
	
	
}
