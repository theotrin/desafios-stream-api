import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// Agrupe os valores ímpares múltiplos de 3 ou de 5:
public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numerosImpares = numero -> numero%2!=0;
        Predicate<Integer> numerosDivisiveis = numero -> numero%3==0 || numero%5==0 ;

        List<Integer> impares = numeros.stream()
                .filter(numerosImpares)
                .filter(numerosDivisiveis)
                .toList();

        System.out.println(impares);
    }
}
