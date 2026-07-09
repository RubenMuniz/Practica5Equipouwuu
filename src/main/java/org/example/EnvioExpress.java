package org.example;

public class EnvioExpress implements EstrategiaEnvio{
    @Override
    public double calcularCosto(double peso) {
        return (peso * 4.5) + 3.0;
    }
}
