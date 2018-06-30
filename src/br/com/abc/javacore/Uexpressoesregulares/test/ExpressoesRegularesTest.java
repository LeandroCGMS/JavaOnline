package br.com.abc.javacore.Uexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // \d - todos os dígitos
        // \D - tudo o que não for dígito
        // \s - espaços em branco \t \n \r \f
        // \S - caractere que não é branco
        // \w - caracteres de palavras: a-z A-Z, dígitos de underlines
        // \W - tudo o que não for caractere de palavra
        // QUANTIFICADORES
        // ? zero ou mais
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $
        // o(v|c)o = ovo, oco
        //maca(rr|c)ão = macarrão ou macacão
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0x1FFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Índice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições encontradas: ");
        while(matcher.find()) System.out.println(matcher.start() + " " + matcher.group());
    }
}
