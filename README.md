# Vezbanja

Ovo je README.md fajl za potrebe vezbanja.

## Autor

Miloš Bošković 

## Sadrzaj

* Lekcija 3 - Yakov Fain
* Lekcija 4 - Yakov Fain
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

1. [Broj ponavljanja karaktera](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/BrojPonavljanjaKaraktera)
2. [Dva niza karaktera](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/DvaNizaKaraktera)
3. [Reci i brojevi](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/DvaNizaKaraktera)
4. [Ispisivanje unosa otpozadi](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/IspisivanjeUnosaOtpozadi)
5. [Recenice koje sadrze unetu rec](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/JavaRegexPatterni/ReceniceKojeSadrzeUnetuRec)
6. [Validacija broja telefona](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/JavaRegexPatterni/ValidacijaBrojaTelefona)
7. [Validacija emaila](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/JavaRegexPatterni/ValidacijaEmaila)
8. [Lekcija 3 - Jakov Fain](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_3)
9. [Lekcija 4 - Yakov Fain](https://github.com/MilosBoskovicAddiko/Vezbanja/tree/master/JavaVezbanje/src/Lekcija_4)
