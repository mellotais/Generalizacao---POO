package exerc6;

public class Percussao extends InstrumentoMusical {
	private String tipo;//Agitação, Fricção
	private String material;
	
	public Percussao(float tamanho, String tipo, String material) {
		super(tamanho);
		this.tipo = tipo;
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Percussao [tipo=");
		builder.append(tipo);
		builder.append(", material=");
		builder.append(material);
		builder.append("]");
		return builder.toString();
	}
	
	
}
