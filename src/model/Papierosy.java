package model;

import java.math.BigDecimal;

public class Papierosy extends Produkt{

    private String rodzaj;
    private int sztuki;

    public Papierosy(String nazwa, BigDecimal cena, String rodzaj, int sztuki){
        super(nazwa,cena);
        this.rodzaj = rodzaj;
        this.sztuki = sztuki;


    }


    @Override
    public String getTyp() {
        return "papierosy";
    }
}
