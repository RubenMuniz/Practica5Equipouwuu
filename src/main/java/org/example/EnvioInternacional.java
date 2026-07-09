package org.example;

public class EnvioInternacional implements EstrategiaEnvio{

    @Override
    public double calcularCosto(double peso) {
        return (peso * 6.0) + 10.0;
    }
}