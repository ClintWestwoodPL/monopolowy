package io;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Sklep;

import java.io.File;
import java.io.IOException;

public class OdczytZapisJson implements OperacjePlikowe {

    private  ObjectMapper mapper = new ObjectMapper();

    public Sklep odczyt () throws Exception {


        Sklep sklep =
                mapper.readValue(new File("sklep.json"), Sklep.class);

       // System.out.println(sklep);

        return sklep;

    }


    public void zapis (Sklep sklep) {

      //  Sklep sklep = null;


        try {
            mapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValue(new File("sklep.json"), sklep);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("blad zapisu pliku");
        }


    }







}
