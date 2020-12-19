package site.camila.cursojava.principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria();
		
		contaBancaria.setDescricao("Conta Bancária da Camila");
		System.out.println(contaBancaria);
		
		contaBancaria.diminui100Reais();
		contaBancaria.diminui100Reais();
		System.out.println(contaBancaria);
		
		contaBancaria.sacarDinheiro(400.0);
		System.out.println(contaBancaria);
		
		contaBancaria.depositoDinheiro(1000.0);
		System.out.println(contaBancaria);
		
		contaBancaria.soma100Reais();
		System.out.println(contaBancaria);

	}

}
