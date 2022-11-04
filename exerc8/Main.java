package exerc8;

public class Main {

	public static void main(String[] args) {
		Quarto q = new Quarto(12, 4);
		System.out.println(q.toString());
		
		Sala s = new Sala(2, false);
		System.out.println(s.toString());
		
		Banheiro b = new Banheiro(40, true);
		System.out.println(b.toString());
		
		Cozinha c = new Cozinha(80, true);
		System.out.println(c.toString());

	}

}
