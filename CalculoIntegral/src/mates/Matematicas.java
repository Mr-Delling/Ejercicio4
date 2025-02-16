package mates;
public class Matematicas {

    // Método para calcular la integral de e^(x^2) utilizando el método de los rectángulos
    // Usamos la formula de la suma de Riemann
    // Donde x son los puntos en el intervalo entre el limite inferior y limite superior y h el paso entre los puntos
    public static double integralEXCuadrado(double limInf, double limSup, double h) {
        double suma = 0;

        // Iteramos desde limInf hasta limSup, incrementando de  h
        for (double x = limInf; x < limSup; x += h) {
            suma += Math.exp(x * x) * h; // Agregamos la contribución de cada rectángulo
        }

        return suma; // Devolvemos el resultado de la integral
    }
}
