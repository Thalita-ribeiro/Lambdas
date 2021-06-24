package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        lambdas.Calculo soma = (x, y) -> { return x + y;
        };
            System.out.println(soma.executar(2, 5));

            soma = (x, y) -> x * y;
            System.out.println(soma.executar(5, 5));
    }
}
