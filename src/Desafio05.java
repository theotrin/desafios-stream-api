import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Calcule a média dos números maiores que 5:
public class Desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaioresQueCinco = numeros.stream()
                .filter(numero -> numero >5)
                .toList();

        double media = numerosMaioresQueCinco.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(media);
    }
}
