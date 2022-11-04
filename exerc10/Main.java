package exerc10;

public class Main {

	public static void main(String[] args) {
		Bomba b = new Bomba(100, 10);
		 
		//Abastecer mais que o total da bomba
		System.out.println(b.abastecerPorValor(1001));
		System.out.println(b.abastecerPorLitro(101));
		
		BombaGasolina bg = new BombaGasolina(100, 10, "teste");
		System.out.println(bg.toString());
		
		System.out.println(bg.abastecerPorValor(1001));
		System.out.println(bg.abastecerPorLitro(101));
		
		BombaEtanol be = new BombaEtanol(100, 20, "teste");
		System.out.println(be.toString());
		
		System.out.println(be.abastecerPorValor(1001));
		System.out.println(be.abastecerPorLitro(101));
		
		BombaDiesel bd = new BombaDiesel(800, 4, "teste");
		System.out.println(bd.toString());
		
		System.out.println(bd.abastecerPorValor(1001));
		System.out.println(bd.abastecerPorLitro(101));
		

		
		

	}

}
