package Desafios.Desafio6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Sistema {
    private List<Ninja> lista = new LinkedList<Ninja>();

    public Sistema() {
    }

    public void addNinja(Ninja ninja) {
        lista.addFirst(ninja);
    }

    public void removeNinja() {
        lista.removeFirst();
    }

    public List<Ninja> getLista() {
        return lista;
    }

    public Ninja getNinja(int index) {
        return lista.get(index);
    }

    public void sortByName() {
        lista.sort(Comparator.comparing(Ninja::getName));
    }

    public void sortByAge() {
        lista.sort(Comparator.comparing(Ninja::getAge));
    }

    public void sortByVila() {
        lista.sort(Comparator.comparing(Ninja::getVila));
    }
}
