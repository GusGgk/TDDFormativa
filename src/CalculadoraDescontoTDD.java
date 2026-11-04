public class CalculadoraDescontoTDD {
    public double calcularValorFinal(double valorTotal, boolean isVip) {
        if (valorTotal <= 0) {
            throw new IllegalArgumentException("O valor total dos itens não pode ser zero ou negativo.");
        }
        if (valorTotal > 500.0) {
            return valorTotal * 0.90;
        }
        return valorTotal;
    }
}
