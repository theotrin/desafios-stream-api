import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Filtrar os números que estão dentro de um intervalo:
public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int min = 5;
        int max = 10;

        Predicate<Integer> filtro = numero -> numero >= min && numero <= max;

        numeros.stream().filter(filtro).forEach(System.out::println);
    }
}
