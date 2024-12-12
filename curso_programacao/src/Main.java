import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nome;
		int idade ;
		double altura ;
		
		
	
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		// Entrada de nome 
		System.out.println("Diga seu nome por favor :");
		nome = sc.nextLine();
		
		// Entrada de idade 
		System.out.println("agora sua idade");
		idade = sc.nextInt();
		
		// Limpeza de buffer 
		sc.nextLine();	
		
		// Entrada de altura
		System.out.println("altura:");
		altura = sc.nextDouble();
			
		
		// Exibiçao de dados	
		System.out.println("seu nome é " + nome);
		System.out.println ("voce tem " + idade + "anos");
		System.out.printf("e mede %.2f metros.\n", altura);
		
		
		
		// fechando scanner
		sc.close();
		
	}

}
