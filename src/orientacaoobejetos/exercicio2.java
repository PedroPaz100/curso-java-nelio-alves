package orientacaoobejetos;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class exercicio2 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc= new Scanner(System.in);
	
	Funcionario x= new Funcionario();
	
	
	System.out.println("Nome funcion�rio");
	x.nome=sc.nextLine();
	System.out.println("Sal�rio bruto");
	x.salario=sc.nextDouble();
	System.out.println("Taxa/imposto");
	x.taxa=sc.nextDouble();
	
	System.out.println();
    System.out.println("Dados do funcion�rio: " + x);
	
    System.out.print("Porcentagem de aumento no sal�rio: ");
    double porcentagem = sc.nextDouble();
    x.addSalario(porcentagem);
	
	System.out.println("Dados atualizados: " + x);
	
	sc.close();
	

	}

}
