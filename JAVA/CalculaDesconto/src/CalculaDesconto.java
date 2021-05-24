import java.util.Scanner;

public class CalculaDesconto {

    public static void main(String[] args) {
        
        float preco, desconto, precoFinal;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor do produto: ");
        preco = teclado.nextFloat();
        System.out.println("Insira o valor do desconto em %: ");
        desconto = teclado.nextFloat();
        
        precoFinal = preco*(1-(desconto/100));
        System.out.println("O valor final do produto é: " + precoFinal);
        
    }
    
}
