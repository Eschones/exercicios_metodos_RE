package exercicio4.pacote.senac;

import java.util.Scanner;

/**
 *
 * @author Raphael Esch
 */
public class NumeroOuCaracter {
    
    public void diferencia(){

        int numero = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 9(caracter) ou uma letra: ");
        String resposta = scanner.nextLine();
        
        try {
        
            numero = Integer.parseInt(resposta);
            
            if (numero >= 0 && numero <= 9){
            
                System.out.println("\nVoce digitou: " + numero);
                System.out.println("Voce possui um caracter.");
                
            } else {
            
                System.out.println("\nNumero invalido, digite um numero entre 0 e 9.");
                
            }
            
        } catch (NumberFormatException erro){
        
            System.out.println("\nVoce digitou: " + resposta);
            System.out.println("Voce possui uma letra.");
            
        }
            
    }
        
}