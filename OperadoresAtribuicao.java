
public class OperadoresAtribuicao {

    public static void main(String[]args){
        int valor;
        
        System.out.println("-------SOMA----------");
        valor = 1;
        System.out.println("Valor é " + valor );
        
        valor = 2;
        System.out.println("A nova Atribuição é " + valor );
        
        valor = valor + 1;
        System.out.println("Valor = Valor + 1 Resulta em  " + valor );
        
        valor = 1;
        valor += 1;
        System.out.println("Valor <- 1 Resulta em  " + valor );
        
        valor = 1;
        valor ++;
        System.out.println("Valor ++ Resulta em  " + valor );
        
        System.out.println("");
        
        System.out.println("-------SUBTRAÇÃO---------");
        valor = 2;
        System.out.println("Valor é " + valor );
        
        valor = 2;
        valor = valor - 1;
        System.out.println("Valor - 1 Resulta em  " + valor );
        
        valor = 2;
        valor -= 1;
        System.out.println("Valor <- 1 Resulta em  " + valor );
        
        valor = 2;
        valor -= 1;
        System.out.println("Valor <- 1 Resulta em  " + valor );
        
        valor = 2;
        valor --;
        System.out.println("Valor -- Resulta em  " + valor );
}
    
}