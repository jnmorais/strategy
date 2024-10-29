package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncomendaTest {
    @Test
    void deveCalcularFreteNormal() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteNormal(10.0, 100.0);
        assertEquals(60.0, encomenda.getValorFrete());
    }

    @Test
    void deveCalcularFreteExpresso() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteExpresso(10.0, 100.0);
        assertEquals(120.0, encomenda.getValorFrete());
    }

    @Test
    void deveCalcularFreteEconomico() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteEconomico(10.0, 100.0);
        assertEquals(30.0, encomenda.getValorFrete());
    }

    @Test
    void naoDeveCalcularFreteComPesoNegativo() {
        try {
            Encomenda encomenda = new Encomenda();
            encomenda.calcularFreteNormal(-10.0, 100.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso não pode ser negativo", e.getMessage());
        }
    }

    @Test
    void naoDeveCalcularFreteComDistanciaNegativa() {
        try {
            Encomenda encomenda = new Encomenda();
            encomenda.calcularFreteNormal(10.0, -100.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distância não pode ser negativa", e.getMessage());
        }
    }

    @Test
    void deveCalcularFreteMinimoParaPesosBaixos() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteNormal(0.1, 10.0);
        assertTrue(encomenda.getValorFrete() >= 10.0);
    }
}