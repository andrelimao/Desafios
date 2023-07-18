package primeirodesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {
	
	public static void main(String[] args) {
		List<Integer> numerosPares = new ArrayList<>();
		List<Integer> numerosImpares = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Insira quantos números serão digitados");
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length;i++) {
			System.out.println("Insira os números:");
			arr[i] = input.nextInt();
			if(arr[i] % 2 == 0) {
				numerosPares.add(arr[i]);
			}
			else {
				numerosImpares.add(arr[i]);
			}
			
		}
		Collections.sort(numerosPares);
		System.out.println(numerosPares);
		Collections.sort(numerosImpares, Collections.reverseOrder());
		System.out.println(numerosImpares);
	}
}
