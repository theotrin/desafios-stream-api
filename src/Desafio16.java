import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Agrupe os números em pares e ímpares
public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> filtrarPar = numero -> numero %2 ==0;
        Predicate<Integer> filtrarImpar = numero -> numero %2 !=0;

        List<Integer> grupoPar = numeros.stream().filter(filtrarPar).toList();
        List<Integer> grupoImpar = numeros.stream().filter(filtrarImpar).toList();

        System.out.printf("grupo par: %s, grupo impar: %s", grupoPar,grupoImpar);
    }
}
