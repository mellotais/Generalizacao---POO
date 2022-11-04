package exerc5;

public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro("Casa", 100, "Caramelo");
		System.out.println(c.toString());
		
		Gato g = new Gato("Casa", 120, "Persa");
		System.out.println(g.toString());
		
		Tartaruga t = new Tartaruga("Marinho", true, "Tortuguita");
		System.out.println(t.toString());
		
		Lagarto l = new Lagarto("Ali", true, "Lacoste");
		System.out.println(l.toString());

	}

}
