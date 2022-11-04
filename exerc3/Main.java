package exerc3;

public class Main {

	public static void main(String[] args) {
		ContaSimples cs = new ContaSimples("Cadeira", 1, 2, 500, 500);
		System.out.println(cs.toString());
		cs.depositoPoupanca(200);
		System.out.println(cs.toString());

	}

}
