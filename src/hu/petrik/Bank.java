package hu.petrik;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Szamla> szamlaList = new ArrayList<>();

    public  Bank(){

    }
    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelkeret){
        Szamla szamla;
        if (hitelkeret > 0){
            HitelSzamla hitelszamla = new HitelSzamla(tulajdonos,hitelkeret);
            szamlaList.add(hitelszamla);
            szamla = hitelszamla;
        }else{
            MegtakaritasiSzamla megtakaritasszamla = new MegtakaritasiSzamla(tulajdonos);
            szamlaList.add(megtakaritasszamla);
            szamla = megtakaritasszamla;
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

    public Szamla legnagyobbEgyenleguSzamlal(Tulajdonos tulajdonos){
        Szamla legnagyobb = szamlaList.get(0);
        for(Szamla szamla : szamlaList){
            if (szamla.getAktualisEgyenleg() >legnagyobb.getAktualisEgyenleg()){
                legnagyobb = szamla;
            }
        }
        return legnagyobb;
    }
    public long osszHitel(){
        int ossezg= 0;
        for (Szamla szamla:szamlaList) {
            ossezg += ((HitelSzamla) szamla).getHitelKeret();
        }
        return  ossezg;
    }
}
