
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    
	    //entrada
	    System.out.print("Digite a 1º nota:");
	    Double n1= input.nextDouble();
	    
	    System.out.print("Digite a 2º nota:");
	    Double n2 = input.nextDouble();
	    
	    System.out.print("Digite a 3º nota:");
	    Double n3 = input.nextDouble();
	    
	    System.out.print("Digite a 4º nota:");
	    Double n4 = input.nextDouble();
	    
	    System.out.print("Digite a 5º nota:");
	    Double n5 = input.nextDouble();
	    
	    System.out.print("Digite a 6º nota:");
	    Double n6 = input.nextDouble();
	    
	    System.out.print("Digite a 7º nota:");
	    Double n7 = input.nextDouble();
	    
	    System.out.print("Digite a 8º nota:");
	    Double n8 = input.nextDouble();
	    
	    //procesamento 1º Semestre
	      Double media1 = n1 + n2;
	      Double media2 = n3 + n4;
	      Double result = (media1 + media2) / 2;
	      Double div = result / 2;
	      
	     //procesamento 1º Semestre
	      Double media3 = n5 + n6;
	      Double media4 = n7 + n8;
	      Double result1 = (media1 + media2) / 2;
	      Double div1 = result / 2;
	      
	     //Media final
	      double mfinal = (div + div1) / 2;
	      
	     //Saida 1º Semestre
	      System.out.println("----------------------------");
	      System.out.printf("A Media do 1º Bimestre é: %.1f \n", media1 / 2 );
	      System.out.printf("A Media do 2º Bimestre é: %.1f \n", media2 / 2 );
	      System.out.printf("A Media do 1º Semestre é: %.1f \n", div1);
	      
	     //Saida 2º Semestre
	      System.out.println("----------------------------");
	      System.out.printf("A Media do 3º Bimestre é: %.1f \n", media3 / 2 );
	      System.out.printf("A Media do 4º Bimestre é: %.1f \n", media4 / 2 );
	      System.out.printf("A Media do 2º Semestre é: %.1f \n", div1);
	      
	     //Media Final
	      System.out.printf("----------------------------");
	      System.out.printf("Media final é: %.1f", mfinal);
	      
	}     
    }	      
	      