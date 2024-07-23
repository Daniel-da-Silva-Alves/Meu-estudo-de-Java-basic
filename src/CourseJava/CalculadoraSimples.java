package CourseJava;

import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {

		/*
		 * Apresentação
		 * 
		 * Nesta atividade estarei explorando a formatação das saídas de dados com dois
		 * métodos específicos que são:
		 * 
		 * system.out.format() String.format()
		 */

		double numero1;
		double numero2;
		double adicao;
		double subtracao;
		double divisao;
		double multiplicacao;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escreva o primeiro número: ");
		numero1 = scanner.nextDouble(); // o método nextDouble basicamente orienta que o sistema deve ler a próxima
										// entrada como um dado do tipo double

		System.out.println("Escreva o segundo número: ");
		numero2 = scanner.nextDouble();// o método nextDouble basicamente orienta que o sistema deve ler a próxima
										// entrada como um dado do tipo double

		scanner.close(); // Após a leitura da entrada de dados eu finalizei o scanner para liberar os
							// recursos associados

		adicao = numero1 + numero2; // lógica das operações que a calculadora simples realiza

		subtracao = numero1 - numero2;

		divisao = numero1 / numero2;

		multiplicacao = numero1 * numero2;

		// Aqui experimentei trabalhar com a saída de dados personalizada pelo
		// system.out.format
		System.out.println("_________________________________________________");
		System.out.println("Resultados formatados com o system.out.format():");
		System.out.format("%.1f + %.1f = %.1f%n", numero1, numero2, adicao);
		System.out.format("%.1f - %.1f = %.1f%n", numero1, numero2, subtracao);
		System.out.format("%.1f / %.1f = %.1f%n", numero1, numero2, divisao);
		System.out.format("%.1f * %.1f = %.1f%n", numero1, numero2, multiplicacao);
		System.out.println("_________________________________________________");

		// Aqui experimentei trabalhar com a saída de dados personalizada pelo
		// String.format que imprime uma saída de String formata

		String resultadoFormatadoAdicao = String.format("%n %.1f + %.1f = %.1f", numero1, numero2, adicao);
		String resultadoFormatadoSubtracao = String.format("%n %.1f - %.1f = %.1f", numero1, numero2, subtracao);
		String resultadoFormatadoDivisao = String.format("%n %.1f / %.1f = %.1f", numero1, numero2, divisao);
		String resultadoFormatadoMultiplicacao = String.format("%n %.1f * %.1f = %.1f", numero1, numero2,
				multiplicacao);

		// Necessário observar que usei o método .format() para "formatar" tudo dentro
		// do parênteses que agora são strings e armazenar em uma variável que será
		// exibida posteriormente
		System.out.println("Resultados formatados com o String.format():");
		System.out.print(resultadoFormatadoAdicao); // Nesta etapa estou apenas exibindo o valor que armazenei dentro da
													// variável
		System.out.print(resultadoFormatadoSubtracao);
		System.out.print(resultadoFormatadoDivisao);
		System.out.print(resultadoFormatadoMultiplicacao);

		// Observações minhas: É bem mais prático usar o primeiro método, mas o segundo
		// me permite chegar a resultados mais agradáveis na formatação.
	}
}
