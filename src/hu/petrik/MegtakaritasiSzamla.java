package hu.petrik;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    private static double alapkamat = 1.8;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapkamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(double osszeg) {
        boolean siker = true;
        if (osszeg > getAktualisEgyenleg()){
            siker = false;
        }else{
            setAktualisEgyenleg(getAktualisEgyenleg() - osszeg);
        }
        return siker;
    }
    public void kamatjovairas(){
        setAktualisEgyenleg(getAktualisEgyenleg()*kamat);
    }
}
