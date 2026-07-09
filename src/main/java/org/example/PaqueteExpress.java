package org.example;

public class PaqueteExpress extends Paquete{
    public PaqueteExpress(String nombreDestino, double pesoKg) {
        super(nombreDestino, pesoKg, new EnvioExpress());
    }
}