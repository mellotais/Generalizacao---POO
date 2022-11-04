package exerc7;

public class Aluno extends Pessoa {
	private int matricula;

	public Aluno(String nome, String endereco, int codigo, int matricula) {
		super(nome, endereco, codigo);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Aluno [matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
	
	
}
