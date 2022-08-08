
public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		double saldo = 50.00;
		boolean isOk = false;
		
		// && conjunção aditiva  ( uma condição E outra condição)
		// || conjunção Alternativa (uma condição OU outra condição)
		
		isOk = (saldo > 10 && saldo < 100);
		System.out.println(isOk + ", pois o SALDO é maior que 10 e menor que 100!");

		isOk = (saldo > 10 && saldo < 40);
		System.out.println(isOk + ", pois o SALDO é maior que 10, mas não é menor que 40!");
		
		isOk = (saldo > 10 || saldo < 40);
		System.out.println(isOk + ", pois o SALDO é maior que 10 ou menor que 40!");
		
		isOk = (saldo > 60 || saldo < 40);
		System.out.println(isOk + ", pois o SALDO não é maior que 60 ou menor que 40!");
		
		isOk = (saldo > 10 && saldo < 100 && saldo == 50.00 && saldo != 0 );
		System.out.println(isOk + ", pois o SALDO é maior que 10 e ao mesmo tempo tambem é menor que 100 e possui valor igual a 50.00");
		
	}

}
