package net.baade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Recibo {
	private String nomeCliente;
	private String nomeAnimal;
<<<<<<< HEAD
	private BigDecimal valorAtendimento = new BigDecimal( 0 );
	private List<Item> itens;
=======
	
>>>>>>> branch 'HEAD' of https://github.com/rodgessilva/TDDC.git
	public String getNomeCliente() {
		return nomeCliente;
		
	}

	public BigDecimal getValorAtendimento() {
		return valorAtendimento;
	}

	public void setValorAtendimento(BigDecimal valorAtendimento) {
		this.valorAtendimento = valorAtendimento;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

<<<<<<< HEAD
=======
	public BigDecimal getValorAtendimento() {
		return valorProcedimento;
	}

	public void setValorAtendimento(BigDecimal valorProcedimento) {
		this.valorProcedimento = valorProcedimento;
	}

>>>>>>> branch 'HEAD' of https://github.com/rodgessilva/TDDC.git
	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

<<<<<<< HEAD
	
=======
	private BigDecimal valorProcedimento = new BigDecimal( 0 );

	private List<Item> itens;
>>>>>>> branch 'HEAD' of https://github.com/rodgessilva/TDDC.git

	public void listaItemAdd( Item item ) {
		if ( itens == null ) {
			itens = new ArrayList<Item>();
		}
		itens.add( item );
<<<<<<< HEAD
		this.valorAtendimento = this.valorAtendimento.add( item.getValor() );
=======
		this.valorProcedimento = this.valorProcedimento.add( item.getValor() );
>>>>>>> branch 'HEAD' of https://github.com/rodgessilva/TDDC.git
	}
}
