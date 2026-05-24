import java.util.Scanner;
import net.salesianos.figuras.circulo.Circulo;
import net.salesianos.figuras.rectangulo.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Introduce el radio del círculo:");
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("El área del círculo sabiendo que el radio es: " + radio + " es: " + circulo.calcularArea());
        System.out.println("El perímetro del círculo sabiendo que el radio es: " + radio + " es: " + circulo.calcularPerimetro());

        System.out.println("Introduce la base del rectángulo:");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura del rectángulo:");
        double altura = sc.nextDouble();
        Rectangulo rectangulo = new Rectangulo(base, altura);
        System.out.println("El área del rectángulo sabiendo que la base es: " + base + " y la altura es: " + altura + " es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo sabiendo que la base es: " + base + " y la altura es: " + altura + " es: " + rectangulo.calcularPerimetro());


        sc.close();
   
    }
    
}
