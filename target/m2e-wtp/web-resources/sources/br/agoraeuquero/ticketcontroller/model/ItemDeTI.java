package main.java.br.agoraeuquero.ticketcontroller.model;

import java.io.Serializable;

import main.java.br.agoraeuquero.ticketcontroller.service.NumeroBemValidator;

public class ItemDeTI implements Serializable {
	
	// Value object

	private static final long serialVersionUID = 1L;

	private Integer id;
	private ITIClasse ITIClasse;
	private String NomeItem;
	private NumeroBemValidator NumeroBem;
	private String Fabricante;
	private ITILocalizacao ITILocalizacao;

	public ItemDeTI(Integer id, main.java.br.agoraeuquero.ticketcontroller.model.ITIClasse iTIClasse, String nomeItem,
			NumeroBemValidator numeroBem, String fabricante,
			main.java.br.agoraeuquero.ticketcontroller.model.ITILocalizacao iTILocalizacao) {
		super();
		this.id = id;
		ITIClasse = iTIClasse;
		NomeItem = nomeItem;
		NumeroBem = numeroBem;
		Fabricante = fabricante;
		ITILocalizacao = iTILocalizacao;
	}

}
