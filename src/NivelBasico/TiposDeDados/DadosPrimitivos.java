package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        * Existem 8 tipos primitivos
        * */

        /*
        * byte (comporta 8-bit):
        * Suporta valores de 127 e -128.
        * */
        System.out.println("\nbyte:");
        byte var1 = -128;
        byte var2 = 127;
        System.out.println("Maximo: " + var2);
        System.out.println("Minimo: " + var1);

        /*
         * short (comporta 16-bit):
         * Suporta valores de 32,767 e -32,768.
         * */
        System.out.println("\nshort:");
        short var3 = -32768;
        short var4 = 32767;
        System.out.println("Maximo: " + var4);
        System.out.println("Minimo: " + var3);

        /*
         * int (comporta 16-bit):
         * Suporta valores de 2147483647 e -2147483648.
         * */
        System.out.println("\nint:");
        int var5 = -2147483648;
        int var6 = 2147483647;
        System.out.println("Maximo: " + var6);
        System.out.println("Minimo: " + var5);

    }
}
