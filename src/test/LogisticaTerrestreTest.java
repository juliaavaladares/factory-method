package test;

import org.junit.jupiter.api.Test;

import main.ILogistica;
import main.LogisticaFactory;

import static org.junit.jupiter.api.Assertions.*;

class LogisticaTerrestreTest {
    @Test
    void deveBuscarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Terrestre");
        assertEquals("Busca pacote por rodovias", logistica.buscarPacote());
    }

    @Test
    void deveEntregarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Terrestre");
        assertEquals("Entrega pacote por rodovias", logistica.entregar());
    }
}
