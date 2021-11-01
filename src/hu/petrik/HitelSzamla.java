package hu.petrik;

public class HitelSzamla extends Szamla{
    private final int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean kivesz(double osszeg) {
        boolean siker = true;
        if (osszeg > getAktualisEgyenleg() + hitelKeret){
            siker = false;
        }else{
            setAktualisEgyenleg(getAktualisEgyenleg()-osszeg);
        }
        return siker;
    }
}
