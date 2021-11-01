package hu.petrik;

public class Kartya extends BankiSzolgaltatas {

    private  final Szamla szamla;
    private  final String kartyaszam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaszam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaszam = kartyaszam;
    }

    public Szamla getSzamla() {
        return szamla;
    }

    public String getKartyaszam() {
        return kartyaszam;
    }
    public boolean vasarals(int osszeg){
        return szamla.kivesz(osszeg);
    }
}
