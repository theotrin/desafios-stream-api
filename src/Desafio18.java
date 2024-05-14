import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Verifique se todos os números da lista são iguais
public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(4,4,4);

        Predicate<Integer> verificarNumerosIguais = numero -> numero.equals(numeros.get(0));

       Boolean todoIguais = numeros.stream().allMatch(verificarNumerosIguais);

       if(!todoIguais) {
           System.out.println("Existe numeros diferentes na lista");
       }else {
           System.out.println("Todos os numeros são iguais");
       }
    }
}
