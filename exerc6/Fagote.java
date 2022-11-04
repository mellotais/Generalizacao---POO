package exerc6;

public class Fagote extends Madeiras {
	private String fabricante; //:(

	public Fagote(float tamanho, String tipo, String fabricante) {
		super(tamanho, tipo);
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Fagote [fabricante=");
		builder.append(fabricante);
		builder.append("]");
		return builder.toString();
	}
	
	
}
