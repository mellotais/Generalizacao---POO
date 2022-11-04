package exerc6;

public class Tambor extends Percussao {
	private String tipoTb; //surdos, repiques, caixas, tamborins e cuícas.

	public Tambor(float tamanho, String tipo, String material, String tipoTb) {
		super(tamanho, tipo, material);
		this.tipoTb = tipoTb;
	}

	public String getTipoTb() {
		return tipoTb;
	}

	public void setTipoTb(String tipoTb) {
		this.tipoTb = tipoTb;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Tambor [tipoTb=");
		builder.append(tipoTb);
		builder.append("]");
		return builder.toString();
	}
	
	
}
