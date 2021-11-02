package hu.petrik;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private Szamla[] szamlaList;
    private int index = 0;

    public  Bank(int mennyiseg){
        this.szamlaList = new Szamla[mennyiseg];
    }
    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelkeret){
        Szamla szamla;
        if (hitelkeret > 0){
            HitelSzamla hitelszamla = new HitelSzamla(tulajdonos,hitelkeret);
            szamla = hitelszamla;
            index++;

        }else{
            MegtakaritasiSzamla megtakaritasszamla = new MegtakaritasiSzamla(tulajdonos);
            szamla = megtakaritasszamla;
            index++;
        }
        return szamla;
    }
    public int osszEgyenleg(Tulajdonos tulajdonos){
        int egyeneg = 0;
        for (Szamla szamla:szamlaList) {
            if (szamla.getTulajdonos().getNev().equals(tulajdonos.getNev())){
                egyeneg += szamla.getAktualisEgyenleg();
            }
        }
        return egyeneg;
    }

   /* HIBA :(
   public Szamla legnagyobbEgyenleguSzamlal(Tulajdonos tulajdonos){
        Szamla legnagyobb ;
        for (int i = 0; i < szamlaList.length; i++) {
            if (szamlaList[i].getAktualisEgyenleg() > szamlaList[legnagyobb].getEgyenleg()) legnagyobb = i;
        }
        return legnagyobb;
    }*/
    public long osszHitelKeret(){
        int ossezg= 0;
        for (Szamla szamla:szamlaList) {
            ossezg += ((HitelSzamla) szamla).getHitelKeret();
        }
        return  ossezg;
    }
}
