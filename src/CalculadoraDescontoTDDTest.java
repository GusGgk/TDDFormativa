import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTDDTest {

    private final CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

    @Test
    void deveLancarExcecaoParaValorZeroOuNegativo() {
        assertThrows(IllegalArgumentException.class, () -> calc.calcularValorFinal(0, false));
        assertThrows(IllegalArgumentException.class, () -> calc.calcularValorFinal(-50, false));
    }
}