import java.util.Scanner;

public class BonificacaoFuncionario {

    public static void main(String[] args) {
        
        String NomeDoFuncionario;
        float Salario;
        int TempoDeServico;
            
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Insira o nome completo do Funcionario: ");
        NomeDoFuncionario = teclado.nextLine();
        
        System.out.println("Insira o valor em Reais do salário: ");
        Salario = teclado.nextFloat();
        
        System.out.println("Insira o valor do tempo de serviço em anos: ");
        TempoDeServico = teclado.nextInt();
        
        
        if (TempoDeServico > 0) {
            
            float Bonus = 0, SalarioBonificado;
            
            if (TempoDeServico > 8) {
                Bonus = 8;
                SalarioBonificado = Salario * Bonus/100 + Salario;
                System.out.println("O funcionário " + NomeDoFuncionario + " cujo salário é de R$" + Salario + " e o tempo de serviço é de " + TempoDeServico + " ano(s) terá o bônus de " + Bonus + " e o salário bonificado no valor de: R$" + SalarioBonificado);
            } else if (TempoDeServico < 4) {
                Bonus = 1;
                SalarioBonificado = Salario * Bonus/100 + Salario;
                System.out.println("O funcionário " + NomeDoFuncionario + " cujo salário é de R$" + Salario + " e o tempo de serviço é de " + TempoDeServico + " ano(s) terá o bônus de " + Bonus + " e o salário bonificado no valor de: R$" + SalarioBonificado);
            } else {
                Bonus = 3;
                SalarioBonificado = Salario * Bonus/100 + Salario;
                System.out.println("O funcionário " + NomeDoFuncionario + " cujo salário é de R$" + Salario + " e o tempo de serviço é de " + TempoDeServico + " ano(s) terá o bônus de " + Bonus + " e o salário bonificado no valor de: R$" + SalarioBonificado); 
            }           
        
        } else {
        
            System.out.println("O funcionário não possui bônus.");
        
        }
    }
}