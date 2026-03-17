public class Main{


  public static void main(String[] args) {

      Trezor trezor = new Trezor(300220.22,"366868c7898e1c2462421a511c39717cb7ff47da","Mike's Trezor");
      Ledger ledger = new Ledger(21640.31, "c307b632ca379cb7df9cf79d98584204568f2197", "MyFuture");
      Keystone keystone = new Keystone(7252.40, "38a9d34ba3029c1b3f50e63eb5b0e70ea1692b2c", "TrustTh3Proc3ss");
      Wallet[] wallets = {trezor, ledger, keystone};

      for(Wallet x: wallets) {
          System.out.println(x);
      }




  }


}
