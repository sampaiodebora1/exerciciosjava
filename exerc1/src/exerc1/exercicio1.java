package exerc1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		float salario1 = leia.nextFloat();
		System.out.print("Digite o abono: ");
		float abono1 = leia.nextFloat();
		
		float salarionovo1 = salario1 + abono1;
		System.out.print("Digite o salário novo: " +salarionovo1);
		
		leia.close();
		    }
		


	}


