import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescontoTradicionalTest {

    private final CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional();

    @Test
    void deveLancarExcecaoQuandoValorForZeroOuNegativo() {
        assertThrows(IllegalArgumentException.class, () -> calc.calcularValorFinal(0.0, false));
        assertThrows(IllegalArgumentException.class, () -> calc.calcularValorFinal(-10.0, true));
    }

    @Test
    void deveAplicarDezPorCentoDeDescontoAcimaDeQuinhentos() {
        assertEquals(540.0, calc.calcularValorFinal(600.0, false), 0.01);
    }

    @Test
    void deveAplicarVintePorCentoDeDescontoAcimaDeMil() {
        assertEquals(960.0, calc.calcularValorFinal(1200.0, false), 0.01);
    }

    @Test
    void deveAplicarDescontoVipAdicional() {
        assertEquals(513.0, calc.calcularValorFinal(600.0, true), 0.01);
    }

    @Test
    void deveCobrarFreteQuandoValorFinalForMenorQueCem() {
        assertEquals(110.0, calc.calcularValorFinal(100.0, true), 0.01);
    }
}