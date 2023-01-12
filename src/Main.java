import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        SBIUser s = new SBIUser(name, balance, password);
        System.out.println(s.addMoney(1000));
        System.out.println("Enter the amount !!!");
        int money=sc.nextInt();
        System.out.println("Enter the password");
        String pass=sc.next();
        System.out.println(s.withdrawMoney(money,pass));
        System.out.println(s.calculateInterest(10));
    }
}