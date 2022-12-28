package main.java.br.agoraeuquero.ticketcontroller.service;

public class NumeroBemValidator {
	
	public static boolean isNB(String NB) {
		// regra da empresa para validar numero de patrimonio
		// sem recorrer a dados persistidos
		// falta ajustar o return
		
		if (NB.equals("000000000000000") ||
			NB.equals("111111111111111") ||
			NB.equals("222222222222222") ||
			NB.equals("333333333333333") ||
			NB.equals("444444444444444") ||
			NB.equals("555555555555555") ||
			NB.equals("666666666666666") ||
			NB.equals("777777777777777") ||
			NB.equals("888888888888888") ||
			NB.equals("999999999999999") ||
			(NB.length() != 15))
					
		return (false);
		return false;
	}

}
