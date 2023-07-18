package quartodesafio;

import java.util.Scanner;
 
public class QuartoDesafio {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		for (int i = 0; i < n; i++) {
			String frase = readLine(leitor);
			StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
			StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			parte1.reverse();
			parte2.reverse();
			System.out.println(parte1.toString() + parte2.toString());
	}
}

public static String readLine(Scanner leitor) {
	String line = leitor.nextLine();
	while (line.isEmpty())
		line = leitor.nextLine();
	return line;
}

}