import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTDDTest {

    private final CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

    @Test
    void deveLancarExcecaoParaValorZeroOuNegativo() {
        assertThrows(IllegalArgumentException.class, () -> calc.calcularValorFinal(0, false));
        assertThrows(IllegalArgumentException.class, () -> calc.calcularValorFinal(-50, false));
    }

    @Test
    void deveAplicar10PorcentoAcimaDe500() {
        assertEquals(540.0, calc.calcularValorFinal(600.0, false), 0.001);
        assertEquals(500.0, calc.calcularValorFinal(500.0, false), 0.001); // limite: sem desconto
    }
}