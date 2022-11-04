package exerc6;

public class Trompete extends Metais {
	private String tipoT; // C ou Si Bemol , Mi Bemol, Bastardo, rompete de Varas

	public Trompete(float tamanho, float comprimentoTubo, float espessuras, String tipoT) {
		super(tamanho, comprimentoTubo, espessuras);
		this.tipoT = tipoT;
	}

	public String getTipoT() {
		return tipoT;
	}

	public void setTipoT(String tipoT) {
		this.tipoT = tipoT;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Trompete [tipoT=");
		builder.append(tipoT);
		builder.append("]");
		return builder.toString();
	}
}
