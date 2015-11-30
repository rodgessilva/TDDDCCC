package net.baade.atendimento;

import java.math.BigDecimal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.val;

@Data
@AllArgsConstructor
public class Procedimento {

	public Procedimento( String descricao, val valorItem ) {
		this.descricao = descricao;
		this.valor = (BigDecimal) valorItem;
	}

	private String descricao;
	private BigDecimal valor;
	private Medico medico;
	public BigDecimal getValor() {
		// TODO Auto-generated method stub
		return null;
	}

}
