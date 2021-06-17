package exercicio1n2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaAreaTrapezio {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
    float a,b,alt;
    String serie="Algum valor digitado está negativo";
    System.out.println("Digite o valor da base:");
    b = teclado.nextFloat();
    System.out.println("Digite o valor da altura:");
    alt = teclado.nextFloat();
    a = b*alt;
    if (b<0 || alt<0){
    JOptionPane.showMessageDialog(null,serie,"ERRO",JOptionPane.ERROR_MESSAGE);
    } else
    System.out.println("A área do retângulo é de "+a);
    }
        
    }
