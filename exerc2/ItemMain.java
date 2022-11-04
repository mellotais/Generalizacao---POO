package exerc2;

public class ItemMain {

	public static void main(String[] args) {
		Livro l = new Livro(2, "Sim", "Alguem");
		System.out.println(l.toString());
		
		Midia m = new Midia(2, "Algo", "Ali", 15);
		System.out.println(m.toString());
		
		Cd cd = new Cd(12, "a ", "n", 12, 9, "pl", "a");
		System.out.println(cd.toString());
		
		Vhs v = new Vhs(3, "aaa", "dsdsds", 1, "aaa");
		System.out.println(v.toString());
	}

}
