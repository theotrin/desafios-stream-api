import java.util.Arrays;
import java.util.List;

// Encontrar o segundo número maior da lista
public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer numerosOrdenados = numeros
                .stream()
                .sorted((num1,num2) -> Integer.compare(num2,num1))
                .distinct()
                .skip(1)
                .findFirst()
                .get();

        System.out.println(numerosOrdenados);
    }
}
