package org.example;

public class FreteNormal implements Frete {
    public double calcular(double peso, double distancia) {
        return peso * 1.0 + distancia * 0.5;
    }
}
