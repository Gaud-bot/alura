import java.util.Scanner;

public class CotacaoDolar {

    public static void main(String[] args) {
        
        float ValorReal, CotacaoDolar, ValorDolar;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor em Reais que deseja transformar: ");
        ValorReal = teclado.nextFloat();
        System.out.println("Insira o valor da cotação atual do dólar: ");
        CotacaoDolar = teclado.nextFloat();
       
        ValorDolar = ValorReal*CotacaoDolar;
        System.out.println("O valor em Dólares é: " + ValorDolar);
        
    }
    
}
