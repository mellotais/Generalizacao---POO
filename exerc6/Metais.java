package exerc6;

public class Metais extends InstrumentoMusical {
	private float comprimentoTubo; //normalmente o tubo é enrolado
	private float espessuras;
	public Metais(float tamanho, float comprimentoTubo, float espessuras) {
		super(tamanho);
		this.comprimentoTubo = comprimentoTubo;
		this.espessuras = espessuras;
	}
	
	public float getComprimentoTubo() {
		return comprimentoTubo;
	}
	public void setComprimentoTubo(float comprimentoTubo) {
		this.comprimentoTubo = comprimentoTubo;
	}
	public float getEspessuras() {
		return espessuras;
	}
	public void setEspessuras(float espessuras) {
		this.espessuras = espessuras;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("- Metais [comprimentoTubo=");
		builder.append(comprimentoTubo);
		builder.append(", espessuras=");
		builder.append(espessuras);
		builder.append("]");
		return builder.toString();
	}
	
	
}
