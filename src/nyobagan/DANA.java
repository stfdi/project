package nyobagan;

public class DANA extends eWallet {
    public final int MAX_LIMIT = 2000000;
    private int isiSaldo;

    public DANA(String nama, String nomer, int saldo) {
        super(nama, nomer, saldo);
    }

    public DANA() {
        super("", "", 0);
    }

    public int getIsiSaldo() {
        return isiSaldo;
    }

    public void setIsiSaldo(int isiSaldo) {
        this.isiSaldo = isiSaldo;
    }

    @Override
    public int getTopUp() {
        return saldo + isiSaldo;
    }
    
    @Override
    public int getLimit() {
        return MAX_LIMIT - getTopUp();
    }
}