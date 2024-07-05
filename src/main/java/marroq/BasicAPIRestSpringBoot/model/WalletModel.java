package marroq.BasicAPIRestSpringBoot.model;

public class WalletModel {
    public int id;
    public int income;
    public int expense;
    public int balance;

    public WalletModel(int id, int income) {
        this.id = id;
        this.income = income;
    }
}
