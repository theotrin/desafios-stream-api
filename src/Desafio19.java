import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

// Encontre a soma dos números divisíveis por 3 e 5
public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numerosDivisiveis = numero -> numero%3==0 || numero%5==0;

        BinaryOperator<Integer> somarTodos = (num1, num2) -> num1+num2;

        int somaTotal = numeros.stream()
                .filter(numerosDivisiveis)
                .reduce(somarTodos)
                .get();

        System.out.println(somaTotal);
    }
}
