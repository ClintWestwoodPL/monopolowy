package model;

import java.math.BigDecimal;
import java.security.PublicKey;

public class Alkohol extends Produkt {
    public Alkohol() {
    }

    private String litraz;
    private String procent;

    public Alkohol (String nazwa, BigDecimal cena, String litraz, String procent){
        super(nazwa,cena);
        this.litraz = litraz;
        this.procent = procent;


    }

    @Override
    public String getTyp () {
        return "alko";
    }
    @Override
    public String toString() {
        return super.toString() + "\t" +
                this.litraz + "\t" +
                this.procent + "\t";
    }

    public String getLitraz() {
        return litraz;
    }

    public String getProcent() {
        return procent;
    }

    public void setLitraz(String litraz) {
        this.litraz = litraz;
    }

    public void setProcent(String procent) {
        this.procent = procent;
    }
}
