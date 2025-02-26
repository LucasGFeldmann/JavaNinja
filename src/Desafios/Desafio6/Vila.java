package Desafios.Desafio6;

public enum Vila {
    A("Junin"), B("Star"), C("Hokage");

    private final String name;

    Vila(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
