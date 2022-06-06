package stevanMilovanovicOOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> recenzije = new ArrayList<>();
        recenzije.add("Restoran je odlican");
        recenzije.add("Restoran je sjajan");
        recenzije.add("Hrana je jako ukusna");
        ArrayList<String> recenzije2 = new ArrayList<>();
        recenzije2.add("Restoran je zanimljiv");
        recenzije2.add("Osoblje je jako kulturno");
        recenzije2.add("Hrana je izvrsna!");
        Restoran saran = new Restoran("Saran", 0.5, 2, recenzije, 15);
        Restoran slonce = new Restoran("Slonce", 3.2, 0, recenzije2, 5);
        Inspektor stevan = new Inspektor(slonce);
        stevan.dodajOpis("Kuhinja je interesantna, samo ne poseduje srpsku kuhinju!");
//        System.out.println(slonce);
        System.out.println(slonce);
        System.out.println("-----------");
        System.out.println(saran);
        slonce.zaokupiSto(6);
        System.out.println(slonce.getBrSlobodnihStolova());
        saran.azurirajZvezdu();
        System.out.println(saran.getBrMichelinZvezda());

    }
}
