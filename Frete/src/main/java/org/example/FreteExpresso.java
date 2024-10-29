package org.example;

public class FreteExpresso implements Frete {
    public double calcular(double peso, double distancia) {
        return peso * 2.0 + distancia * 1.0;
    }
}
