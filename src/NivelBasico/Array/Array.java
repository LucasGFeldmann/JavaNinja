package NivelBasico.Array;

public class Array {
    public static void main(String[] args) {
        String[] nome = {"Lucas", "Erike"};
        String[] nomes = new String[3];

        
        Long[] t1 = new Long[1];
        System.out.println("t1[0] = " + t1[0]);
        long[] t2 = new long[1];
        System.out.println("t2[0] = " + t2[1]);
        
        
        

        for (String item : nomes) {
            System.out.println(item);
        }
    }
}
