import java.util.Scanner;

public class CalculaIMC {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        float kg, h, imc;
        
        System.out.println("Insira o seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Insira a sua massa(kilogramas): ");
        kg = teclado.nextFloat();
        System.out.println("Insira a sua altura(metros): ");
        h = teclado.nextFloat();
        
        imc = kg/(h*h);
        
        if (imc > 0){
            
            if (imc < 16){
                System.out.println(nome +", o seu IMC é de: "+imc+ " e você está "
                        + "com Magreza grau III.");
            } else if (imc >= 16 && imc < 17){
                System.out.println(nome +", o seu IMC é de: "+imc+ " e você está "
                        + "com Magreza grau II.");
            } else if (imc >= 17 && imc < 18.5){
                System.out.println(nome +", o seu IMC é de: "+imc+ " e você está "
                        + "com Magreza grau I.");
            } else if (imc >= 18.5 && imc < 25){
                System.out.println(nome +", o seu IMC é de: "+imc+ " e você está "
                        + "com o IMC Adequado.");
            } else if (imc >= 25 && imc < 30){
                System.out.println(nome +", o seu IMC é de: "+imc+ " e você está "
                        + "com Pré-obesidade.");
            } else if (imc >= 30 && imc < 35){
                System.out.println(nome +", o seu IMC é de: "+imc+ " e você está "
                        + "com Obesidade grau I.");
            } else if (imc >= 35 && imc < 40){
                System.out.println(nome +", o seu IMC é de: "+imc+ " e você está "
                        + "com Obesidade grau II.");
            } else{
                System.out.println(nome +", o seu IMC é de: "+imc+ " e você está "
                        + "com Obesidade grau III.");
            }
            
        } else{        
        System.out.println("O valor do IMC está incorreto, tente novamente.");
        }
        
    }
}
    
