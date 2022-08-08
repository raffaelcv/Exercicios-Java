import java.util.Scanner;

public class MeuPrimeiroCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("Hello World...");
		//System.out.println("Este sistema é muito facil");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Olá! Por favor, Informe o seu nome: ");
		String nome = entrada.next();
		System.out.print("Informe o seu Sobrenome: ");
		String sobrenome = entrada.next();
		
		
		System.out.println("Seja muito bem vindo, "+ nome +" "+ sobrenome +" ao curso de Java!");	
		entrada.close();
	}

}
