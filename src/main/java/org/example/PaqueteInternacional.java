package org.example;

public class PaqueteInternacional extends Paquete {
    public PaqueteInternacional(String nombreDestino, double pesoKg) {
        super(nombreDestino, pesoKg, new EnvioInternacional());
    }
}