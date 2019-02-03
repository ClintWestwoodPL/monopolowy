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
    @Override
    public String toString() {
        return super.toString() + "\t" +
                this.rodzaj + "\t" +
                this.sztuki + "\t";
    }

    public Papierosy() {
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public int getSztuki() {
        return sztuki;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public void setSztuki(int sztuki) {
        this.sztuki = sztuki;
    }
}
