package Pacote1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		//System.out.println(Enum.PESSOA_FISICA);
		//recupera valor da assinatura
		//System.out.println(Enum.PESSOA_FISICA.getTexto());
		
		
		Scanner sc = new Scanner(System.in);
		//percorre o enum
		for (Menu m : Menu.values()){
			System.out.print("opcao " + m + " = " + m.getValor()+"\n");
		} 
		
		System.out.print("Digite a Opção Desejada: ");
		int valor = sc.nextInt();
		
		Menu.escolheOpcaoMenu(valor);
		
	}
}
