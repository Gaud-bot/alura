
package provaaa;

import java.util.Scanner;

public class Provaaa {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      float n1, n2, n3, media;
      String nome;
        System.out.println("Insira seu nome");
        nome=teclado.nextLine();
        System.out.println("Insira a nota de sua primeira, segunda e terceira prova, respectivamente");
        n1=teclado.nextFloat();
        n2=teclado.nextFloat();
        n3=teclado.nextFloat();
        media= (n1+n2+n3)/3;
        if  (media >=7)
        {
            System.out.println("Sua média é de " +media+ " Parabéns! você foi aprovado");   
        }else if (media <=6.99 && media >=5){
            System.out.println("Sua média é de " +media+ " Você está de exame");
        }else{
          System.out.println("Sua média é de " +media+ " Você está de exame");
    }
}
}
    
