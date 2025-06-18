package orientacaoobejetos;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class exercicio2 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc= new Scanner(System.in);
	
	Funcionario x= new Funcionario();
	
	
	System.out.println("Nome funcionário");
	x.nome=sc.nextLine();
	System.out.println("Salário bruto");
	x.salario=sc.nextDouble();
	System.out.println("Taxa/imposto");
	x.taxa=sc.nextDouble();
	
	System.out.println();
    System.out.println("Dados do funcionário: " + x);
	
    System.out.print("Porcentagem de aumento no salário: ");
    double porcentagem = sc.nextDouble();
    x.addSalario(porcentagem);
	
	System.out.println("Dados atualizados: " + x);
	
	sc.close();
	

	}

}
