package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
			
		Libretto libretto = new Libretto();
		libretto.add(new Voto("Analisi 1", 29, LocalDate.of(2021, 2, 15)));
		libretto.add(new Voto("Fisica 2", 21, LocalDate.of(2022, 6, 10)));
		libretto.add(new Voto("Chimica", 25, LocalDate.of(2021, 2, 1)));

		System.out.println("\nStampo le informazioni di tutti i corsi inseriti: ");
		libretto.stampa();
		
		System.out.println("\nStampo le informazioni di tutti i corsi con voto uguale a 25: ");
		libretto.stampaVotoUguale(25);
		
		System.out.println("\nCerco le informazioni del corso di Analisi 1: ");
		Voto v = libretto.cercaVotoPerCorso("Analisi 1");
		System.out.println(v);
		
		System.out.println("\nCerco le informazioni del corso di Analisi 2 (non esiste): ");
		v = libretto.cercaVotoPerCorso("Analisi 2");
		System.out.println(v);
		
		System.out.println("\nVerifico se un Voto esiste già nel libretto: ");
		Voto v1 = new Voto("Analisi 1", 29, LocalDate.of(2025, 2, 15));
		Voto v2 = new Voto("Analisi 1", 28, LocalDate.of(2025, 2, 15));
		
		System.out.println(v1 + " è duplicato + " + libretto.esisteVoto(v1));
		System.out.println(v2 + " è duplicato + " + libretto.esisteVoto(v2));
	}

}
