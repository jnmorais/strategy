package org.example;

public class FreteEconomico implements Frete {
    public double calcular(double peso, double distancia) {
        return peso * 0.5 + distancia * 0.25;
    }
}
