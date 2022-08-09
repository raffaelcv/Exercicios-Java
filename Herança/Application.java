package Pacote1;

public class Application {

	public static void main(String[] args) {
		
		//classes abstractas nao podem ser instanciadas .... tem que ser por herança
		//Conta conta1 = new Conta(120, 222, "Banco Teste", 100.00);
		//System.out.println(conta1);
		
		ContaCorrente cc = new ContaCorrente(110, 111, "Banco teste 2", 20.00, 10.00);
		System.out.println(cc);
		System.out.println("Saldo em Dinheiro da Conta Corrente R$ " + cc.getSaldoDinheiro());
		System.out.println("Saldo do limite da Conta Corrente R$ " + cc.getLimite());
		System.out.println("Saldo total da Conta Corrente R$ " + cc.getVlSaldo());
		
		
		
		ContaPoupanca cp = new ContaPoupanca(100,000, "Bando teste CP", 10.00,20,0.05);
		System.out.println(cp);
		System.out.println("Saldo Conta Poupança R$ " + cp.getVlSaldo());
		
		                                       
		
	}
}
