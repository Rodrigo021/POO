package Q1.src;
public class CurrencyConverter {

    public double dollarToReal(double a, double d) {
        double t = a * d;
        double t2 = t * 0.06;

        return t + t2;
    }
    
}
