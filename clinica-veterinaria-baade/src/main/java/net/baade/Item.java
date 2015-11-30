package net.baade;

import java.math.BigDecimal;


import lombok.Data;


public class Item {
	private String descricao1;
	private BigDecimal valor1;
	public String getDescricao() {
		return descricao1;
	} 

	public void setDescricao(String descricao) {
		this.descricao1 = descricao;
	}

	public BigDecimal getValor() {
		return valor1;
	}

	public void setValor(BigDecimal valor) {
		this.valor1 = valor;
	}

	public Item(String descricao, BigDecimal valor) {
		this.descricao1 = descricao;
		this.valor1 = valor;
	}

<<<<<<< HEAD
	private String descricao;
	private BigDecimal valor;
=======

>>>>>>> branch 'HEAD' of https://github.com/rodgessilva/TDDC.git

}
