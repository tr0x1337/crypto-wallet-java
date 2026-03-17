import com.sun.jdi.request.StepRequest;

public class Wallet {

    private double balance;
    private String address;
    private String walletName;

    public Wallet(double balance, String address, String walletName){
        this.balance = balance;
        this.address = address;
        this.walletName = walletName;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAddress() {
        return this.address;
    }

    public String getWalletName() {
        return this.walletName;
    }

}
