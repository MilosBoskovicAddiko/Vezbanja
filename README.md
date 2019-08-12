# Vezbanja

Ovo je README.md fajl za potrebe vezbanja.

## Autor

Miloš Bošković 

## Sadrzaj

* Lekcija 3 - Yakov Fain - OOP pomocu Java jezika
* Lekcija 4 - Yakov Fain - Metodi klase i konstruktori
* Lekcija 6 - Yakov Fain - Paketi, interfejsi i enkapsulacija
* Lekcija 7 - Yakov Fain - Programiranje koriscenjem apstraktnih klasa i interfejsa
* Lekcija 10 - Yakov Fain - Rukovanje greskama
* Lekcija 11 - Yakov Fain - Uvod u kolekcije
* Lekcija 12 - Yakov Fain - Uvod u genericke tipove
* Lekcija 13 - Yakov Fain - Lambda izrazi u funkcionalno programiranje
* Lekcija 14 - Yakov Fain - Ulazno - izlazni tokovi
* Lekcija 15 - Yakov Fain - Java serijalizacija
* Lekcija 16 - Yakov Fain - Osnove mreznog programiranja
* Lekcija 17 - Yakov Fain - Konkurentnost i visenitno izvrsavanje
* Jumper
* Jumper version 2
* Jumper version 3
* Car Racing
* Forced update
* Kamen - Papir - Makaze
* Broj ponavljanja karaktera
* Dva niza karaktera
* Ispisivanje unosa otpozadi
* Recenice koje sadrze unetu rec
* Validacija broja telefona
* Validacija emaila

## Opis zahteva

#### Lekcija 3 
Osnovni principi nasledjivanja

---

#### Lekcija 4 
Metodi klase i konstruktori. Koriscenje kljucne reci *this*, *super*, dometi promenljivih, kljucna rec static

---

#### Lekcija 6
Paketi, interfejsi i enkapsulacija. Kljucna reci *final*, kastovanje. Primena nasledjivanja i interfejsa. 
 
---

#### Lekcija 7
Interfejsi i abstraktne klase. Njihova primena i uporedjivanje.

---

#### Lekcija 10
* Kreiranje sopstvenih izuzetaka
* Kljucna rec *finally*
* Hendling pomocu kljucne reci *throw*
* Try blok sa resursima

---

#### Lekcija 11
* ArrayList i instance of operator
* Primer koriscenja BitSet-a
* Enumerator i Iterator
* LinkedList i ListIterator
* Ucitavanje properties fajla
* Uradi sam sekcija

---

#### Lekcija 12
* Modifikovani primer genericke kolekcije
* Primer parametrizovane klase
* Test Generic Collection
* TryIt

---

#### Lekcija 13
* Functional & BiFunctional interfejsi
* Pristupanje kolekcijama pomocu forEach()
* Prosledjivanje funkcije metodu
* TestPayIncrease pomocu lambda izraza
* TryIt

---

#### Lekcija 14
* Baferovani tokovi
* Data Input Stream
* Povezivanje GUI i IO tokova
* TestBufferedReaderNIO
* TestFilesPath
* Tokovi bajtova
* Tokovi karaktera
* TryIt - Citanje ZIP fajlova

---

#### Lekcija 15
* Externalizable interfejs
* Object Input Stream
* Object Output Stream
* Serijalizacija u polje bajtova
* TryIt

---

#### Lekcija 16
* Citanje sa googla
* File Download
* Program za berzanske kvote
* TryIt - Socket

---

#### Lekcija 17
* Bez nasledjivana
* Klasa Thread
* Povezivanje tredova
* Runnable interfejs
* Wait & Notify
* Uklanjane tredova
* Upravljanje tredovima pomocu Executor radnog okvira
* Zaustavljanje izvrsavanja niti

---

#### Jumper
Zadatak je implementirati u Javi igru skocko u terminalu.

