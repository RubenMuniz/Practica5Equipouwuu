package org.example;

public abstract class Paquete {
    private String nombreDestino;
    private double pesoKg;
    private EstrategiaEnvio estrategiaEnvio;

    public Paquete(String nombreDestino, double pesoKg, EstrategiaEnvio estrategiaEnvio) {
        if (pesoKg<=0){
            System.out.println("El peso debe ser mayor a 0");
        }
        this.nombreDestino = nombreDestino;
        this.pesoKg = pesoKg;
        this.estrategiaEnvio = estrategiaEnvio;
    }
    public double CalcularCosto(){
        return estrategiaEnvio.calcularCosto(pesoKg);
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public EstrategiaEnvio getEstrategiaEnvio() {
        return estrategiaEnvio;
    }

    public void setEstrategiaEnvio(EstrategiaEnvio estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }
}