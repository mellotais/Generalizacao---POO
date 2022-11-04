package exerc5;

public class Animal {
	private String habitat;

	public Animal(String habitat) {
		super();
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [habitat=");
		builder.append(habitat);
		builder.append("]");
		return builder.toString();
	}
	
	
}
