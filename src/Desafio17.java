import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Filtrar os números primos da lista
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> filtraPrimo = Desafio17::isPrimo;

        List<Integer> numerosPrimos = numeros.stream().filter(filtraPrimo).toList();

        System.out.println(numerosPrimos);
    }
    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
