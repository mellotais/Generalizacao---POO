package exerc10;

public class Bomba {
	private double totalLitros;
	private float valorLitro;
	
	public Bomba(double totalLitros, float valorLitro) {
		super();
		this.totalLitros = totalLitros;
		this.valorLitro = valorLitro;
	}

	public double getTotalLitros() {
		return totalLitros;
	}

	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public boolean abastecerPorLitro (int litros) {
		if (litros <= 0) {
			return false;
		}else {
			if (getTotalLitros() > litros) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	public boolean abastecerPorValor (double valor){
		
		if (valor <= 0) {
			return false;
		}else {
			if (valor/getValorLitro() > getTotalLitros()) {
				return false; 
			}else {
				return true;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
}
