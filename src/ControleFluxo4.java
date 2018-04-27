public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 11;

        while( contador < 10 ) {
            System.out.println(contador);
            contador++;
        }

        do {
            System.out.println("dentro do do while");
            contador++;
        } while( contador < 10 );

        for( int i = 0; i < 10; i++ ) {
            System.out.println("o valor de i é: " + i);
        }
    }
}
