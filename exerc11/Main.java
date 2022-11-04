package exerc11;

public class Main {

	public static void main(String[] args) {
		Peao p = new Peao(2 ,5 , "Branca", 2);
		System.out.println(p.Mover(2, 3)); // 2 colunas para a esquerda
		System.out.println(p.Mover(5, 5)); // 3 linhas para frente
		System.out.println(p.Mover(2, 6)); // 1 colunas para a direita (capturar)
		System.out.println(p.Mover(4, 5)); // 2 linhas para frente (movimento inicial)

	}

}
