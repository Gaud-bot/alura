import java.util.Scanner;

public class CalculaAreaTrapezio {

    public static void main(String[] args) {
        
        int BaseMaior, BaseMenor, Altura, Area;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor da base maior do trapézio: ");
        BaseMaior = teclado.nextInt();
        System.out.println("Insira o valor da base menor do trapézio: ");
        BaseMenor = teclado.nextInt();
        System.out.println("Insira o valor da altura do trapézio: ");
        Altura = teclado.nextInt();
        
        Area = ((BaseMaior+BaseMenor)*Altura)/2;
        System.out.println("O valor da área do trapézio é: " + Area);
        
    }
    
}
