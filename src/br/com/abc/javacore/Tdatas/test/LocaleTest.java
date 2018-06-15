package br.com.abc.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        // ISO 639 pt = português, BR = Brasil, en =  inglês, US = Estados Unidos
        Locale locItaly = new Locale("it","IT");
        Locale locSuica = new Locale("it","CH");
        Locale locIndia = new Locale("hi","IN");
        Locale locJapao = new Locale("ja");
        Locale locBrasil = new Locale("pt","BR");
        Calendar c = Calendar.getInstance();
        //c.set(2015, Calendar.DECEMBER, 23);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,locSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,locIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,locJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,locBrasil);
        System.out.println("Itália: " + df.format(c.getTime()));
        System.out.println("Suiça: " + df2.format(c.getTime()));
        System.out.println("Índia: " + df3.format(c.getTime()));
        System.out.println("Japão: " + df4.format(c.getTime()));
        System.out.println("Brasil: " + df5.format(c.getTime()) + "\n");

        System.out.println(locItaly.getDisplayLanguage(locJapao));
        System.out.println(locSuica.getDisplayLanguage());
        System.out.println(locIndia.getDisplayLanguage());
        System.out.println(locJapao.getDisplayLanguage(locItaly));
        System.out.println(locBrasil.getDisplayLanguage());
        System.out.println(locSuica.getDisplayCountry(locItaly));
    }
}
