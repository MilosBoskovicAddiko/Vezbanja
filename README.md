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
* Forced update
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

#### Forced update
Potrebno je napisati metodu za forsirani update mobilnih aplikacija, metoda ima tri parametra:
	verzija operativnog sistema ( iOS ili Android),
	trenutna verzija aplikacije (salje mobilna aplikacija),
	min verzija od koje je potrebno forsirati update.
	
Ukoliko je trenutna verzija apliakcije veca ili jednaka min verziji vratiti false u suprotnom vratiti true.

Android trenutna/min verzija aplikacije je tipa:  171127233 ili 190718112 sto znaci 2019 godine 07 mesec 18 dan 11,20 min

iOS trenutna/min verzija aplikacije je tipa: 1.1.10 ili 1.10.10 ili 1.1.1

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

[Lekcija 3 - Jakov Fain](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_3)

[Lekcija 4 - Yakov Fain](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_4)

[Lekcija 6 - Yakov Fain](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_6)

[Lekcija 7 - Yakov Fain - Abstraktna klasa](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_7/AbstractClass)

[Lekcija 7 - Yakov Fain - Interfejs](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_7/Interface)

[Lekcija 10 - Yakov Fain - Kreiranje sopstvenih izuzetaka](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_10/CreationOwnException)

[Lekcija 10 - Yakov Fain - Kljucna rec *finally*](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_10/FinallyClasuse)

[Lekcija 10 - Yakov Fain - Hendling pomocu kljucne reci *throw*](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_10/HandlingWithThrow)

[Lekcija 10 - Yakov Fain - Try blok sa resursima](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_10/TryWithResources)

[Lekcija 11 - Yakov Fain - ArrayList i instance of operator](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/ArrayListAndInstanceOfOperator)

[Lekcija 11 - Yakov Fain - Primer koriscenja BitSet-a](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/BitSetExample)

[Lekcija 11 - Yakov Fain - Enumerator i Iterator](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/EnumeratorAndIterator)

[Lekcija 11 - Yakov Fain - LinkedList i ListIterator](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/LinkedListAndListIterator)

[Lekcija 11 - Yakov Fain - Ucitavanje properties fajla](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/MailmanPropertiesLoadingIntoProperties)

[Lekcija 11 - Yakov Fain - Uradi sam sekcija](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_11/TryIt)

[Lekcija 12 - Yakov Fain - Modifikovani primer genericke kolekcije](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_12/ModifiedTestGenericCollection)

[Lekcija 12 - Yakov Fain - Primer parametrizovane klase](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_12/ParameterizedClassExample)

[Lekcija 12 - Yakov Fain - Test Generic Collection](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_12/TestGenericCollection)

[Lekcija 12 - Yakov Fain - TryIt](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_12/TryIt)

[Lekcija 13 - Yakov Fain - Functional&BiFunctionalInterfejsi](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_13/FunctionIBiFunctionInterfejsi)

[Lekcija 13 - Yakov Fain - Pristupanje kolekcijama pomocu forEach()](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_13/PristupanjeKolekcijamaPomocuForEachMetoda)

[Lekcija 13 - Yakov Fain - Prosledjivanje funkcije metodu](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_13/ProsledjivanjeFunkcijeMetodu)

[Lekcija 13 - Yakov Fain  - TestPayIncrease pomocu lambda izraza](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_13/TestPayIncreaseLambda)

[Lekcija 13 - Yakov Fain  - TryIt](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_13/TryIt)
