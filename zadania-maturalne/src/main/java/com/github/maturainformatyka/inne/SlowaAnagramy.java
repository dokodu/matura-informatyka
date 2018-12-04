package com.github.maturainformatyka.inne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SlowaAnagramy {

	public static void main(String[] args) throws IOException {
		// otwarcie pliku z automatycznym jego zamknięciem po zakończeniu programu
		try (BufferedReader br = new BufferedReader(new FileReader("inne/SlowaAnagramy/slowa.txt"))) {
			// Odczyt pliku linia po linii
			String line;
			int liczbaSlowA = 0;
			int liczbaWierszyZawierajacychSie = 0;
			int liczbaWierszyAnagramow = 0;

			System.out.println("Anagramy: ");
			while ((line = br.readLine()) != null) {
				// podział linii na słowa
				String[] slowa = line.split(" ");
				liczbaSlowA += ileKonczySieA(slowa);
				liczbaWierszyZawierajacychSie += czySieZawiera(slowa[0], slowa[1]);
				if (czySaAnagramami(slowa[0], slowa[1])) {
					System.out.println(line);
					liczbaWierszyAnagramow++;
				}
			}
			System.out.println("=============================================================");
			System.out.println("Liczba słów kończących się na A: " + liczbaSlowA);
			System.out.println("Liczba wierszy, w których pierwsze słowo zawiera drugie: " + liczbaWierszyZawierajacychSie);
			System.out.println("Liczba wierszy z anagramami: " + liczbaWierszyAnagramow);
		}

	}

	private static int ileKonczySieA(String[] slowa) {
		// algorytm zadziała dla dowolnej liczby słów w linii
		int ile = 0;
		for (String slowo : slowa) {
			if (slowa[0].endsWith("A")) {
				ile++;
			}
		}
		return ile;
	}

	private static int czySieZawiera(String slowo1, String slowo2) {
		// 1 - zawiera się, 0 - nie zawiera się
		return slowo2.indexOf(slowo1) > 0 ? 1 : 0;
	}

	private static boolean czySaAnagramami(String slowo1, String slowo2) {
		// true - są anagramami
		// zamieniamy sława na tablice
		char[] slowo1Array = slowo1.toCharArray();
		char[] slowo2Array = slowo2.toCharArray();
		// sortujemy tablice
		Arrays.sort(slowo1Array);
		Arrays.sort(slowo2Array);
		// są anagramami gdy posortowane tablice słów są takie same
		return Arrays.equals(slowo1Array, slowo2Array);
	}

}
