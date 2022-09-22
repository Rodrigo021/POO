package Q1.src;
import java.util.Scanner;
import java.util.Locale;

public class Ex1 {

    public static void main(String[] args) {
        
        CurrencyConverter cc = new CurrencyConverter();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o preço do dollar? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("Quantos dolares você vai comprar? ");
        double amount = sc.nextDouble();
 
        double result = cc.dollarToReal(amount, dollarPrice);
        System.out.printf("Você irá pagar em reais = %.2f%n", result);
        sc.close();
        
    }
    
}
