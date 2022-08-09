import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		//Declaração das Variaveis
		int opcao = -1;
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		
		//Instancia das classes e objetos que vamos utilizar
		Scanner entrada = new Scanner(System.in);
		
		while (opcao !=0) {
			//Apresentação das opções do menu ao usuario
			System.out.print("\n\n-----------Calculadora----------" +"\n"
			        + "\n   |    1 - Somar           |"
			        + "\n   |    2 - Subtrair        |"
			        + "\n   |    3 - Dividir         |"
			        + "\n   |    4 - Multiplicar     |"
			        + "\n   |   -----------------    |"
			        + "\n   |    0 - S A I R         |"
			        + "\nInforme a operação desejada: ");
		//Captura a opção do menu digitada pelo usuario
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			//solicita a entrada de numeros ao usuario
			System.out.print("\n\nInforme um numero para sua soma: ");
			num1 = entrada.nextFloat();
			System.out.print("informe outro numero : ");
			num2 = entrada.nextFloat();
			
			//Instancia a classe SOMA, Criando o objeto soma
			Soma soma = new Soma(num1, num2);
			
			//Atribui o resultado do metodo calculaSoma para a variavel resultado
			resultado = soma.calculaSoma(num1, num2);
			
			System.out.println("Resultado: "+ num1 + " + " + num2 + " = " + resultado );
			
			break;
			
		case 2:
			//solicita a entrada de numeros ao usuario
			System.out.print("\n\nInforme um numero para sua subtração: ");
			num1 = entrada.nextFloat();
			System.out.print("informe outro numero : ");
			num2 = entrada.nextFloat();
			
			//Instancia a classe SOMA, Criando o objeto soma
			Subtrai sub = new Subtrai(num1, num2);
			
			//Atribui o resultado do metodo calculaSoma para a variavel resultado
			resultado = sub.calculaSubtracao(num1, num2);
			
			System.out.println("Resultado: "+ num1 + " - " + num2 + " = " + resultado );
			
			break;	
			
		case 3:
			//solicita a entrada de numeros ao usuario
			System.out.print("\n\nInforme um numero para sua Divisão: ");
			num1 = entrada.nextFloat();
			System.out.print("informe outro numero : ");
			num2 = entrada.nextFloat();
			
			//Instancia a classe SOMA, Criando o objeto soma
			Divide div = new Divide(num1, num2);
			
			//Atribui o resultado do metodo calculaSoma para a variavel resultado
			resultado = div.calculaDivide(num1, num2);
			
			System.out.println("Resultado: "+ num1 + " / " + num2 + " = " + resultado );
			
			break;	
			
		case 4:
			//solicita a entrada de numeros ao usuario
			System.out.print("\n\nInforme um numero para sua Multiplicação: ");
			num1 = entrada.nextFloat();
			System.out.print("informe outro numero : ");
			num2 = entrada.nextFloat();
			
			//Instancia a classe SOMA, Criando o objeto soma
			Multiplica mult = new Multiplica(num1, num2);
			
			//Atribui o resultado do metodo calculaSoma para a variavel resultado
			resultado = mult.calculaMultiplicacao(num1, num2);
			
			System.out.println("Resultado: "+ num1 + " * " + num2 + " = " + resultado );
			
			break;
			
		default:
			if (opcao != 0) {
				System.out.println("\n\nVocê precisa selecionar uma das opções validas\n");
			}
			break;
		}
			
	}
	System.out.println("\n\nObrigado por utilizar nossa Calculadora de Console!\n");
	entrada.close();
		
	}

}
