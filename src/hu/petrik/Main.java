package hu.petrik;

public class Main {

    public static void main(String[] args) {
	Tulajdonos t1 = new Tulajdonos("József");
	Tulajdonos t2 = new Tulajdonos("Bobi");
	Tulajdonos t3 = new Tulajdonos("Dobby");

    HitelSzamla h1 = new HitelSzamla(t1, 1500);
    HitelSzamla h2 = new HitelSzamla(t2, 2000);
    HitelSzamla h3 = new HitelSzamla(t3, 7000);

    MegtakaritasiSzamla m1 =new MegtakaritasiSzamla(t1);
    MegtakaritasiSzamla m2 =new MegtakaritasiSzamla(t2);
    MegtakaritasiSzamla m3 =new MegtakaritasiSzamla(t3);

    h1.befizet(10000.0);
    h2.befizet(10400.0);
    h3.befizet(7888.0);


        System.out.println(m1.getAktualisEgyenleg());
        m1.kamatjovairas();

        System.out.println(h3.kivesz(4000.0));
        System.out.println(m3.getAktualisEgyenleg());
        m3.kamatjovairas();

        Bank b1 = new Bank();
        b1.szamlaNyitas(t1,100000);
        b1.szamlaNyitas(t2,50000);
        b1.szamlaNyitas(t3,99999);
        b1.szamlaNyitas(t1,76000);
        b1.szamlaNyitas(t2,65555);
        b1.szamlaNyitas(t3,12121);


        System.out.println(b1.osszHitelKeret());
        Szamla ln = b1.legnagyobbEgyenleguSzamlal(t1);
        System.out.println(ln.getTulajdonos().toString());
        System.out.println(ln.getAktualisEgyenleg());
        System.out.println(b1.osszEgyenleg(t1));

    }
}
