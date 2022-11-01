package test;

import org.junit.jupiter.api.Test;

import main.ILogistica;
import main.LogisticaFactory;

import static org.junit.jupiter.api.Assertions.*;

class LogisticaMarinhaTest {
    @Test
    void deveBuscarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Marinha");
        assertEquals("Busca pacote por vias marinhas", logistica.buscarPacote());
    }

    @Test
    void deveEntregarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Marinha");
        assertEquals("Entrega pacote por vias marinhas", logistica.entregar());
    }
}
