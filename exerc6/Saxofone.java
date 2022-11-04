package exerc6;

public class Saxofone extends Madeiras {
	private String tom;

	public Saxofone(float tamanho, String tipo, String tom) {
		super(tamanho, tipo);
		this.tom = tom;
	}

	public String getTom() {
		return tom;
	}

	public void setTom(String tom) {
		this.tom = tom;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Saxofone [tom=");
		builder.append(tom);
		builder.append("]");
		return builder.toString();
	}
	
	
}
