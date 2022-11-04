package exerc7;

public class Professor extends Pessoa {
	private String materia;

	public Professor(String nome, String endereco, int codigo, String materia) {
		super(nome, endereco, codigo);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Professor [materia=");
		builder.append(materia);
		builder.append("]");
		return builder.toString();
	}
}
