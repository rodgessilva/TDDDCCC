package net.baade.financas;

import java.math.BigDecimal;
import java.util.List;

import net.baade.Cliente;
import net.baade.atendimento.Procedimento;
import lombok.Data;

@Data
public class Fatura {

	private Cliente cliente;

	private List<Procedimento> procedimentos;

	private BigDecimal valorFatura;

	public void setCliente(Class<? extends Recibo> class1) {
		// TODO Auto-generated method stub
		
	}

	public void setProcedimentos(Object itens) {
		// TODO Auto-generated method stub
		
	}

	public void setValorFatura(BigDecimal bd) {
		// TODO Auto-generated method stub
		
	}

}
