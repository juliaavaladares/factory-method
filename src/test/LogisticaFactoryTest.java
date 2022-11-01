package test;

import org.junit.jupiter.api.Test;

import main.ILogistica;
import main.LogisticaFactory;

import static org.junit.jupiter.api.Assertions.*;

class LogisticaFactoryTest {
    @Test
    void deveRetornarExcecaoParaLogisticaInexistente() {
        try {
            ILogistica logistica = LogisticaFactory.obterLogistica("Errada");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Logistica inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaLogisticaInvalida() {
        try {
            ILogistica logistica = LogisticaFactory.obterLogistica("Invalida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Logistica inexistente", e.getMessage());
        }
    }
}
