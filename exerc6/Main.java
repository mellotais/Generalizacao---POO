package exerc6;

public class Main {

	public static void main(String[] args) {
		Piano p = new Piano(135, 23, "Percurtidas", "Cauda");
		System.out.println(p.toString());
		
		Violao v = new Violao(60, 12, "Percurtidas", "Sim");
		System.out.println(v.toString());
		
		Trompete t = new Trompete(10, 30, 10, "Bastardo");
		System.out.println(t.toString());
		
		Tuba tb = new Tuba(38, 40, 10, 5);
		System.out.println(tb.toString());
		
		Prato pr = new Prato(35, "Fricção", "Metal", "Crash");
		System.out.println(pr.toString());
		
		Tambor tab = new Tambor(35, "Sim", "Metal", "repique");
		System.out.println(tab.toString());

		Saxofone s = new Saxofone(45, "Simples", "Si");
		System.out.println(s.toString());
		
		Fagote f = new Fagote(59, "Dupla", "França");
		System.out.println(f.toString());
	}

}
