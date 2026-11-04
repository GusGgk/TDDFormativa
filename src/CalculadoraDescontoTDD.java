public class CalculadoraDescontoTDD {
    public double calcularValorFinal(double valorTotal, boolean isVip) {
        if (valorTotal <= 0) {
            throw new IllegalArgumentException("O valor total dos itens não pode ser zero ou negativo.");
        }
        double desconto = 0.0;
        if (valorTotal > 1000.0) {
            desconto = 0.20;
        } else if (valorTotal > 500.0) {
            desconto = 0.10;
        }
        double valorComDesconto = valorTotal * (1 - desconto);
        if (isVip) {
            valorComDesconto = valorComDesconto * 0.95;
        }
        return valorComDesconto;
    }
}
