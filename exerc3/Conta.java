package exerc3;

public class Conta {
	private String banco;
	private int agencia;
	private int nconta;
	private double saldo;
	
	public Conta(String banco, int agencia, int nconta, double saldo) {
		super();
		this.banco = banco;
		this.agencia = agencia;
		this.nconta = nconta;
		this.saldo = saldo;
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNconta() {
		return nconta;
	}
	public void setNconta(int nconta) {
		this.nconta = nconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo -= saque;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", nconta=");
		builder.append(nconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
