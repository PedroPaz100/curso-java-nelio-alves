package entidades;

public class Funcionario {
	
	public String nome;
	public Double salario;
	public Double taxa;
	
	public Double salarioLiquido(){
		return salario-taxa;
	}
	public void addSalario(double porcentagem){
		salario += (salario*porcentagem)/100;
	}
	public String toString() {
        return "Funcionário: " + nome
             + ", Salário bruto: " + String.format("%.2f", salario)
             + ", Taxa: " + String.format("%.2f", taxa)
             + ", Salário líquido: " + String.format("%.2f", salarioLiquido());
    }
	
}
