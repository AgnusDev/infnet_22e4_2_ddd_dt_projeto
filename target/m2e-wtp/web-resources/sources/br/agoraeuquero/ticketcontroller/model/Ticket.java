package main.java.br.agoraeuquero.ticketcontroller.model;

import java.io.Serializable;

public class Ticket implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer tid;
	private PerfilCliente PerfilCliente;
	private PerfilAgente PerfilAgente;
	private ItemDeTI ItemDeTI;

	public Ticket(Integer tid, main.java.br.agoraeuquero.ticketcontroller.model.PerfilCliente perfilCliente,
			main.java.br.agoraeuquero.ticketcontroller.model.PerfilAgente perfilAgente,
			main.java.br.agoraeuquero.ticketcontroller.model.ItemDeTI itemDeTI) {
		super();
		this.tid = tid;
		PerfilCliente = perfilCliente;
		PerfilAgente = perfilAgente;
		ItemDeTI = itemDeTI;
	}

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", PerfilCliente=" + PerfilCliente + ", PerfilAgente=" + PerfilAgente
				+ ", ItemDeTI=" + ItemDeTI + "]";
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public PerfilCliente getPerfilCliente() {
		return PerfilCliente;
	}

	public void setPerfilCliente(PerfilCliente perfilCliente) {
		PerfilCliente = perfilCliente;
	}

	public PerfilAgente getPerfilAgente() {
		return PerfilAgente;
	}

	public void setPerfilAgente(PerfilAgente perfilAgente) {
		PerfilAgente = perfilAgente;
	}

	public ItemDeTI getItemDeTI() {
		return ItemDeTI;
	}

	public void setItemDeTI(ItemDeTI itemDeTI) {
		ItemDeTI = itemDeTI;
	}

}
