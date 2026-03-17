public class Trezor extends Wallet{

    public Trezor(double balance, String address, String walletName){
        super(balance, address, walletName);
    }

    @Override
    public String toString(){
        return "Wallet Name: " + super.getWalletName() + "\n" +
                "Wallet address: " + super.getAddress() + "\n" +
                "BALANCE: " + super.getBalance() + "\n";
    }

}
