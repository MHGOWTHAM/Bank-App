import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private static double rateOfInterest;
     public SBIUser(String name,double balance,String password ){
         this.name=name;
         this.balance=balance;
         this.password=password;
         //bank is initializing
         this.rateOfInterest=6.5;
         this.accountNo= String.valueOf(UUID.randomUUID());
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }


    @Override
    public String withdrawMoney(int amount) {
        return null;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
         balance=balance+amount;
        return "Updated balance : " + balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
         if(Objects.equals(enteredPassword,password)){
             if(balance<amount){
                 return "Insufficient balance in your account";
             }
             balance=balance-amount;
             return "Your Transaction is successful";
         }
       else{
           return "Invalid password";
         }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
