import java.util.Scanner;

public class TransformTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em Fahrenheit: ");
        double temperature = scanner.nextDouble();
        System.out.printf("%.2f °F = %.2f °C", temperature, toCelsius(temperature));
    }
    public double toCelsius(double temperature){
        return 5 * ((temperature-32) / 9);

    }
}
