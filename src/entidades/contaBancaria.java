package entidades;

public class contaBancaria {
	private String nome;
	private int numeroConta;
	private Double saldo;
	
	public contaBancaria(String nome,int numeroConta, Double saldo) {
		this.nome=nome;
		this.numeroConta=numeroConta;
		this.saldo=saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
	    this.saldo += valor;
	}

	public void sacar(double valor) {
	    this.saldo =(saldo-valor)-5;
	}
	public String toString(){
		return "Nº Conta: "+numeroConta+", "+"Titular: "+nome+", "+"Saldo: "+saldo;
	}
}
