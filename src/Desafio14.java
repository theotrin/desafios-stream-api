import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

//  Encontre o maior número primo da lista
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        Predicate<Integer> retor = Desafio14::isPrimo;

     int maiorPrimo = numeros.stream().filter(retor).max(Integer::compareTo).get();

        System.out.println(maiorPrimo);

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