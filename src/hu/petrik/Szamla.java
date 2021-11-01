package hu.petrik;

public abstract class Szamla extends BankiSzolgaltatas {

    private double aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public double getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    protected void setAktualisEgyenleg(double osszeg) {
        this.aktualisEgyenleg = osszeg;
    }
    public void befizet(double osszeg){
        if(osszeg>0){
            this.aktualisEgyenleg+=osszeg;
        }
    }
    public boolean kivesz(double osszeg){
        if (osszeg >= 0){
            this.aktualisEgyenleg -= osszeg;
            return true;
        }else{
            return false;
        }
    }
}
