/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	     
	     // Entrada de dados
	     
	     System.out.print("Digite a temperatura em graus Celsius:");
	     Double celsius = entrada.nextDouble();
	     
	     // Processamento 
	     
	     Double fahrenheit = (celsius + 9 / 5) + 32;
	     Double kelvin = celsius + 273.15;
	     
	     //Saidas
	     
	     System.out.println("\n=== Conversão de Temperatura ===");
	     System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);
	     System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
	     System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
	    
	    
	    
		
	}
}