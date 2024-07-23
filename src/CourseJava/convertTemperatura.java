package CourseJava;
import java.math.BigDecimal;
import java.util.Scanner;

public class convertTemperatura {

	public static void main(String[] args) {

		Scanner escaneador = new Scanner(System.in);

		System.out.println("Me forneça a temperatura em C° Celsius: ");
		String entrada = escaneador.nextLine();//Recebi a entrada de dados como uma String para que eu possa exibir a atual entrada de forma idêntica ao que foi inserido. 
		BigDecimal entradaConvertida = new BigDecimal(entrada); //Aqui eu transformei a String em uma classe BigDecimal, para contar o numero de casas decimais após a vírgula com o método .scale().
		int contaDecimais = entradaConvertida.scale();//Contando a casa com o método. 
		String tiraVirgula = entrada.replace(",","");//Aqui estou tirando a vírgula da entrada se houver.
		
		Double divisor = (contaDecimais *10)/tiraVirgula;
		double celsius = Double.parseDouble(tiraVirgula); //aqui eu fiz o famoso casting, decobrindo que para qualquer transfromação entre String e tipos primitivos é necessário utilizar métodos 

		escaneador.close();
		
		double fahrenheit = (celsius * 9/ 5) + 32;

		System.out.format("A conversão de %sC° para Fahrenheit foi: %.2f°F",entrada, fahrenheit);

	}

}
