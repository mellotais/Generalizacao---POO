package exerc6;

public class Violao extends Cordas {
	private String tipoV;

	public Violao(float tamanho, int quantidadeCordas, String tipo, String tipoV) {
		super(tamanho, quantidadeCordas, tipo);
		this.tipoV = tipoV;
	}

	public String getTipo() {
		return tipoV;
	}

	public void setTipo(String tipoV) {
		this.tipoV = tipoV;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Violao [tipo=");
		builder.append(tipoV);
		builder.append("]");
		return builder.toString();
	}
	
	
}
