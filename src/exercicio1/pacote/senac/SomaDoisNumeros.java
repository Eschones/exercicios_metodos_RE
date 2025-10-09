package exercicio1.pacote.senac;

import java.util.Scanner;

/**
 *
 * @author Raphael Esch
 */
public class SomaDoisNumeros {
    
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
 
    public int calculadora(){
        
        int resultado = this.num1 + this.num2;
        
        return resultado;
        
    }
    
        public void realizaCalculo(){
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---Soma de dois numeros---");
        System.out.println("Informe o primeiro numero: ");
        int numUm = scanner.nextInt();
        
        System.out.println("\nInforme o segundo numero: ");
        int numDois = scanner.nextInt();
        
        setNum1(numUm);
        setNum2(numDois);
        
        System.out.println("\n---Resultado Final---");
        System.out.println("A soma dos numeros " + num1 + " e " + num2 + " deu: " + calculadora());
    
    }
    
}
