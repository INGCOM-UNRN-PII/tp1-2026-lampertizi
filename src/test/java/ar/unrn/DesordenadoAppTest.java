package ar.unrn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Probando los tests")
class DesordenadoAppTest {

    @Test
    @DisplayName("Dos mas cuatro")
    void sumaPositiva() {
        int resultado = DesordenadoApp.suma(2, 4);
        int esperado = 6;
        Assertions.assertEquals(esperado, resultado, "La suma positiva no dio bien");
    }

    @Test
    @DisplayName("Este falla a proposito")
    void falla() {
        Assertions.fail("Esto tiene sus usos!");
    }
}
