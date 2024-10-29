package org.example;

public class CalculadoraFrete {
    private static final double FRETE_MINIMO = 10.0;
    private double peso;
    private double distancia;

    public CalculadoraFrete(double peso, double distancia) {
        if (peso < 0) {
            throw new IllegalArgumentException("Peso não pode ser negativo");
        }
        if (distancia < 0) {
            throw new IllegalArgumentException("Distância não pode ser negativa");
        }
        this.peso = peso;
        this.distancia = distancia;
    }

    public double calcular(Frete tipoFrete) {
        double valorCalculado = tipoFrete.calcular(peso, distancia);
        return Math.max(valorCalculado, FRETE_MINIMO);
    }
}


