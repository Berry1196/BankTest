public class GoldKonto {
    private String navn;
    private int saldo;

    public GoldKonto(String navn, int saldo) {
        this.navn = navn;
        this.saldo = saldo;
    }
    public GoldKonto(String navn) { // overloaded constructor
        this.navn = navn;
        this.saldo = 0;
    }
    public int getSaldo() {
        return saldo;
    }

    public String getNavn() {
        return navn;
    }

    public int deposit(int i){
        if(i >= 0) {
            saldo = saldo + i;

        }
        return saldo;
    }

    public int withdraw(int i) {
        int tmp = saldo;
        if(i>0 && saldo >= -1000){
            saldo = saldo - i;
            if(saldo < -1000){
                saldo = tmp;
            }
        }
        return saldo;
    }
}
