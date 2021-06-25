import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> soma = (x, y) -> {
            return x + y;
        };
        System.out.println(soma.apply(20.0, 500.0));

        soma = (x, y) -> x * y;
        System.out.println(soma.apply(52.0, 5.0));
    }
}
