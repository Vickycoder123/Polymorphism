import java.util.*;

class Employee{
    private AccountNumber an;
    public Employee(AccountNumber an){
        this.an = an;
    }
    public void call(){
        an.input();
        an.display();
    }

}

class AccountNumber{
   private String name;

    public void input(){
        System.out.println("Enter your name :");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }
    public void display(){
        System.out.println("The Account holder name is "+ name);
    }
}

public class DependencyInjection{
    public static void main(String[] args){
        AccountNumber an = new AccountNumber();
        Employee emp = new Employee(an);
        emp.call();
    }
}