import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Employee emp = new Employee();
        
        System.out.print("Name: ");
        emp.Nome(sc.nextLine());;
        System.out.print("Gross salary: ");
        emp.SalBt(sc.nextDouble());;
        System.out.print("Tax: ");
        emp.Tax(sc.nextDouble());;
        System.out.println();
        
        System.out.println("Employee: " + emp);
        
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        emp.IncreaseSalary(percentage);
        
        System.out.println();
        System.out.println("Updated data: " + emp);
        sc.close();
       
    }
}
