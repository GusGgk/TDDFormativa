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

    @Test
    void deveAplicar20PorcentoAcimaDe1000() {
        assertEquals(960.0, calc.calcularValorFinal(1200.0, false), 0.001);
        assertEquals(900.0, calc.calcularValorFinal(1000.0, false), 0.001); // limite: ainda 10%
    }

    @Test
    void deveAplicar5PorcentoAdicionalParaVip() {
        assertEquals(513.0, calc.calcularValorFinal(600.0, true), 0.001);
    }

    @Test
    void deveCobrarFreteAbaixoDe100() {
        assertEquals(95.0, calc.calcularValorFinal(80.0, false), 0.001);
        assertEquals(110.0, calc.calcularValorFinal(100.0, true), 0.001); // VIP: 95 + 15 de frete
        assertEquals(100.0, calc.calcularValorFinal(100.0, false), 0.001); // limite: sem frete
    }
}