package exerc11;

public class Peao extends Peca {

	public Peao(int linha, int coluna, String cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}

	public boolean Mover(int linha, int coluna) {
		
		if ((linha - this.getLinha()) > 2 || linha - this.getLinha() < 0 || coluna - this.getColuna() > 1 || coluna - this.getColuna() < -1 ){
			return false;
		}else {
			return true;
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Peao[]");
		return builder.toString();
	}
	
	
}
