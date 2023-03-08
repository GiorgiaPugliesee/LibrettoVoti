package it.polito.tdp.libretto.model;

import java.time.*;

public class Voto {
	
	private String nomeCorso;
	private int votoOttenuto; //da 18 a 31
	private LocalDate dataEsame;
	
	public Voto(String nomeCorso, int votoOttenuto, LocalDate dataEsame) {
		super();
		this.nomeCorso = nomeCorso;
		this.votoOttenuto = votoOttenuto;
		this.dataEsame = dataEsame;
	}
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	
	public int getVotoOttenuto() {
		return votoOttenuto;
	}
	
	public void setVotoOttenuto(int votoOttenuto) {
		this.votoOttenuto = votoOttenuto;
	}
	
	public LocalDate getDataEsame() {
		return dataEsame;
	}
	
	public void setDataEsame(LocalDate dataEsame) {
		this.dataEsame = dataEsame;
	}

	@Override
	public String toString() {
		return nomeCorso + " (" + votoOttenuto + " pt) il " + dataEsame;
	}
	
}
