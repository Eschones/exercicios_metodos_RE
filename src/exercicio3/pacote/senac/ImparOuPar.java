package exercicio3.pacote.senac;

import java.util.Scanner;

/**
 *
 * @author Raphael Esch
 */
public class ImparOuPar {
    
    int num1 = 0;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public void realizaCalculo(){
    
        String resultado = "";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---Numero Impar ou Par?---");
        System.out.println("Informe o numero: ");
        int numUm = scanner.nextInt();
        
        setNum1(numUm);
        
        if (numUm % 2 == 0){
            resultado = "Par";
        } else {
            resultado = "Impar";
        }
        
        System.out.println("\n---Resultado Final---");
        System.out.println("O numero " + num1 + " eh: " + resultado);
    
    }
    
}
