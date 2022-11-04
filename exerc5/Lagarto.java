package exerc5;

public class Lagarto extends Reptil {
	private String especie;

	public Lagarto(String habitat, boolean patas, String especie) {
		super(habitat, patas);
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Lagarto [especie=");
		builder.append(especie);
		builder.append("]");
		return builder.toString();
	}
	
	
}
