package main.java.br.agoraeuquero.ticketcontroller.model;

import java.io.Serializable;

import main.java.br.agoraeuquero.ticketcontroller.service.NumeroBemValidator;

public class ItemDeTI implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private ITIClasse ITIClasse;
	private String NomeItem;
	private NumeroBemValidator NumeroBem;
	private String Fabricante;
	private ITILocalizacao ITILocalizacao;
	
	
}

	