package stevanMilovanovicOOP;

import java.util.ArrayList;

public abstract class UgostiteljskiObjekat {
    private String naziv;
    private double prosecnaOcena;
    private int brMichelinZvezda;
    private ArrayList<String> recenzije;

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena, int brMichelinZvezda, ArrayList<String> recenzije) {
        this.naziv = naziv;
        if (prosecnaOcena > 5.0) {
            this.prosecnaOcena = 5.0;
        } else if (prosecnaOcena < 1.0) {
            this.prosecnaOcena = 1.0;
        } else
            this.prosecnaOcena = prosecnaOcena;
        if (brMichelinZvezda > 3) {
            this.brMichelinZvezda = 3;

        } else if (brMichelinZvezda < 0) {
            this.brMichelinZvezda = 0;
        } else
            this.brMichelinZvezda = brMichelinZvezda;
        this.recenzije = recenzije;
    }

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena, int brMichelinZvezda) {
        this.naziv = naziv;
        if (prosecnaOcena > 5.0) {
            this.prosecnaOcena = 5.0;
        } else if (prosecnaOcena < 1.0) {
            this.prosecnaOcena = 1.0;
        } else
            this.prosecnaOcena = prosecnaOcena;
        if (brMichelinZvezda > 3) {
            this.brMichelinZvezda = 3;
        } else if (brMichelinZvezda < 0) {
            this.brMichelinZvezda = 0;
        } else
            this.brMichelinZvezda = brMichelinZvezda;
        this.recenzije = new ArrayList<>();
    }

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena) {
        this.naziv = naziv;
        if (prosecnaOcena > 5.0) {
            this.prosecnaOcena = 5.0;
        } else if (prosecnaOcena < 1.0) {
            this.prosecnaOcena = 1.0;
        } else
            this.prosecnaOcena = prosecnaOcena;
        this.brMichelinZvezda = 0;
        this.recenzije = new ArrayList<>();
    }

    public UgostiteljskiObjekat(String naziv) {
        this.naziv = naziv;
        this.prosecnaOcena = 3.0;
        this.brMichelinZvezda = 0;
        this.recenzije = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getProsecnaOcena() {
        return prosecnaOcena;
    }

    public void setProsecnaOcena(double prosecnaOcena) {
        if (prosecnaOcena > 5.0) {
            this.prosecnaOcena = 5.0;
        } else if (prosecnaOcena < 1.0) {
            this.prosecnaOcena = 1.0;
        } else
            this.prosecnaOcena = prosecnaOcena;
    }

    public int getBrMichelinZvezda() {
        return brMichelinZvezda;
    }

    public void setBrMichelinZvezda(int brMichelinZvezda) {
        if (brMichelinZvezda > 3) {
            this.brMichelinZvezda = 3;
        } else if (brMichelinZvezda < 0) {
            this.brMichelinZvezda = 0;
        } else
            this.brMichelinZvezda = brMichelinZvezda;
    }

    public ArrayList<String> getRecenzije() {
        return recenzije;
    }

    public void setRecenzije(ArrayList<String> recenzije) {
        this.recenzije = recenzije;
    }

    public void dodajRecenziju(String recenzija) {
        recenzije.add(recenzija);
    }

    public void dodajRecenziju(int i, String recenzija) {
        if (i >= 0 && i <= recenzije.size()) {
            recenzije.add(i, recenzija);
        } else
            System.out.println("Index nije validan!");
    }

    public boolean daLiSuIste(String recenzija1, String recenzija2) {
        return recenzija1.equals(recenzija2);
    }

    public void obrisiRecenziju(String recenzija) {
        for (int i = 0; i < recenzije.size(); i++) {
            String trenutna = recenzije.get(i);
            if (daLiSuIste(trenutna, recenzija))
                recenzije.remove(recenzija);
        }
    }

    public void obrisiRecenziju(int i) {
        if (i >= 0 && i <= recenzije.size())
            recenzije.remove(i);
    }

    public void dodajViseOcena(ArrayList<Double> ocene) {
        double sum = 0;
        for (int i = 0; i < ocene.size(); i++) {
            sum += ocene.get(i);
        }
        sum = sum / ocene.size();
        sum = (sum + getProsecnaOcena()) / 2;
        ocene.add(sum);
    }

    public abstract void dodajOcenu(double ocena);

    public abstract void azurirajZvezdu();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t").append("-----").append(getNaziv()).append("-----").append("\n");
        sb.append("\t").append("*****( ").append(getBrMichelinZvezda()).append(" )*****").append("\n");
        sb.append("\n");
        sb.append("Prosecna ocena: ").append(getProsecnaOcena()).append("\n");
        sb.append("Recenzije: ").append("\n");
        for (int i = 0; i < recenzije.size(); i++) {
            sb.append(recenzije.get(i)).append("\n");
        }
        return sb.toString();
    }
}
