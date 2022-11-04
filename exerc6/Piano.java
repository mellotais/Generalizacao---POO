package exerc6;

public class Piano extends Cordas {
	private String tipoP;//Vertical , Cauda

	public Piano(float tamanho, int quantidadeCordas, String tipo, String tipoP) {
		super(tamanho, quantidadeCordas, tipo);
		this.tipoP = tipoP;
	}

	public String getTipo() {
		return tipoP;
	}

	public void setTipo(String tipoP) {
		this.tipoP = tipoP;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Piano [tipo=");
		builder.append(tipoP);
		builder.append("]");
		return builder.toString();
	}
	
	
}
