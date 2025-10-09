package exercicio2.pacote.senac;

import java.util.Scanner;

/**
 *
 * @author Raphael Esch
 */
public class NumeroAoCubo {
    
    double num1 = 0;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }
    
    public double aoCubo(){
    
        double resultado = Math.pow(num1, 2);
        
        return resultado;
        
    }
    
    public void realizaCalculo(){
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---Ao cubo do numero---");
        System.out.println("Informe o numero: ");
        double numUm = scanner.nextDouble();
        
        setNum1(numUm);
        
        System.out.println("\n---Resultado Final---");
        System.out.println("O cubo do numero: " + num1 + " deu: " + aoCubo());
    
    }
    
}
