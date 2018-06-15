package br.com.abc.javacore.Tdatas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String mascara = "'Campo Grande,' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));

    }
}
