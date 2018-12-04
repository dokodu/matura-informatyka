# Zadanie 6. Słowa

W pliku [slowa.txt](slowa.txt) zapisano 1000 wierszy. Każdy z nich zawiera dwa niepuste słowa oddzielone spacją. Słowa składają się wyłącznie z wielkich liter alfabetu angielskiego.

>Przykład:
>```
>AAIWQX EZSLCL
>ACTOACTAOER OACTA
>ACUO KORNL
>```
Napisz program (programy), który(e) poda(dzą) odpowiedzi do poniższych zadań.

## Zadanie 6.1. (0–2)

Podaj, ile słów w pliku [slowa.txt](slowa.txt) kończy się na literą `A`.

## Zadanie 6.2. (0–4)

Podaj liczbę wierszy z pliku slowa.txt zawierających pary słów, w których pierwsze słowo zawiera się w drugim słowie.

>Przykład:
>Słowo `ADC` zawiera się w słowie `ASWADCF`, jak też w słowie `ADC`. Słowo `ADC` nie zawiera się w słowie `ASWADFC`.

## Zadanie 6.3. (0–4)

Anagram to słowo powstałe z przestawienia liter danego słowa, wykorzystujące wszystkie jego litery.

> Przykład:
> Anagramami słowa `SLOMA` są na przykład: `MASLO`, `SLMAO`, `SOLMA`, ...

Podaj liczbę wierszy w pliku [slowa.txt](slowa.txt), w których występują pary słów takich, że pierwsze słowo jest anagramem drugiego. Wypisz te pary.

---------------
# Rozwiązanie

[SlowaAnagramy.java](../../src/main/java/com/github/maturainformatyka/inne/SlowaAnagramy.java)