package exerc8;

public class Banheiro extends Ambiente {
	public boolean banheira;

	public Banheiro(float area, boolean banheira) {
		super(area);
		this.banheira = banheira;
	}

	public boolean isBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" -  Banheiro [banheira=");
		builder.append(banheira);
		builder.append("]");
		return builder.toString();
	}
}
