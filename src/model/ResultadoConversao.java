package model;

public class ResultadoConversao {
    private double valorParaConverter;
    private double valorConvertido;
    private String codigoMoedaOrigem;
    private String codigoMoedaDestino;
    private double taxaDeCambio;

    public ResultadoConversao(double valorParaConverter, double valorConvertido, String codigoMoedaOrigem, String codigoMoedaDestino, double taxaDeCambio) {
        this.valorParaConverter = valorParaConverter;
        this.valorConvertido = valorConvertido;
        this.codigoMoedaOrigem = codigoMoedaOrigem;
        this.codigoMoedaDestino = codigoMoedaDestino;
        this.taxaDeCambio = taxaDeCambio;
    }

    public double getValorParaConverter() {
        return valorParaConverter;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public String getCodigoMoedaOrigem() {
        return codigoMoedaOrigem;
    }

    public String getCodigoMoedaDestino() {
        return codigoMoedaDestino;
    }

    public double getTaxaDeCambio() {
        return taxaDeCambio;
    }
}
