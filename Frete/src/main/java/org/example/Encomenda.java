package org.example;

public class Encomenda {
    private double valorFrete;

    public double getValorFrete() {
        return valorFrete;
    }

    public void calcularFreteNormal(double peso, double distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        Frete tipoFrete = (Frete) new FreteNormal();
        this.valorFrete = calculadora.calcular(tipoFrete);
    }

    public void calcularFreteExpresso(double peso, double distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        Frete tipoFrete = (Frete) new FreteExpresso();
        this.valorFrete = calculadora.calcular(tipoFrete);
    }

    public void calcularFreteEconomico(double peso, double distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        Frete tipoFrete = (Frete) new FreteEconomico();
        this.valorFrete = calculadora.calcular(tipoFrete);
    }
}

