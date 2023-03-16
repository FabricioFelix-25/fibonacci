package fibonacci;

import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
      int n, num1 = 0, num2 = 1;
      try (Scanner scanner = new Scanner(System.in)) {
		System.out.print("Quantos números da sequência de Fibonacci você quer gerar? ");
		  n = scanner.nextInt();
	}
      System.out.print("Sequência de Fibonacci de " + n + " números:");
      for (int i = 1; i <= n; ++i) {
         System.out.print(num1 + " ");
         int somaDosDoisNumerosAnteriores = num1 + num2;
         num1 = num2;
         num2 = somaDosDoisNumerosAnteriores;
      }
   }}


