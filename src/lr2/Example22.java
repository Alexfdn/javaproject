package lr2;

public class Example22 implements Example22_int {
    private double balance_account;

    private Example22() {
    }

    public void setBalance_account(int balance) {
        this.balance_account = 0;
    }
    @Override
    public void getBalance_account() {
        System.out.println(balance_account);
    }

    public static Example22 New_account() {
        return new Example22();

    }
    @Override
    public void Transaction() {

    }
}

