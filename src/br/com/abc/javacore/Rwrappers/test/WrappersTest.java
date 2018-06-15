package br.com.abc.javacore.Rwrappers.test;

public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = new Integer("10");
        Long longWrapper = Long.valueOf("10");
        Float floatWrapper = new Float("10");
        Double doubleWrapper = 10D;
        Character charWrapper = new Character('A');
        Boolean booleanWrapper = new Boolean("tRUe");

        String valor = "10";
        float f = Float.parseFloat(valor);
        System.out.println(f);

        System.out.println(booleanWrapper);

        int i = intWrapper;

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));


    }
}