Sest pokusaja: Pogodak iz prvog pokusaja donosi 20 poena, drugog i treceg 15 poena, cetvrtog i petog pokusaja 10 i iz sestog pokusaja 5 poena. 

Stampa broj crvenih krugova, i broj zutih krugova.

---

#### Jumper version 2
Zadatak je implementirati u Javi igru skocko u terminalu.

Sest pokusaja: Pogodak iz prvog pokusaja donosi 20 poena, drugog i treceg 15 poena, cetvrtog i petog pokusaja 10 i iz sestog pokusaja 5 poena. 

Stampa broj crvenih krugova, i broj zutih krugova.

Sve u jednoj klasi!

---

#### Jumper version 3
Zadatak je implementirati u Javi igru skocko u terminalu.

Sest pokusaja: Pogodak iz prvog pokusaja donosi 20 poena, drugog i treceg 15 poena, cetvrtog i petog pokusaja 10 i iz sestog pokusaja 5 poena. 

Stampa broj crvenih krugova, i broj zutih krugova.

Sve u jednoj klasi!

STAMPA OBOJENE KRUZICE!

---

#### Car Racing
Potrebno je implementirati logiku igrice Car Racing. 

Kako igrica treba da izgleda i potrebne informacije mogu se naci na linkovima ispod;

