Feature: Atendimento Gatos




	To permitir o faturamento dos servicos prestados aos clientes 
	
	Scenario: Castra��o e Estereliza��o
		Given um cliente com nome "Traci Heinrich" que tem dois animais de nomes "Tweedle Dee" e "Tweedle Dum"
		And um servico de "Castra��o" 
		And um outro servico de "Estereliza��o"
	When o cliente vai pagar em "Boleto"
	Then o recibo deve ter 4 servicos
		And o servico 1 deve ser "Castra��o"
		And o servico 2 deve ser "Castra��o"
		And o servico 1 deve ser "Estereliza��o"
		And o servico 2 deve ser "Estereliza��o"
	 