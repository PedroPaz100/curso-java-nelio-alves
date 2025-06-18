package entidades;

public class Produto {
	public String nome;
	public Double preco;
	public int quantidade;
	
	public  Double totalestoque(){
		return quantidade*preco;  
	}
	public void removeestoque(int qnt){
		this.quantidade = quantidade-qnt;
	}
	public void addestoque(int qnt){
		this.quantidade = quantidade+qnt;
	}
	
	 public String toString() {
	        return nome + ", R$" + String.format("%.2f", preco) + 
	               ", " + quantidade + " unidades, total: R$ " + String.format("%.2f", totalestoque());
	    }
}
