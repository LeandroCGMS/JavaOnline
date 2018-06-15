package br.com.abc.javacore.Sstrings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com String = " + (fim - inicio) + " milissegundos.");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuilder = " + (fim - inicio) + " milissegundos.");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuffer = " + (fim - inicio) + " milissegundos.");

    }

    private static void concatString(int tam) {

        String string = "";
        for(int i = 0; i < tam; i++) {
            string += i;
        }
    }

    private static void concatStringBuilder(int tam) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tam; i++) {
            sb.append(i);

        }
    }

    private static void concatStringBuffer(int tam) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < tam; i++) {
            sb.append(i);

        }
    }

}
