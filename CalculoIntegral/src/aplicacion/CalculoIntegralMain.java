package aplicacion;
import mates.Matematicas;

public class CalculoIntegralMain {
    public static void main(String[] args) {
        // Llamamos al método integralEXCuadrado de la clase Matematicas
        double resultado = Matematicas.integralEXCuadrado(0, 1, 0.1);

        // Mostramos el resultado de la integral
        System.out.println("Resultado de la integral de e^(x^2) entre 0 y 1: " + resultado);
    }
}
