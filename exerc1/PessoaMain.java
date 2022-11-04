package exerc1;

public class PessoaMain {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Carlos");
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa("Teste", "Ali ó");
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		PessoaFisica pf = new PessoaFisica("Carlinhos", "Ali perto", "123", "Solto");
		System.out.println(pf.toString());
		
		PessoaJuridica pj = new PessoaJuridica("Carlinhos", "Ali perto", "123", "Falida");
		System.out.println(pj.toString());

	}

}
