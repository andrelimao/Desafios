package terceirodesafio;

import java.util.Scanner;
import java.util.ArrayList;


public class TerceiroDesafio {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre com o valor alvo:");
	int k = sc.nextInt();
	System.out.println("Quantos números serão digitados?");
	int n = sc.nextInt();
	int[] arr = new int[n];
	int contador = 0;
	System.out.println("Entre com os números:");
	for(int x = 0; x<arr.length; x++) {
		if(sc.hasNext()) {
			arr[x] = sc.nextInt();
		
	}
	
	for(int i = 0; i<arr.length; i++) {
		for(int j = i+1; i<arr.length-1; j++) {
			if (arr[i] - arr[j] == k|| arr[j]-arr[i] == k){
				contador ++;
				
			}
			
		}
	System.out.println("O número de pares é:" + contador);
	}

}
	}
  