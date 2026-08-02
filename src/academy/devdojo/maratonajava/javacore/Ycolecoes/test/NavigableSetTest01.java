package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Livro;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone smartphone, Smartphone t1) {
        return smartphone.getMarca().compareTo(t1.getMarca());
    }
}

class LivroPrecoComparator implements Comparator<Livro>{

    @Override
    public int compare(Livro livro, Livro t1) {
        return Double.compare(livro.getPreco(), t1.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Livro> livros = new TreeSet<>(new LivroPrecoComparator());
        livros.add(new Livro(5L,"Zorro", 19.9, 0));
        livros.add(new Livro(1L,"Dom Quixote",9.5, 5));
        livros.add(new Livro(4L,"Memorias Postumas de Brascubas", 3.2, 0));
        livros.add(new Livro(3L,"O ladrão de casaca", 11.20, 2));
        livros.add(new Livro(2L,"A pedra filosofal - Harry Potter", 2.99, 0));
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        Livro xaxa = new Livro(21L, "xaxa Yayah", 3.2, 2);

        // Metodos de Comparação
        // lower < Traz o valor imediatamente menor
        // floor <= Traz o mesmo valor ou caso nao exista o anterior
        // higher > Traz o valor imediatamente maior
        // ceiling >= Traz o mesmo valor ou caso nao exista o maior
        System.out.println("====================================");
        System.out.println(livros.lower(xaxa));
        System.out.println(livros.floor(xaxa));
        System.out.println(livros.higher(xaxa));
        System.out.println(livros.ceiling(xaxa));

//        System.out.println(livros.size());
//        System.out.println(livros.pollFirst());
//        System.out.println(livros.size());

        System.out.println(livros.size());
        System.out.println(livros.pollLast());
        System.out.println(livros.size());
    }
}