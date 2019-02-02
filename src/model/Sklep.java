package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep {

    private String nazwa;
    private List<Produkt> produkty;


    public Sklep(String nazwa) {
        this.nazwa = nazwa;
        this.produkty = new ArrayList<>();

    }

    public void dodaj(Produkt produkt) {
        produkty.add(produkt);
    }


    public void usun(int id) {

        Iterator<Produkt> iterator = produkty.iterator();

        while (iterator.hasNext()) {
            Produkt produkt = iterator.next();
            if (produkt.getId() == id) {
                iterator.remove();
            }
        }

    }


    public String toString() {

        String rezultat = "id\ttyp\tnazwa\tcena\tinne\n";
        for (Produkt produkt : produkty) {
            rezultat += produkt + "\n";

        }
        return rezultat;


    }
}
