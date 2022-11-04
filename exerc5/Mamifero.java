package exerc5;

public class Mamifero extends Animal {
	private int tempoGestacao;
	
	public Mamifero(String habitat, int tempoGestacao) {
		super(habitat);
		this.tempoGestacao = tempoGestacao;
	}

	public int getTempoGestacao() {
		return tempoGestacao;
	}

	public void setTempoGestacao(int tempoGestacao) {
		this.tempoGestacao = tempoGestacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Mamifero [tempoGestacao=");
		builder.append(tempoGestacao);
		builder.append("]");
		return builder.toString();
	}
	
	
}
