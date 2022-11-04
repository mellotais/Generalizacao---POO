package exerc5;

public class Reptil extends Animal {
	private boolean patas;

	public Reptil(String habitat, boolean patas) {
		super(habitat);
		this.patas = patas;
	}

	public boolean isPatas() {
		return patas;
	}

	public void setPatas(boolean patas) {
		this.patas = patas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Reptil [patas=");
		builder.append(patas);
		builder.append("]");
		return builder.toString();
	}
	
	
}
