package CourseJava;

import java.util.Scanner;

public class convertTemperatura {

	public static void main(String[] args) {

		Scanner escaneador = new Scanner(System.in);

		System.out.println("Me forneça a temperatura em C° Celsius: ");
		
		//Se a entrada for do tipo Double o programa deve fazer:
		
		if (escaneador.hasNextDouble()) {
			double celsius = escaneador.nextDouble(); // Aqui estou definindo que a variável Celsius é o próximo input Double que o usuário inserir
			double fahrenheit = (celsius * 9/ 5) + 32; //Aqui estou utilizando a variável na fórmula de conversão para fahrenheit
			System.out.format("A conversão de %.2fC° para Fahrenheit foi: %.2f°F", celsius, fahrenheit);
		} else if(escaneador.hasNextInt()) {
			int celsiusInteiro = escaneador.nextInt();
			double celsius = celsiusInteiro;
			double fahrenheit = (celsius * 9/ 5) + 32; //Aqui estou utilizando a variável na fórmula de conversão para fahrenheit
			System.out.format("A conversão de %.2fC° para Fahrenheit foi: %.2f°F", celsius, fahrenheit);
		} else {
			 System.out.println("A entrada não é um número!");
		}
		
		escaneador.close();
	

	}

}
