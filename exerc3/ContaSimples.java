package exerc3;

public class ContaSimples extends Conta {
	private double saldoPoupanca;
	
	public ContaSimples(String banco, int agencia, int nconta, double saldo, double saldoPoupanca) {
		super(banco, agencia, nconta, saldo);
		this.saldoPoupanca = saldoPoupanca;
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public void depositoPoupanca(double deposito) {
		this.saldoPoupanca += deposito;
	}
	
	public void saquePoupanca(double saque) {
		this.saldoPoupanca -= saque;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append("]");
		return builder.toString();
	}
	
	
}
