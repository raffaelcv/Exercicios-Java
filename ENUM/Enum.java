package Pacote1;

public enum Enum {

	//Utilizado para enumerar valores que nao sofrerão mutações, por ex:
	//Logradouros(rua, Avenida, Estrada
	
	//CONSTANTE SEMPRE EM MAIUSCULO
	//DECLARA AS CONSTANT COM SUAS ASSINATURAS
	
	PESSOA_FISICA("Pessoa Física"),
	PESSOA_JURIDICA("Pessoa Juridica");
	
	//Variavel que receberá a assinatura do ENUM
	private String texto;
	
	//Monta o construtor para receber a variavel com a assinatura como parametro
	Enum(String texto){
		//Passa o texto da variavel, para o parametro do construtor
		this.texto = texto;
	}
	
	//precisa criar o getter pois a variavel Texto que recebe  a assinatura ENUM é privada
	public String getTexto() {
		return texto;
	}

}

