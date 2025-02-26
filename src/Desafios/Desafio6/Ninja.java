package Desafios.Desafio6;

public class Ninja {
    private String name;
    private int age;
    private Vila vila;

    public Ninja(String name, int age, Vila vila) {
        this.name = name;
        this.age = age;
        this.vila = vila;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", vila=" + vila +
                '}';
    }

    public Vila getVila() {
        return vila;
    }

    public void setVila(Vila vila) {
        this.vila = vila;
    }
}
