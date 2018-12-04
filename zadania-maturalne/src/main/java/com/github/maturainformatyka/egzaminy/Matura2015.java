package com.github.maturainformatyka.egzaminy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Matura2015 {

	public static void main(String[] args) throws Exception {
		// pliki otwierane z automatycznym zamykaniem nawet w przypadku błędu
		// BufferedReader pozwala czytać plik linia po linii
		try (BufferedReader br = new BufferedReader(new FileReader("egzaminy/2015/Dane_PR2/?.txt"))) {
			try (FileWriter fw = new FileWriter("egzaminy/2015/Wyniki_PR2/?.txt", false)) { // false - zastępujemy poprzedni plik
				zadanie(br, fw);
			}
		}
	}

	private static void zadanie(BufferedReader inbr, FileWriter out) throws Exception {
		String linia = inbr.readLine();
		int nrLinii = 1; // linie numerujemy od 1
		while (linia != null) {
			// tu operacje na każdej linii
			linia = inbr.readLine();
			nrLinii++;
		}
		out.write("wynik ?? \n");
	}
}


