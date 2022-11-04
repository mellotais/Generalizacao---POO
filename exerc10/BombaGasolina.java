package exerc10;

public class BombaGasolina extends Bomba {
	private String marca;

	public BombaGasolina(double totalLitros, float valorLitro, String marca) {
		super(totalLitros, valorLitro);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - BombaGasolina [marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}
	
	
}
