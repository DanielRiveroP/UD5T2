import java.util.Scanner;
import net.salesianos.figuras.circulo.Circulo;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Introduce el radio del círculo:");
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("El área del círculo sabiendo que el radio es: " + radio + " es: " + circulo.calcularArea());
        System.out.println("El perímetro del círculo sabiendo que el radio es: " + radio + " es: " + circulo.calcularPerimetro());

    }
}
