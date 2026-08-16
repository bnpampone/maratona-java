package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {

    // Benchmark
    // Unboxing | boxing
    // (limit, findFirst) não são bons para parallels, enquanto (findAny) é bom
    // Custo total da computação - geralmente quanto maior a qnt de Processamentos, Paralalles são eficientes
    // Quantidade de Dados - Se for uma pequena quantidade, não vale a pena
    // Tipos de coleções
    // Tamanho do Stream (tamanho definido)
    // Processamento do merge

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelStreamIterate(num);
    }
    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for(long i = 1; i <= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void sumStreamIterate(long num){
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void sumParallelStreamIterate(long num){
        System.out.println("Sum sumParallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void sumLongStreamIterate(long num){
        System.out.println("Sum sumLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");

    }

    private static void sumParallelLongStreamIterate(long num){
        System.out.println("Sum sumParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");

    }
}