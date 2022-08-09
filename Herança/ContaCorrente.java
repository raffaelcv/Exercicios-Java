package Pacote1;

public class ContaCorrente extends Conta {
	
	private double chequeEspecial;
	
	//Para poder criar um objeto ContaCorrente...primeiro precisa criar um objeto Conta...
	
	//por isso ele OBRIGA a herdar o Contrutor da Classe Base
	
	public ContaCorrente(int nrConta, int nrAgencia, String nmBanco, double vlSaldo, double chequeEspecial) {
		//o super chama o construtor da super classe
		super(nrConta, nrAgencia, nmBanco, vlSaldo);
		this.chequeEspecial = chequeEspecial;
	}
	@Override
	public String toString() {
		return "ContaCorrente["
				+" Conta =" + getNrConta()
				+" Agencia =" + getNrAgencia()
				+" Banco =" + getNmBanco()
				+" Saldo =" + getVlSaldo()
				+" ChequeEspecial =" + chequeEspecial + "]";
	}
	@Override
	public double getVlSaldo() {
		return this.chequeEspecial + this.vlSaldo;
	}
	
	public double getSaldoDinheiro() {
		return getVlSaldo() - this.chequeEspecial;
	}
	public double getLimite() {
		return this.chequeEspecial;
	}
}
