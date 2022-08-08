import java.util.Scanner;

public class RepeticaoDOWHILE {
	public static void main(String[] args) {
		
		int opcao = -1;
		
		//instancia das classes e obetos que vamos utilizar
		Scanner entrada = new Scanner(System.in);
		
		do {
		//Apresentação das opções do menu ao usuario
		System.out.print(
					"------------MENU------------"
				   +"\n"
				   +"\n|   1 - Pagar Boleto       |"
				   +"\n|   2 - Transferencia      |"
				   +"\n|   3 - Depositar          |"
				   +"\n|   4 - Sacar              |"
				   +"\n|   5 - Consultar Saldo    |"
				   +"\n|   --------------------   |"
				   +"\n|   0 - S A I R            |"
				   +"\n"
				   +"\n Informe a opção desejada: "	);
		//Caotura a opção do menu digitada pelo usuario
		opcao = entrada.nextInt();
		//SWITCH ( TROQUE (OPCAO)) CASE (CASO)
		//BREAKE apos cada CASE, para RETORNAR O MENU
			switch (opcao) {
			case 1:
				System.out.println("\n\nAqui ficara a funcionalidade para PAGAR BOLETO");
				break;
			case 2:
				System.out.println("\n\nAqui ficara a funcionalidade para TRANSFERENCIA");
				break;	
			case 3:
				System.out.println("\n\nAqui ficara a funcionalidade para DEPOSITAR");
				break;	
			case 4:
				System.out.println("\n\nAqui ficara a funcionalidade para SACAR");
				break;	
			case 5:
				System.out.println("\n\nAqui ficara a funcionalidade para CONSULTAR SALDO");
				break;
			default:
				if (opcao != 0) {
				System.out.println("\n\nVocê precisa selecionar uma das opções validas \n");
				}
				break;	
			}
		} while (opcao != 0);
		System.out.println("\n\nObrigado por Utilizar nosso sistema!\n");
		entrada.close();
		
	}
}
