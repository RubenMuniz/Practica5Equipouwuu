package org.example;

public class EnvioEstandar implements EstrategiaEnvio{
    @Override
    public double calcularCosto(double peso) {
        return peso * 2.0;
    }
}
