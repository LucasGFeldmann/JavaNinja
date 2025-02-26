package Desafios.Desafio6;

public class Main {
    public static void main(String[] args) {
        Sistema sys = new Sistema();


        Ninja lucas = new Ninja("Lucas", 20, Vila.A);
        Ninja erike = new Ninja("Erike", 14, Vila.A);
        Ninja evandro = new Ninja("Evandro", 44, Vila.B);
        Ninja sonia = new Ninja("Sonia", 42, Vila.C);
        Ninja vitoria = new Ninja("Vitória", 20, Vila.B);


        sys.addNinja(lucas);
        sys.addNinja(erike);
        sys.addNinja(evandro);
        sys.addNinja(sonia);
        sys.addNinja(vitoria);


        sys.sortByName();
        System.out.println("\nOrdenado pelo Nome");
        System.out.println(sys.getLista());
        sys.removeNinja();

        sys.sortByAge();
        System.out.println("\nOrdenado pelo Idade");
        System.out.println(sys.getLista());

        sys.sortByVila();
        System.out.println("\nOrdenado pelo Vila");
        System.out.println(sys.getLista());
    }
}
