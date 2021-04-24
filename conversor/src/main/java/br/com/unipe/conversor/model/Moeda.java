package br.com.unipe.conversor.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Moeda {
	
	private float valor;

	public Moeda() {
	}

	public Moeda(float valor) {
		super();
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public double converter() {
		double resultado = this.valor * 5.48;
		BigDecimal resultadoFormatado = new BigDecimal(resultado).setScale(2, RoundingMode.DOWN);
		return resultadoFormatado.doubleValue();
		
	}
	
}
