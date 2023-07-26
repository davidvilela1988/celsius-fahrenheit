
public class Main {
    public static void main(String[] args) {
        String nome = "David";
        int celsius = 16;
        double fahrenheit = (int) (celsius *1.8 + 32);
        double fahrenheit2 = (celsius *1.8 + 32);
        String temperatura = """
                Olá, %s.
                A temperatura equivalente de %dº Celsius em Fahrenheit sem casas decimais é: %.0fº.
                Com casas decimais seria: %.2fºF;
                
                """.formatted(nome, celsius, fahrenheit, fahrenheit2);
        System.out.println(temperatura);
    }
}