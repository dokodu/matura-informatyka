# Matura Informatyka 2019

## Informacje CKE

Wg [komunikatu CKE](https://cke.gov.pl/images/_KOMUNIKATY/20180820%20EM%20Komunikat%20o%20egzaminie%20z%20informatyki.pdf) na egzaminie maturalnym z informatyki w 2019 roku będzie można użytkować co następuje:

#### "System operacyjny"

>- [Windows z systemem plików NTFS](https://developer.microsoft.com/en-us/microsoft-edge/tools/vms/)
>- [Linux ze środowiskiem graficznym](https://fossbytes.com/best-linux-distros-for-programming-developers/)

#### "Pakiet programów użytkowych"

>- [Microsoft Office](https://products.office.com/pl-pl/academic/compare-office-365-education-plans) 2003 lub nowszy (w tym: Word, Excel, Access)
>- [OpenOffice/Apache OpenOffice](https://www.openoffice.org/pl/) w wersji 4.1 lub nowszej albo [LibreOffice](https://pl.libreoffice.org/) w wersji 5.3 lub nowszej (w tym: Write, Calc, Base) i [MySQL](https://www.mysql.com/products/community/) 5.7 lub nowszy


#### "Język programowania (środowisko programistyczne)"

>1. Pascal
>   – [Free Pascal](https://www.freepascal.org/) (FPC 3.0 lub nowszy)
>2. C/C++
>  – [Microsoft Visual Studio C++](https://visualstudio.microsoft.com/)
>  – [Orwell Dev-C++](http://orwelldevcpp.blogspot.com/) 5.11 lub nowszy
>  – [Code Blocks](http://www.codeblocks.org/) 16.01 lub nowszy
>3. Java
>  – [Java SE 8](https://adoptopenjdk.net/releases.html) (Java Development Kit + Java Runtime Environment) lub nowszy + edytor [Eclipse](https://www.eclipse.org/downloads/packages/release/2018-09/r/eclipse-ide-java-developers) 4.4 lub nowszy
>4. Python
>  – [Python 3](https://www.python.org) + edytor [IDLE](https://pl.wikipedia.org/wiki/IDLE) lub [PyCharm](https://www.jetbrains.com/pycharm/)


## Wybór pakietu programów użytkowych

Na podstawowym poziomie nauczania MS Word i Excel nie odbiegają funkcjonalnie od Write, Calc w Open/Libre Office (ten sam produkt rozdzielony w przeszłości na dwa konkurencyjne produkty). W rzeczywistości zawodowej ciągle stawia się na pakiet MS Office, głównie ze względu na jego większą popularność i potrzebę zgodności formatów dokumentów przesyłanych między firmami (ustandaryzowanie nie wiele zmieniło, praktykuje się eksport do PDF w celu udostępniania dokumentu).

Podczas gdy MS Word i Excel cieszą się niezmienną popularnością, zainteresowanie oprogramowaniem MS Access od lat sukcesywnie zanika - polecam zapoznanie się z [tą analizą trendów](https://trends.google.pl/trends/explore?date=all&q=%2Fm%2F052tr,%2Fm%2F052yv,%2Fm%2F0587z)

Zdecydowanie lepiej dla rozwoju kompetencji zawodowych zamiast na MS Access poświecić czas na naukę standardu SQL-a, który jest wspierany przez MySQL i całą gamę relacyjnych baz danych (np. PostgreSQL, Oracle, MS SQL,...) ale nie przez [MS Access](https://www.e-education.psu.edu/spatialdb/node/1954).
Przygoda z MS Access z dużym prawdopodobieństwem skończy się już na maturze, praktycznie nikt tego oprogramowania nie używa.

Niestety MySQL, jak i inne bazy relacyjne, wymaga zaimportowania danych do bazy danych by potem poddać je analizie za pomocą języka zapytań [SQL](http://www.samouczekprogramisty.pl/kurs-sql/), co bez dodatkowych narzędzi graficznych wymaga użycia eksportu danych do [`CSV`](https://pl.wikipedia.org/wiki/CSV_(format_pliku)), [`stworzenia` odpowiednich tabel](https://dev.mysql.com/doc/refman/8.0/en/create-table.html) i importu pliku CSV poleceniem [`mysqlimport`](https://dev.mysql.com/doc/refman/8.0/en/mysqlimport.html). Tutaj z pomocą przychodzi nam program Base, który jest w pełni funkcjonalnym interfejsem dla bazy danych obsługującym m.in. MySQL/MariaDB, MS Access i PostgreSQL.


## Wybór języka programowania i środowiska programistycznego

W sieci można znaleźć wiele zestawień popularności języków programowania, np.:
- ["The best programming languages to learn in 2018"](https://medium.freecodecamp.org/best-programming-languages-to-learn-in-2018-ultimate-guide-bfc93e615b35)
- ["Which programming languages should I learn in 2018?"](https://usersnap.com/blog/programming-languages-2018/)
- ["The 10 most popular programming languages, according to the 'Facebook for programmers'"](https://www.businessinsider.com/the-10-most-popular-programming-languages-according-to-github-2018-10)

Niezmiennie w tym zestawieniach pojawia się JavaScript jako główny język programowania interfejsu użytkownika (front-end: www, aplikacje hybrydowe na telefony komórkowe), Java i Python królują po stronie serwerowej (backend).

Czwórka wskazana przez CKE prezentuje się [następująco w Google Trends](https://trends.google.com/trends/explore?date=all&q=%2Fm%2F07sbkfb,%2Fm%2F05z1_,%2Fm%2F0jgqg,%2Fm%2F05y49). 

- **Pascal** 
  - `-` popularność tego języka zakończyła się jeszcze w ubiegłym wieku, jest przestarzały, niewygodny i pozbawiony perspektyw
- **C++**
  - `+` biorąc pod uwagę dostępność materiałów edukacyjnych i narzędzi do automatycznego sprawdzania zadań `C++` wydaje się być dobrym wyborem
  - `+` nauka tego języka nie "pójdzie w las", istnieje cała rodzina języków o podobnej składni, najpopularniejsze z nich to JavaScript i Java
  - `-` niestety jest też językiem, w którym początkujący programiści więcej czasu spędzą nad rozwiązywaniem jego problemów (wskaźniki, formatowanie wyjścia itp) niż na pisaniu właściwego kodu algorytmów
  - `-` środowiska, których można użyć w tym przypadku na maturze to niestety bardzo słabe `Orwell Dev-C++` i `Code Blocks` oraz zdecydowanie zbyt ciężkie `Microsoft Visual Studio C++`
  - `?` jeżeli w okazałoby się, że w zakres definicji `Microsoft Visual Studio C++` wchodzi [`Visual Studio Code`](https://code.visualstudio.com/docs/languages/cpp) to zdecydowanie warto się tym zainteresować
  - kolejną dobrą alternatywą byłoby użycie darmowego dla uczniów [`CLion`](https://www.jetbrains.com/clion/), niestety nie ma go na liście CKE
- **Java**
  - `-` słaba dostępność materiałów edukacyjnych i narzędzi do automatycznego sprawdzania zadań
  - `+` to jeden z najpopularniejszych języków, warto się go uczyć, jest duże prawdopodobieństwo wykorzystania go podczas pracy jako programista
  - `+` stosunkowo łatwo jest się przesiąść na Javę z C++, a dzięki Javie można skupić się na rozwiązywaniu właściwych problemów a nie problemów języka
  - `-` jedyne środowiska wskazane w tym przypadku to Eclipse, do niedawna uznawane za jedno z najlepszych środowisk, ostatnio wypierane przez zdecydowanie lepsze darmowe [IntelliJ IDEA](https://www.jetbrains.com/idea/), którego nie można niestety użyć na maturze
- **Python**
  - `-` słaba dostępność materiałów edukacyjnych i narzędzi do automatycznego sprawdzania zadań
  - `+` to język, którego popularność ostatnio szybko rośnie, szczególnie w zagranicznych ośrodkach naukowych (najpopularniejszy język w dziedzinie Machine Learning)
  - `+` wskazany `PyCharm` to popularne i wygodne środowisko programistyczne
  

