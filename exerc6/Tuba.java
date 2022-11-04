package exerc6;

public class Tuba extends Metais {
	private int numeroValvulas; //entre 3 e 5

	public Tuba(float tamanho, float comprimentoTubo, float espessuras, int numeroValvulas) {
		super(tamanho, comprimentoTubo, espessuras);
		this.numeroValvulas = numeroValvulas;
	}

	public int getNumeroValvulas() {
		return numeroValvulas;
	}

	public void setNumeroValvulas(int numeroValvulas) {
		this.numeroValvulas = numeroValvulas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Tuba [numeroValvulas=");
		builder.append(numeroValvulas);
		builder.append("]");
		return builder.toString();
	}
	
}
