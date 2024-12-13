import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nome;
		int idade, peso;
		double altura;
		double resultado;

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// Entrada de nome
		System.out.println("Diga seu nome por favor:");
		nome = sc.nextLine();

		// Entrada de idade
		System.out.println("Sua idade:");
		idade = sc.nextInt();

		// Entrada peso

		System.out.println("Seu peso:");
		peso = sc.nextInt();

		// Limpeza de buffer
		sc.nextLine();

		// Entrada de altura
		System.out.println("altura:");
		altura = sc.nextDouble();

		// operação IMC

		resultado = (double) peso / (altura * altura);

		// Exibiçao de dados
		System.out.printf("%s, voce está pesando %d kg e tem %.2f metros de altura.%n",nome,peso,altura);

		System.out.println();

		System.out.printf("O seu IMC é : %.2f%n ", resultado);

		// estrutura condicional
			
		if (resultado < 18.5) {

			System.out.println("Abaixo do peso Procure se alimentar melhor");
		}
		else if (resultado < 24.9) {
			
			System.out.println("Peso normal Parabéns");
		}
		else if (resultado < 29.9) {
			
			System.out.println("Pré obesidade Procure um medico !!!");
		}
		else if (resultado < 34.9 ) {
			
			System.out.println("Obeso I Procure um medico !!!");
		}
		else if (resultado < 39.9) {
			
			System.out.println("Obeso II Procure um medico !!!");
		} else {  
			
			System.out.println("obeso III Procure um medico !!!");
		}
		
		// fechando scanner
		sc.close();

	}

}
