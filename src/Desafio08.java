import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

// Somar os dígitos de todos os números da lista:
public class Desafio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> somar = (num1,num2) -> num1+num2;

        int resultado = numeros.stream().reduce(0,somar);

        System.out.println(resultado);
    }
}
