package com.github.maturainformatyka.egzaminy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeMap;

public class Matura2018 {

	public static void main(String[] args) throws Exception {
		// pliki otwierane z automatycznym zamykaniem nawet w przypadku błędu
		// BufferedReader pozwala czytać plik linia po linii
		try (BufferedReader br = new BufferedReader(new FileReader("egzaminy/2018/Dane_PR2/sygnaly.txt"))) {
			try (FileWriter fw = new FileWriter("egzaminy/2018/Wyniki_PR2/wyniki4.txt", false)) { // false - zastępujemy poprzedni plik
				zadanie(br, fw);
			}
		}
	}

	private static void zadanie(BufferedReader inbr, FileWriter out) throws Exception {
		String linia = inbr.readLine();
		int nrLinii = 1;
		String przeslanie = "";
		int maxLiczbaRoznZnakow = 0;
		String liniaZMaxLiczRoznZnakow = "";
		out.write("Zadanie 4.3. \n");
		while (linia != null) {
			// dla 4.1
			if (nrLinii % 40 == 0) {
				przeslanie = przeslanie + linia.charAt(9); // 10-ty znak
			}
			// dla 4.2 i 4.3 - na dwa sposoby
			int[] infoOLinii = sprawdzLinieTablica(linia);
			//int[] infoOLinii = sprawdzLinieMapa(linia);
			int liczbaRoznZnakow = infoOLinii[0];
			int maxOdleglosc = infoOLinii[1];
			// dla 4.2
			if (liczbaRoznZnakow > maxLiczbaRoznZnakow) {
				maxLiczbaRoznZnakow = liczbaRoznZnakow;
				liniaZMaxLiczRoznZnakow = linia;
			}
			// dla 4.3
			if (maxOdleglosc <= 10) {
				out.write(linia + "\n");
			}
			linia = inbr.readLine();
			nrLinii++;
		}
		out.write("Zadanie 4.2. Liczba znakow " + maxLiczbaRoznZnakow + ", slowo: " + liniaZMaxLiczRoznZnakow + "\n");
		out.write("Zadanie 4.1. " + przeslanie + "\n");
	}

	private static int[] sprawdzLinieTablica(String line) {
		// tablica poindeksowana ASCII kodami znak, przesuniętymi tak, że znak 'A' to 0
		int[] tab = new int['Z' - 'A' + 1];
		// wypelniamy zerami
		for (int i = 0; i < tab.length; i++) {
			tab[i] = 0;
		}
		// jednocześnie zliczamy różne znaki i szukamy najbardziej oddalonych od siebie
		int minIdx = tab.length - 1;
		int maxIdx = 0;
		int liczRoznych = 0;
		for (int i = 0; i < line.length(); i++) {
			int idxZnaku = line.charAt(i) - 'A';
			if (tab[idxZnaku] == 0) {
				// pierwsze wystapienie
				liczRoznych++;
			}
			tab[idxZnaku]++;
			if (idxZnaku > maxIdx) {
				maxIdx = idxZnaku;
			}
			if (idxZnaku < minIdx) {
				minIdx = idxZnaku;
			}
		}
		return new int[]{liczRoznych, maxIdx - minIdx};
	}

	private static int[] sprawdzLinieMapa(String line) {
		// mapa poindeksowana znakami
		TreeMap<Character, Integer> mapa = new TreeMap<>();
		for (int i = 0; i < line.length(); i++) {
			Character c = line.charAt(i);
			if (mapa.containsKey(c)) {
				mapa.put(c, mapa.get(c) + 1);
			} else {
				mapa.put(c, 1);
			}
		}
		return new int[]{mapa.size(), mapa.lastEntry().getKey() - mapa.firstEntry().getKey()};
	}
}
