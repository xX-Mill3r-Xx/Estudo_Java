package util;

public class CurrencyConverter {
	public double ValorDolar;
	public double ValorReal;
	public double IOF;
	
	public double calcularValorReal(double valorReal,double valorDolar, double cotacao) {
		ValorDolar = valorDolar;
		ValorReal = valorReal;
		IOF = cotacao;
		double valorSemIOF = valorDolar * cotacao;
		double valorComIOf = valorReal * 1.06;
		return valorComIOf;
		
	}
}
