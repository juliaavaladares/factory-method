package test;

import org.junit.jupiter.api.Test;

import main.ILogistica;
import main.LogisticaFactory;

import static org.junit.jupiter.api.Assertions.*;

class LogisticaAereaTest {
    @Test
    void deveBuscarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Aerea");
        assertEquals("Busca pacote por vias aéreas", logistica.buscarPacote());
    }

    @Test
    void deveEntregarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Aerea");
        assertEquals("Entrega pacote por vias aéreas", logistica.entregar());
    }
}
