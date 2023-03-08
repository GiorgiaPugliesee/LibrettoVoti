package it.polito.tdp.libretto.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> listaVoti;
	
	public Libretto() {
		listaVoti = new LinkedList<Voto>();
	}
	
	/**
	 * Aggiungi un nuovo voto al libretto
	 * (per ora non fa nessun controllo)
	 * @param v  il Voto da aggiungere
	 * @return true
	 */
	
	public boolean add(Voto v) {
		return listaVoti.add(v);
	}
	
	public void stampa() {
		for (Voto v : listaVoti) {
			System.out.println(v);
		}
	}

	public void stampaVotoUguale(int valore) {
		for (Voto v : listaVoti) {
			if (v.getVotoOttenuto() == valore) {
				System.out.println(v);
			}
		}
	}
	
	public Voto cercaVotoPerCorso(String corso) {
		for (Voto v : listaVoti) {
			if (v.getNomeCorso().equals(corso)) {
			//if (v.getNomeCorso().compareTo(corso)==0) {
				return v;
			}
		}
		return null;
		
		// throw new RuntimeException("Voto non trovato");  preferibile per casi non prevedibili/comuni
	}
	
	public boolean esisteVoto(Voto vNuovo) {
		for (Voto v : listaVoti) {
			//if (v.equalsCorsoPunti(vNuovo))  {}  conviene creare metodi equals specifici se servono a più metodi
			if (v.getNomeCorso().equals(vNuovo.getNomeCorso()) && v.getVotoOttenuto() == vNuovo.getVotoOttenuto()) {
				return true;
			}
		}
		return false;
	}
	
}
