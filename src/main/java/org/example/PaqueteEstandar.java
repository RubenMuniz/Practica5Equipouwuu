package org.example;

public class PaqueteEstandar extends Paquete{
    public PaqueteEstandar(String nombreDestino, double pesoKg) {
        super(nombreDestino, pesoKg, new EnvioEstandar());
    }
}