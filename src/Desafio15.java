import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Verifique se a lista contém pelo menos um número negativo
public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2,-5,3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Consumer<Integer> verificarNegativo = numero -> {
            if(numero <0){
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(verificarNegativo);
    }
}
