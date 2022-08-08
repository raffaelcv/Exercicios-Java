import java.text.MessageFormat;
import java.util.Scanner;

public class EstruturasCondicionais {
	
	public static void main(String[] args) {
	//declaração de variaveis que utilizaremos	
	int n1;
	int n2;
	boolean isOk = false;
	String resposta;
	
	//Instancia das classes e objetos que utilizaremos
	Scanner entrada = new Scanner(System.in);
	
	//Solicitação de interação com o usuario
	System.out.print("informe um numero inteiro qualquer: ");
	n1 = entrada.nextInt();
	
	System.out.print("informe um outro numero inteiro qualquer: ");
	n2 = entrada.nextInt();
	
	//Algoritimo para setar status da flag
	isOk = (n1 > n2);
	
	//estrutura condicional que retorna a resposta que sera impressa ao usuario
	
	if(isOk == true) {
		resposta = MessageFormat.format("O número (0) é MAIOR que o número (1) ", n1, n2);		
	}
	else {
		resposta = MessageFormat.format("ELSE, O Numero(1) é MAIOR que o Numero (0)", n1, n2);
	}
	
	//Impressao da resposta de acordo com o retorno da estrutura condicional
	System.out.println("\n----------------------------------------");
	System.out.println(resposta);
	
	//encerra objetos que consomem espaço em memoria
	entrada.close();
	
	}
}
