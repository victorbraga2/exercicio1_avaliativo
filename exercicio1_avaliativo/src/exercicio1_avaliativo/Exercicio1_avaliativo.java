/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_avaliativo;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio1_avaliativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double PC, Alt, I, sexo;
        System.out.println("Informe o seu sexo digitando 1 para homem e 2 para mulher ");
        sexo = entrada.nextDouble();
        System.out.println("Digite sem peso corporal em kg: ");
        PC = entrada.nextDouble();
        System.out.println("Digite sua altura em cm: ");
        Alt = entrada.nextDouble();
        System.out.println("Digite sua idade em anos: ");
        I = entrada.nextDouble();
        
        if (sexo == 1)
        {
            double result = 66.47 + (13.75 * PC) + (5 * Alt) - (6.76 * I);
            System.out.println("O resultado de seu gasto energetico é: "+result);
        }
        else
            if (sexo == 2)
            {
            double result = 655.1 + (9.56 * PC) + (1.85 * Alt) - (4.67 * I);
            System.out.println("O resultado de seu gasto energetico é:"+result);
            }
    }
    
}
