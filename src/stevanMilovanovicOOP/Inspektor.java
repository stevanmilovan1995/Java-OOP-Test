package stevanMilovanovicOOP;

public class Inspektor {
    private UgostiteljskiObjekat objekat;

    public Inspektor(UgostiteljskiObjekat objekat) {
        this.objekat = objekat;
    }

    public UgostiteljskiObjekat getObjekat() {
        return objekat;
    }

    public void setObjekat(UgostiteljskiObjekat objekat) {
        this.objekat = objekat;
    }

    public void dodajOpis(String opis) {
        getObjekat().dodajRecenziju(opis);
    }

    public void dodajOcenu(double ocena) {
        getObjekat().setProsecnaOcena(ocena);
    }

    public void dodeliZvezdu() {
        getObjekat().azurirajZvezdu();
    }


    public String procitajRecenzije(int i) {
        return getObjekat().getRecenzije().get(i);
    }

    public void zatvoriObjekat() {
        getObjekat().setProsecnaOcena(1.0);
        getObjekat().setBrMichelinZvezda(0);
    }

    public static int uporediUgostiteljskeObjekte(UgostiteljskiObjekat o1, UgostiteljskiObjekat o2) {
        if (o1.getProsecnaOcena() > o2.getProsecnaOcena() && o1.getBrMichelinZvezda() >= o2.getBrMichelinZvezda()) {
            return -1;
        } else if (o1.getProsecnaOcena() == o2.getProsecnaOcena() && o1.getBrMichelinZvezda() == o2.getBrMichelinZvezda()) {
            return 0;
        } else
            return 1;
    }


}