[Prikaz igrice](http://staff.www.ltu.se/~qwazi/d0019n/Mars2019/JavaRacingGame.mp4?fbclid=IwAR3mmsAKkHXAZccLNNUvMlVZFE2WD_ZBjadtOhllLCxevgNDTYmRc3cFums)

[Staza](http://staff.www.ltu.se/~qwazi/d0019n/Mars2019/track.txt?fbclid=IwAR3mmsAKkHXAZccLNNUvMlVZFE2WD_ZBjadtOhllLCxevgNDTYmRc3cFums)

---

#### Forced update
Potrebno je napisati metodu za forsirani update mobilnih aplikacija, metoda ima tri parametra:
	verzija operativnog sistema ( iOS ili Android),
	trenutna verzija aplikacije (salje mobilna aplikacija),
	min verzija od koje je potrebno forsirati update.
	
Ukoliko je trenutna verzija apliakcije veca ili jednaka min verziji vratiti false u suprotnom vratiti true.

Android trenutna/min verzija aplikacije je tipa:  171127233 ili 190718112 sto znaci 2019 godine 07 mesec 18 dan 11,20 min

iOS trenutna/min verzija aplikacije je tipa: 1.1.10 ili 1.10.10 ili 1.1.1

---

#### Kamen-Papir-Makaze

Implementirati igru "Kamen, papir, makaze". Interakcija izmedju igraca i aplikacije odvija se preko standardnog ulaza i izlaza.

Igrac i "racunar" biraju jednu od tri mogucnosti: kamen, papir, makaze.

Ukoliko su izabrali isto dobijaju 1 poen. U protivnom, pobednik dobija 2 peoena. Pobednik se racuna na sledeci nacin:

- makaze, papir: makaze
- kamen, makaze: kamen
- papir, kamen: papir

Igra se zavrsava kada neko od ucesnika ima 21 poen. Ukoliko se dogodi da u isto vreme oba ucesnika imaju 21 poen , igra se nastavlja dok neko od takmicara ne dobije vise poena od protivnika.

Igra moze da se prekine u svakom momentu ako igrac umesto jedne od tri mogucnosti za izbor unese rec "kraj".

Koorisnicki interfejs i testni scenario su ti dati da ih sam osmislis.

---

#### Broj ponavljanja karaktera
Unose se razni karakteri sa standardnog ulaza. Program ispisuje koliko se puta pojavilo neko slovo ili cifra, sortirano prvo po alfanumerickom kriterijumu za slova i cifre rastuce, a zatim i po broju pojavljivanja opadajuce.

---

#### Dva niza karaktera
Zadatak se sastoji iz dva dela. U prvom delu pod nazivom "DvaNizaKaraktera", sa standardnog ulaza se unose dva niza karaktera. Potrevno je napraviti novi niz koji se sastoji od slova iz prvog niza i cifara iz drugog niza, tim redom. Prvo slova iz prvog niza, pa onda sve cifre iz drugog niza. Drugi deo zadatka, pod nazivom "ReciBrojevi" se sastoji u tome da je iz prvog niza potrebno prikazati sve reci, a iz drugog niza brojeve.

---

#### Ispisivanje unosa otpozadi
Unosi se tekst sa standardnog ulaza. Prikazati tekst u obrnutom poretku.

---

#### Recenice koje sadrze unetu rec
Treba kreirati listu stringova koja sadrzi neke recenice. Potrebno je kreirati program koji uzima rec od korisnika i prikazuje recenice u kojima se rec pojavljuje (koriscenjem regularnih izraza)

---

#### Validacija broja telefona
Potrebno je izvrsiti validaciju broja telefona po sledecem sablonu: ###/###-####, tako da na primer, sledeci string bude validan: 123/456-7890

---

#### Validacija emaila
Zadatak je samostalno kreirati sablon za validaciju emaila. Kreirani sablon ima sledeci oblik:  
`Pattern patern = Pattern.compile("^([a-z\\d])([a-zA-Z\\d\\._-])*@([a-z\\d-]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$");`

Prevedeno, svaki mail koji pocinje sa malim slovom ili cifrom, a u nastavku se mogu javiti tacka, crtica(donja), velika/mala slova i cifre (jedno ili vise ponavljanja), nakon cega sledi znak @, nakon njega domen(gmail/yahoo/hotmail/live), koji se moze sastojati iz malih slova, cifara ili crtice (jedno ili vise ponavljanja), nakon toga sledi tacka, i na kraju ekstenzija tipa (co, com, org itd.) iskljucivo od malih slova, u duzini od minimum dva, a najvise 8 karaktera. Poslednji deo je opcionalan jer postoje zemlje sa dodatnom ekstenzijom, otuda znak ? na kraju izraza.

## Linkovi

[Broj ponavljanja karaktera](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/BrojPonavljanjaKaraktera)

[Dva niza karaktera](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/DvaNizaKaraktera)

[Reci i brojevi](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/DvaNizaKaraktera)

[Ispisivanje unosa otpozadi](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/IspisivanjeUnosaOtpozadi)

[Recenice koje sadrze unetu rec](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/JavaRegexPatterni/ReceniceKojeSadrzeUnetuRec)

[Validacija broja telefona](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/JavaRegexPatterni/ValidacijaBrojaTelefona)

[Validacija emaila](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/JavaRegexPatterni/ValidacijaEmaila)

[Forced Update](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/ForcedUpdate)

[Kamen-Papir-Makaze](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Papir_Kamen_Makaze)

[Car Racing](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/CarRacing)

[Jumper](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/SkockoSlagalica)

[Jumper version 2](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/SkockoSlagalicaVerzija2) 

[Jumper version 3](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/SkockoSlagalicaVerzija3) 

[Lekcija 3 - Jakov Fain](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_3)

[Lekcija 4 - Yakov Fain](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_4)

[Lekcija 6 - Yakov Fain](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_6)

[Lekcija 7 - Abstraktna klasa](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_7/AbstractClass)

[Lekcija 7 - Interfejs](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_7/Interface)

[Lekcija 10 - Kreiranje sopstvenih izuzetaka](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_10/CreationOwnException)

[Lekcija 10 - Kljucna rec *finally*](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_10/FinallyClasuse)

[Lekcija 10 - Hendling pomocu kljucne reci *throw*](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_10/HandlingWithThrow)

[Lekcija 10- Try blok sa resursima](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_10/TryWithResources)

[Lekcija 11 - ArrayList i instance of operator](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/ArrayListAndInstanceOfOperator)

[Lekcija 11 - Primer koriscenja BitSet-a](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/BitSetExample)

[Lekcija 11 - Enumerator i Iterator](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/EnumeratorAndIterator)

[Lekcija 11 - LinkedList i ListIterator](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/LinkedListAndListIterator)

[Lekcija 11 - Ucitavanje properties fajla](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/MailmanPropertiesLoadingIntoProperties)

[Lekcija 11 - Uradi sam sekcija](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/TryIt)

[Lekcija 12 - Modifikovani primer genericke kolekcije](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_12/ModifiedTestGenericCollection)

[Lekcija 12 - Primer parametrizovane klase](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_12/ParameterizedClassExample)

[Lekcija 12 - Test Generic Collection](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_12/TestGenericCollection)

[Lekcija 12 - TryIt](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_12/TryIt)

[Lekcija 13 - Functional&BiFunctionalInterfejsi](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_13/FunctionIBiFunctionInterfejsi)

[Lekcija 13 - Pristupanje kolekcijama pomocu forEach()](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_13/PristupanjeKolekcijamaPomocuForEachMetoda)

[Lekcija 13 - Prosledjivanje funkcije metodu](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_13/ProsledjivanjeFunkcijeMetodu)

[Lekcija 13 - TestPayIncrease pomocu lambda izraza](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_13/TestPayIncreaseLambda)

[Lekcija 13 - TryIt](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_13/TryIt)

[Lekcija 14 - Baferovani tokovi](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_14/BaferovaniTokovi)

[Lekcija 14 - Data Input Stream](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_14/DataInputStream)

[Lekcija 14 - Povezivanje GUI i IO tokova](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_14/Povezivanje_GUI_i_IO_Tokova) 

[Lekcija 14 - TestBufferedReaderNIO](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_14/TestBufferedReaderNIO)

[Lekcija 14 - TestFilesPath](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_14/TestFilesPath)

[Lekcija 14 - Tokovi bajtova](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_14/TokoviBajtova)

[Lekcija 14 - Tokovi karaktera](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_14/TokoviKaraktera)

[Lekcija 14 - TryIt - Citanje ZIP fajlova](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_14/TryIt_ReadingZipFiles)

[Lekcija 15 - Externalizable interfejs](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_15/ExtrenalizableInterface)

[Lekcija 15 - Object Input Stream](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_15/ObjectInputStream)

[Lekcija 15 - Object Output Stream](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_15/ObjectOutputStream)

[Lekcija 15 - Serijalizacija u polje bajtova](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_15/SerijalizacijaUPoljeBajtova)

[Lekcija 15 - TryIt](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_15/TryIt)

[Lekcija 16 - Citanje Sa Google-a](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_16/CitanjeSaGoogle)

[Lekcija 16 - File Download](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_16/FileDownload)

[Lekcija 16 - Program za berzanske kvote](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_16/ProgramZaBerzanskeKvote)

[Lekcija 16 - TryIt - Socket](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_16/TryIt_Socket)

[Lekcija 17 - Bez nasledjivana](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_17/BezNasledjivanje)

[Lekcija 17 - Klasa Thread](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_17/KlasaThred)

[Lekcija 17 - Povezivanje tredova](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_17/PovezivanjeThreadova)

[Lekcija 17 - Runnable interfejs](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_17/RunnableInterface)

[Lekcija 17 - Wait & Notify](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_17/TestLambdaWaitNotify)

[Lekcija 17 - Uklanjane tredova](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_17/UklanjanjeNiti)

[Lekcija 17 - Upravljanje tredovima pomocu Executor radnog okvira](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_17/UpravljanjeNitimaPomocuExecutorRadnogOkvira)

[Lekcija 17 - Zaustavljanje izvrsavanja niti](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_17/ZaustavljanjeIzvrsavanjaNiti)


