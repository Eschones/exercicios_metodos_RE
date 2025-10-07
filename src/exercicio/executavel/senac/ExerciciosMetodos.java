package exercicio.executavel.senac;

import exercicio1.pacote.senac.SomaDoisNumeros;
import java.util.Scanner;

/**
 *
 * @author Raphael Esch
 */
public class ExerciciosMetodos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---Soma de dois numeros---");
        System.out.println("Informe o primeiro numero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("\nInforme o segundo numero: ");
        int num2 = scanner.nextInt();
        
        SomaDoisNumeros calcular = new SomaDoisNumeros();
        
        int resultado = calcular.somar(num1, num2);
        
        System.out.println("---O resultado final---");
        System.out.println("A soma dos dois numeros deu: " + resultado);
        
        
    }
    
    
}
