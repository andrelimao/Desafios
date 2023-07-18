package segundodesafio;

import java.util.Scanner;

public class SegundoDesafio {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double valor = scanner.nextDouble();
	
	        double[] cedulas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
	        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
	
	        System.out.println("NOTAS:");
	        for (double cedula : cedulas) {
	            int quantidadeNotas = (int) (valor / cedula);
	            valor %= cedula;
	            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, (double) cedula);
	        }
	
	        System.out.println("MOEDAS:");
	        for (double moeda : moedas) {
	            int quantidadeMoedas = (int) (valor / moeda);
	            valor %= moeda;
	            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda);
	        }
	    }
	}
}

