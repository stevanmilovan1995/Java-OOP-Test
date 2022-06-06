package stevanMilovanovicOOP;

import java.util.ArrayList;

public class Restoran extends UgostiteljskiObjekat {
    private int brSlobodnihStolova;

    public Restoran(String naziv, double prosecnaOcena, int brMichelinZvezda, ArrayList<String> recenzije, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena, brMichelinZvezda, recenzije);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, double prosecnaOcena, int brMichelinZvezda, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena, brMichelinZvezda);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, double prosecnaOcena, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv) {
        super(naziv);
        this.brSlobodnihStolova = 25;
    }

    public int getBrSlobodnihStolova() {
        if (brSlobodnihStolova < 0) {
            this.brSlobodnihStolova = 0;
        } else {
            this.brSlobodnihStolova = brSlobodnihStolova;
        }
        return brSlobodnihStolova;
    }

    public void setBrSlobodnihStolova(int brSlobodnihStolova) {
        if (brSlobodnihStolova < 0) {
            this.brSlobodnihStolova = 0;
        } else {
            this.brSlobodnihStolova = brSlobodnihStolova;
        }
    }

    public boolean imaLiSlobodnihStolova() {
        return brSlobodnihStolova >= 1;
    }

    public void oslobodiSto() {
        this.brSlobodnihStolova++;
    }

    public void oslobodiSto(int x) {
        this.brSlobodnihStolova += x;
    }

    public void zaokupiSto() {
        if (imaLiSlobodnihStolova()) {
            this.brSlobodnihStolova--;
        } else {
            System.out.println("Nema nijedan slobodan sto trenutno!");
        }
    }

    public void zaokupiSto(int x) {
        if (this.brSlobodnihStolova > x) {
            this.brSlobodnihStolova -= x;
        } else {
            this.brSlobodnihStolova = 0;
        }
    }

    @Override
    public void dodajOcenu(double ocena) {
        double o = 0;
        if (ocena >= getProsecnaOcena()) {
            o = getProsecnaOcena() - 0.3;
            o = (o + ocena) / 2;
            setProsecnaOcena(o);
        }
        if (ocena < getProsecnaOcena()) {
            o = (getProsecnaOcena() + ocena) / 2;
            setProsecnaOcena(o);
        }
        if (ocena < 0)
            System.out.println("Ocena nije validna!");
    }

    @Override
    public void azurirajZvezdu() {
        if (getProsecnaOcena() > 4.5) {
            setBrMichelinZvezda(getBrMichelinZvezda() + 2);
            if (getBrMichelinZvezda() > 3) {
                setBrMichelinZvezda(3);
            }
        }
        if (getProsecnaOcena() > 3.5 && getProsecnaOcena() <= 4.5) {
            setBrMichelinZvezda(getBrMichelinZvezda() + 1);
            if (getBrMichelinZvezda() > 3) {
                setBrMichelinZvezda(3);
            }
        }
        if (getProsecnaOcena() > 3.0 && getProsecnaOcena() <= 3.5) {
            setBrMichelinZvezda(getBrMichelinZvezda() - 1);
            if (getBrMichelinZvezda() > 3) {
                setBrMichelinZvezda(3);
            }
        }
        if (getProsecnaOcena() <= 3.0) {
            setBrMichelinZvezda(getBrMichelinZvezda() - 2);
            if (getBrMichelinZvezda() > 3) {
                setBrMichelinZvezda(3);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------").append("\n");
        sb.append("\t Restoran \t").append("\n");
        sb.append("---------------").append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
