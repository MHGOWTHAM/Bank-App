public interface BankInterface {
    String withdrawMoney(int amount);

    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amount,String password);
    double calculateInterest(int years);
}
