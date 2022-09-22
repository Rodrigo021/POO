public class Employee {

    private String nome;
    private double salBt;
    private double tax;
    private double salLi;


    public void Nome(String n) {
        this.nome = n;
    }

    public void SalBt(double s) {
        this.salBt = s;
    }

    public void Tax(double t) {
        this.tax = t;
    }

    public void IncreaseSalary(double p) {
        this.salLi =(this.salBt*(p/100));
    }
     
    public String toString() {
        double a = (this.salBt - this.tax)+this.salLi;
        return "Nome: "+this.nome+"\nSalário: "+a;
    }

}
