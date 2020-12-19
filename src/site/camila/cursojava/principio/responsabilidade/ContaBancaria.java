package site.camila.cursojava.principio.responsabilidade;

public class ContaBancaria {
	private String descricao;
	private double saldo = 8000;
	
	public void soma100Reais() {
		this.saldo += 100;
	}
	
	public void diminui100Reais() {
		this.saldo -= 100;
	}
	
	public void sacarDinheiro(Double saque) {
		this.saldo -= saque;
	}
	
	public void depositoDinheiro(Double deposito) {
		this.saldo += deposito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	
}
