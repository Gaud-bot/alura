import java.util.Scanner;

public class LerNumerosReais2 {

    public static void main(String[] args) {
        
        double PrimeiroNumero, SegundoNumero;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira dois números reais: ");
        
        PrimeiroNumero = teclado.nextDouble();
        SegundoNumero = teclado.nextDouble();
        
        double media= (PrimeiroNumero + SegundoNumero)/2;
        System.out.println("A média dos números reais é: " + media);
        
    }
    
}
