import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// Desafio 4 - Remova todos os valores ímpares:
public class Desafio04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> removerImpar = numero -> numero %2 ==0;

        numeros.stream().filter(removerImpar).forEach(System.out::println);
    }
}