# P7 — Podatkovni vidik IS: od podatkovnega modeliranja do baz podatkov

**Predmet:** Osnove informacijskih sistemov (OIS) 2025/2026
**Predavatelj:** izr. prof. dr. Dejan Lavbič
**Datum predavanja:** 1. 4. 2026

---

## 1. Podatki kot vir in problemi upravljanja podatkov

### Informacijski viri so povsod

Organizacije razpolagajo z **velikimi količinami podatkov**, ki prihajajo iz **različnih medijev in naprav** — dokumenti, e-pošta, senzorji, družbena omrežja, transakcijski sistemi. Osrednji izziv je **upravljanje podatkov** — kako jih sistematično zajeti, organizirati, shraniti in uporabiti za odločanje.

### BI v praksi: Formula E in "dark data"

Primer uporabe poslovne inteligence v Formuli E kaže, kako organizacije izkoriščajo kombinacijo **notranjih in zunanjih podatkov**. Posebno vlogo imajo **"dark data"** — podatki, ki jih organizacija zbira, a jih ne analizira ali ne izkorišča. Z uporabo **AI modelov v realnem času** ekipe sprejemajo **hitrejše odločitve**, kar jim prinaša **konkurenčno prednost**.

### Vrste informacij

Informacije delimo glede na stopnjo strukturiranosti:

- **Strukturirane** — jasno definirani podatki v tabelah (npr. prodajna transakcija z datumom, številko stranke, zneskom).
- **Nestrukturirane** — brez vnaprej določene oblike (npr. fotografije, ročno napisane beležke, časopisni članki).
- **Delno strukturirane** — imajo nekaj strukture, a niso v klasičnih tabelah (npr. spletna stran z naslovom, vsebino in slikami).

### Metapodatki = podatki o podatkih

Metapodatki **opisujejo vsebino** drugih podatkov, **omogočajo iskanje** in **dodajajo strukturo**. Primer: fotografija sama po sebi je nestrukturirana, a njeni metapodatki (naslov, datum zajema, avtor, ključne besede, licenca) omogočajo iskanje in organizacijo.

### Od kartotek do podatkovne baze

Razvoj shranjevanja podatkov je potekal od fizičnih **kartotek** (omare z mapami) do digitalnih **tabel** z **zapisi** (vrsticami) in **polji** (stolpci). Sodobne podatkovne baze vključujejo **definicijo podatkov** — za vsako polje je določen tip (besedilo, število, datum), dolžina, obveznost in pravila preverjanja.

### Težave datotečnih sistemov

Ko vsaka aplikacija ali oddelek vzdržuje **lastne datoteke**, nastanejo resni problemi:

- **Redundanca podatkov** — isti podatek je shranjen na več mestih (npr. ime zaposlenega v datotekah plač, računovodstva, kadrovske službe in prodaje).
- **Nekonsistentnost** — različne verzije istega podatka (npr. "Smith, Annmarie V." vs. "Smith, Annmarie Vorgas" vs. "Vorgas-Smith, Annamarie").
- **Izolacija podatkov** — podatki iz enega oddelka niso dostopni drugemu.
- **Težavno vzdrževanje** — sprememba strukture zahteva posege v vse odvisne aplikacije.

### Podatkovno skladišče: povezovanje virov

**Podatkovno skladišče** (ang. *Data Warehouse*) rešuje problem razpršenih podatkov. **Notranji viri** (operativni podatki, podatki o strankah, zaloge, proizvodnja, arhivski podatki, spletni promet) in **zunanji viri** (popisni podatki, GPS koordinate, podatki o konkurenci) se skozi postopek **ETL** (Extract, Transform, Load) naložijo v centralni repozitorij, ki podpira analitične poizvedbe, podatkovni rudarjenje in posebna poročila.

### Zunanji podatki povečajo vrednost

Povezava notranjih podatkov z zunanjimi viri prek **skupnega ključa** (npr. poštna številka) omogoča **bogatejše vpoglede**. Primer: tabela z naslovi strank se prek poštne številke poveže z zunanjim virom (npr. US Census Bureau) in pridobi podatek o povprečnem dohodku gospodinjstev v tistem predelu — to obogati analizo strank, ne da bi podjetje samo zbiralo te podatke.

### Arhitekture podatkovnih skladišč

Podatkovnih skladišč ne gradi le en pristop — obstaja več arhitektur: **relacijska baza** na ločenem strežniku (optimizirana za poročanje), **podatkovne kocke** (večdimenzionalni podatki, organizirani hierarhično po dimenzijah — npr. prodaja po produktu, mestu, regiji in državi), **virtualno federativno skladišče** (podatki se črpajo v realnem času iz obstoječih baz), **podatkovna naprava** (predpakirana rešitev strojne in programske opreme), **NoSQL** (za nestrukturirane in velike podatke) ter **in-memory baza** (podatki v delovnem pomnilniku za izjemno hitrost).

### Big Data: 3V

Big Data opisujemo s tremi dimenzijami:

- **Volume** (obseg) — količina podatkov raste od megabajtov prek gigabajtov in terabajtov do petabajtov.
- **Velocity** (hitrost) — podatki nastajajo v realnem času (senzorji, RFID, GPS, družbena omrežja, video).
- **Variety** (raznolikost) — od strukturiranih operativnih podatkov do nestrukturiranih vsebin (slike, besedilo, video, uporabniški komentarji).

### Podatkovno skladišče ≠ operativna baza

Operativna baza (**OLTP**) obdeluje tekoče transakcije — je optimizirana za hitro pisanje in branje posameznih zapisov. Podatkovno skladišče je namenjeno **analitiki** — hrani zgodovinske podatke iz več virov in je optimizirano za kompleksne poizvedbe. To sta dva različna sistema z različnimi cilji.

### Človeški dejavnik pri upravljanju podatkov

Tehnologija sama ne zadošča — ključen je **človeški dejavnik**. To vključuje vprašanje **lastništva podatkov** (kdo je odgovoren za določen nabor podatkov), pojav **shadow systems** (neuradne tabele in baze, ki jih zaposleni vzdržujejo mimo uradnega IT sistema), potrebo po **MDM** (Master Data Management — upravljanje glavnih podatkov, ki so skupni vsem sistemom), vlogo **data stewarda** (skrbnika podatkov, ki zagotavlja kakovost in skladnost) ter sistematično **usklajevanje deležnikov**, da vsi v organizaciji podatke razumejo in uporabljajo enako.

---

## 2. Relacijski model in osnove podatkovnih baz

### Podatkovna hierarhija

Podatki v bazi so organizirani hierarhično: **bit** (0 ali 1) → **byte** (8 bitov, en znak — npr. črka "I" = 0100 1001 v ASCII) → **polje** (ang. *field*, ena lastnost — npr. predmet "IS 101") → **zapis** (ang. *record*, vrstica z vsemi polji ene entitete) → **datoteka/tabela** (ang. *file*, skupina zapisov istega tipa) → **podatkovna baza** (ang. *database*, skupina povezanih tabel — npr. študentska baza s tabelami predmetov, osebnih podatkov in financ).

### Relacije in povezave med tabelami

Med entitetami obstajajo tri vrste relacij:

- **1 : 1** — ena entiteta je povezana z natanko eno drugo (npr. en študent ima eno parkirno dovoljenje).
- **1 : N** — ena entiteta je povezana z več drugimi (npr. en profesor predava več predmetov).
- **N : M** (ali M : N) — več entitet je povezanih z več drugimi (npr. študenti se vpisujejo na več predmetov, vsak predmet pa ima več študentov).

Povezave predstavimo z **ER diagrami** (Entity-Relationship diagrami).

### Arhitekture podatkovnih baz

Zgodovinsko poznamo tri arhitekture: **hierarhično** (drevesna struktura — vsak otrok ima enega starša), **mrežno** (vozlišča lahko imajo več staršev, kar omogoča bolj kompleksne povezave) in **relacijsko** — ta je danes **prevladujoč pristop**. V relacijski bazi so podatki shranjeni v **tabelah** (relacijah), med katerimi obstajajo formalne povezave.

### Relacijska baza: tabele in povezave

V relacijski bazi vsaka **tabela** predstavlja eno **entiteto** (npr. Students, Registrations). Tabele se povezujejo prek **skupnega polja** — vrednost, ki se pojavi v obeh tabelah, vzpostavi **povezavo**. Primer: tabela Students (StudentID, LastName, FirstName, BirthDate) in tabela Registrations (RegistrationNumber, StudentID, ClassCode, Grade) — skupno polje StudentID omogoča, da za vsakega študenta najdemo vse njegove vpise.

### Ključi: enoličnost in povezovanje

- **Primarni ključ** (ang. *Primary Key — PK*) — polje ali kombinacija polj, ki **enolično** identificira vsak zapis v tabeli (npr. EmployeeID v tabeli Employees, DepartmentID v tabeli Departments). Nobena dva zapisa ne smeta imeti enake vrednosti primarnega ključa.
- **Tuji ključ** (ang. *Foreign Key — FK*) — polje v eni tabeli, ki se sklicuje na primarni ključ **druge** tabele in tako vzpostavi **povezavo** med tabelama (npr. DepartmentID v tabeli Employees je tuji ključ, ki kaže na primarni ključ DepartmentID v tabeli Departments).

---

## 3. Načrtovanje podatkovnega modela (ER modeliranje)

### ER modeliranje: osnovni pojmi

Podatkovni model načrtujemo z **ER modeliranjem** (Entity-Relationship). Osnovni pojmi:

- **Entiteta** — objekt ali koncept, o katerem shranjujemo podatke (npr. Student, Profesor, Predmet).
- **Atributi** — lastnosti entitete (npr. ime, priimek, datum rojstva).
- **Primarni ključ** — atribut, ki enolično identificira vsak primerek entitete.
- **Relacije** — povezave med entitetami.
- **Poslovna pravila** — določajo naravo povezav (npr. "vsak študent *lahko ima* parkirno dovoljenje" vs. "vsako dovoljenje *mora pripadati* študentu").

### Tipi relacij in kardinalnost

Relacije med entitetami opisujemo s **kardinalnostjo** — koliko primerkov ene entitete je povezanih z drugo:

- **1:1** — npr. študent ima največ eno parkirno dovoljenje.
- **1:N** — npr. profesor predava več predmetov, a vsak predmet ima enega profesorja.
- **M:N** — npr. študent obiskuje več predmetov in vsak predmet obiskuje več študentov.

Poleg kardinalnosti določimo tudi **obveznost** — ali je udeležba v relaciji **obvezna** ali **opcijska** (npr. študent *može* imeti dovoljenje, a ni nujno).

### Reševanje M:N relacij z vmesno tabelo

M:N relacij **ne moremo neposredno implementirati** v relacijski bazi. Rešitev je **vmesna tabela** (ang. *junction/bridge table*), ki M:N razgradi na dve relaciji 1:N. Primer: študent ↔ predmet (M:N) se razreši z vmesno tabelo **REGISTRATION**, ki vsebuje tuji ključ študenta (Student Identification Number) in tuji ključ predmeta (Class ID Number) ter morebitne dodatne atribute (npr. Registration Date). Tako nastaneta dve relaciji: Student 1:N Registration in Class 1:N Registration.

### Primer: Medsebojno ocenjevanje

Aplikacija za medsebojno ocenjevanje pri predmetu OIS zahteva kompleksen podatkovni model. Entitete vključujejo: **Vloga** (Profesor, Asistent, Študent), **Uporabnik** (z imenom, priimkom, e-poštom in tujo ključem na vlogo), **Predmet**, **Delavnica** (z začetki in konci oddaje ter vrednotenja), **Faza delavnice** (Faza nastavitve, Faza oddaje, Faza vrednotenja, Faza vrednotenja ocen, Zaprto), **Naloga** (z vsebino in časom oddaje) ter **Ocena** (z oceno oddaje, oceno vrednotenja, časom dodelitve in utežjo). Relacije med njimi so pretežno 1:N, vmesne tabele pa rešujejo M:N primere (npr. uporabnik oddaja naloge in hkrati vrednoti naloge drugih).

### Primer: Fleksibilen cenik z akcijami

Cenik za spletno trgovino (npr. Apple izdelki) zahteva modeliranje naslednjih konceptov: **Kategorija izdelka** (MacBook, iPad, iPhone ...), **Izdelek** (posamezen model z nazivom, opisom in pripadnostjo kategoriji), **Cenik** (z veljavnostjo od-do), **Postavka cenika** (cena in morebitni popust za določen izdelek v določenem ceniku), **Akcija** (z nazivom, opisom in odstotkom popusta) ter **vmesni tabeli** Akcija za kategorijo in Akcija za cenik, ki povezujeta akcije s kategorijami oziroma ceniki v M:N relacijah.

---

## 4. Normalizacija in kakovost podatkov

### Problem: nestrukturirani podatki

Če podatke shranimo v eno samo tabelo brez normalizacije, nastanejo težave: **redundanca** (isti podatki se ponavljajo v več vrsticah), **ponavljajoče skupine** (več vrednosti v enem polju), **NULL vrednosti** in **težavno vzdrževanje** (sprememba enega podatka zahteva posodobitev na več mestih — če jo pozabimo, nastane nekonsistentnost).

### Funkcionalne odvisnosti

**Funkcionalna odvisnost** pomeni, da vrednost enega atributa (determinante) **enolično določa** vrednost drugega atributa. Primer: Customer ID → Customer F Name, Customer L Name, Customer Address, Zip Code (če poznamo ID stranke, poznamo njen naslov). Prav tako: Pizza Code → Pizza Name, Price (šifra pice enolično določi njeno ime in ceno). Funkcionalne odvisnosti so **osnova za normalizacijo**.

### Postopek normalizacije

Normalizacija je postopek razgradnje tabel za odpravo redundance in anomalij:

1. Podatke zapišemo kot **relacijo** (enoten zapis vseh atributov).
2. Odpravimo **ponavljajoče skupine** → dosežemo **1. normalno obliko (1. NO)**.
3. Določimo **ključ** in **funkcionalne odvisnosti**.
4. Odpravimo **parcialne (delne) odvisnosti** → dosežemo **2. normalno obliko (2. NO)**.
5. Odpravimo **tranzitivne odvisnosti** → dosežemo **3. normalno obliko (3. NO)**.
6. Povežemo relacije s **primarnimi in tujimi ključi**.

### 1. normalna oblika (1. NO)

Relacija je v 1. NO, ko je vsak atribut **atomaren** (en atribut = ena vrednost) in ni **ponavljajočih skupin**. V praksi to pomeni, da večvrednostne atribute razgradimo v ločene vrstice. Primer: če ima voznik v eni vrstici dva prekrška (dva datuma, dva zneska), jih razdelimo v dve ločeni vrstici. Po prehodu v 1. NO **še vedno obstaja redundanca** — podatki o vozniku (ime, priimek, naslov) se ponavljajo v vsaki vrstici.

Po pretvorbi v 1. NO določimo **ključ** — to je minimalna kombinacija atributov, ki enolično identificira vsak zapis. Nato določimo **funkcionalne odvisnosti** — npr. St_dovoljenja → (Ime, Priimek, Posta, Kraj) in (St_dovoljenja, Datum_in_ura) → (Znesek, St_tock) ter Posta → Kraj.

### 2. normalna oblika (2. NO)

Relacija je v 2. NO, ko je v 1. NO **in** ne vsebuje **parcialnih (delnih) odvisnosti** — to so odvisnosti, kjer atribut zavisi le od **dela** sestavljenega ključa. Atribute, ki so odvisni le od dela ključa, prestavimo v **nov entitetni tip**. Primer: iz relacije Voznik (s sestavljenim ključem St_dovoljenja + Datum_in_ura) izločimo podatke o vozniku (Ime, Priimek, Posta), ki so odvisni le od St_dovoljenja, v ločeno tabelo Voznik, ostanejo pa Prekrsek (#St_dovoljenja, Datum_in_ura, Znesek, St_tock).

### 3. normalna oblika (3. NO)

Relacija je v 3. NO, ko je v 2. NO **in** ne vsebuje **tranzitivnih odvisnosti** — to so odvisnosti, kjer nekljčni atribut določa drug nekljčni atribut. Primer: v tabeli Voznik velja St_dovoljenja → Posta → Kraj. Kraj je tranzitivno odvisen od ključa prek Poste. Rešitev: Kraj prestavimo v ločeno tabelo **Lokacija** (Posta, Kraj), v tabeli Voznik pa ostane le #Posta kot tuji ključ.

### Normalizacija — povzetek

Cilj normalizacije je **3. NO** — takrat so relacije jasne, z minimalno redundanco in brez anomalij pri vstavljanju, brisanju ali posodabljanju. Vsak nekljčni atribut zavisi od **ključa, celotnega ključa in ničesar drugega kot ključa**.

### Primer: Normalizacija računa

Izhodiščna relacija računa: R1 (St_racuna, Datum_racuna, St_kupca, Naziv_kupca, Znesek_racuna, (St_izdelka, Naziv_izdelka, Kolicina, Cena, Vrednost)).

**1. NO** — odpravimo ponavljajoče skupine (postavke računa): R11 (St_racuna, Datum_racuna, St_kupca, Naziv_kupca, Znesek_racuna) in R12 (#St_racuna, St_izdelka, Naziv_izdelka, Kolicina, Cena, Vrednost).

**2. NO** — v R12 sta St_izdelka → Naziv_izdelka in St_izdelka → Cena parcialni odvisnosti (odvisni le od dela ključa). Izločimo: R121 (St_izdelka, Naziv_izdelka, Cena) in R122 (#St_racuna, #St_izdelka, Kolicina, Vrednost).

**3. NO** — v R11 je St_kupca → Naziv_kupca tranzitivna odvisnost. Izločimo: R111 (St_kupca, Naziv_kupca) in R112 (St_racuna, Datum_racuna, #St_kupca, Znesek_racuna).

Končni rezultat so štiri tabele: **Kupec** (R111), **Racun** (R112), **Postavka** (R122) in **Izdelek** (R121), povezane s primarnimi in tujimi ključi.

---

## 5. Upravljanje in uporaba podatkov

### Poizvedovanje v relacijski bazi

Za iskanje podatkov v relacijski bazi uporabljamo **SQL** (Structured Query Language). Osnovna struktura poizvedbe: **SELECT** (kateri stolpci) **FROM** (iz katere tabele) **WHERE** (kateri pogoj). Primer: `SELECT Student_Name FROM Student_Database WHERE Grade_Point_Average >= 3.40 AND Grade_Point_Average < 3.60`.

Poleg SQL obstaja tudi **QBE** (Query by Example) — vizualni vmesnik, kjer uporabnik izbere tabele, polja in pogoje z obrazcem, ne da bi pisal kodo.

### JOIN: ponovno sestavljanje podatkov

Ker normalizacija razdeli podatke v **več tabel**, je za celostni pogled potrebna operacija **JOIN** — povezava tabel prek **ključev**. Primer: za prikaz celotnega naročila s podatki o stranki in picah moramo povezati tabele ORDER, CUSTOMER, ORDER-PIZZA in PIZZA prek skupnih polj (Customer ID, Order Number, Pizza Code).

### Relacijski DBMS: osnovne operacije

Tri temeljne operacije relacijske algebre:

- **SELECT** — izbere **vrstice** (zapise), ki ustrezajo pogoju.
- **PROJECT** — izbere **stolpce** (polja), ki nas zanimajo.
- **JOIN** — **poveže** dve ali več tabel prek skupnega polja.

Kombinacija teh treh operacij je osnova za vse poizvedbe.

### DBMS: upravljanje podatkov in pogledi

**DBMS** (Database Management System) je programska oprema za **ustvarjanje, shranjevanje, organiziranje in dostop** do podatkov. Ključna lastnost je ločitev **logičnega pogleda** (kako uporabnik vidi podatke) od **fizičnega pogleda** (kako so podatki dejansko shranjeni na disku). Ena podatkovna baza lahko ponudi **več uporabniških pogledov** — npr. kadrovska služba vidi le ime, številko in zdravstveno zavarovanje (Benefits View), medtem ko računovodstvo vidi ime, številko in plačo (Payroll View).

### Zmožnosti DBMS

DBMS ponuja: **definicijo podatkov** (ustvarjanje tabel, določanje tipov in pravil), **slovar podatkov** (ang. *data dictionary* — centralni katalog vseh metapodatkov o bazi), **SQL** (standardni jezik za poizvedovanje in upravljanje) ter orodja za **poizvedbe in poročila**.

### Porazdeljene baze podatkov

Porazdeljena baza podatkov hrani podatke na **več strežnikih** na različnih lokacijah. Ključne prednosti so **skalabilnost** (zmogljivost raste z dodajanjem strežnikov), **replikacija** (kopije podatkov na več lokacijah za zanesljivost) in **fragmentacija** (razdelitev tabele na dele, ki se hranijo na različnih mestih glede na lokalne potrebe).

---

## 6. Onkraj relacijskega modela

### NoSQL

**NoSQL** (ang. *Not only SQL*) so sistemi za upravljanje podatkov, prilagojeni za shranjevanje in analizo **velikih količin** nestrukturiranih ali polstrukturiranih podatkov. Ponujajo **prilagodljivost** sheme, **horizontalno skalabilnost** in **hitrost** pri velikem obsegu podatkov.

### Podatkovne baze v oblaku

Podatkovna baza **v oblaku** (ang. *cloud database*) je podatkovna baza, ki deluje kot **storitev** (DBaaS — Database as a Service). Omogoča enostavno **skalabilnost** brez lastne infrastrukture — organizacija plača le za tisto, kar porabi.

### Veriga blokov kot porazdeljena knjiga

**Veriga blokov** (ang. *blockchain*) je **porazdeljena knjiga** (ang. *distributed ledger*), v kateri so transakcije zapisane v **blokih** s **časovnim žigom**, ki so med seboj nespremenljivo povezani. Deluje na principu **peer-to-peer** omrežja, **brez centralnega nadzora**. Zagotavlja **transparentnost** (vsi udeleženci vidijo iste podatke) in **odpornost proti prirejanju** (sprememba enega bloka bi zahtevala spremembo vseh naslednjih).

### Poslovna vrednost verige blokov

Največja poslovna vrednost verige blokov je v **dobavnih verigah** (sledenje izdelkov od proizvajalca do potrošnika), **sledljivosti** (npr. izvor hrane, pristnost zdravil) in vzpostavljanju **zaupanja med partnerji**, ki se ne poznajo. Veriga blokov ni nujno **javna** (kot Bitcoin) — pogosto se v poslovnem okolju uporablja **zasebna** ali **konzorcijska** veriga blokov.

---

## 7. Infrastruktura poslovne inteligence in OLAP

### Infrastruktura poslovne inteligence

Celotna BI infrastruktura vključuje: **vhodne vire** (operativni podatki, zgodovinski podatki, IoT, splet in družbena omrežja, avdio/video, zunanji podatki) → **ETL** proces → shranjevanje v **Hadoop Data Lake** ali **podatkovno skladišče** → iz skladišča se podatki prelivajo v **data marte** (za navadne uporabnike — poizvedbe, poročila, nadzorne plošče) in **analitične platforme** (za napredne uporabnike — poizvedbe, poročila, **OLAP**, podatkovni rudarjenje).

### OLAP: večdimenzionalni pogled na podatke

**OLAP** (Online Analytical Processing) omogoča **večdimenzionalni pogled** na podatke — podatke analiziramo po več dimenzijah hkrati (npr. **produkt**, **regija**, **čas**) in primerjamo **dejanske** (ang. *actual*) z **načrtovanimi** (ang. *projected*) vrednostmi. OLAP omogoča hitre odgovore na **ad hoc vprašanja** — npr. "Kakšna je bila prodaja vijakov v zahodni regiji v drugem četrtletju v primerjavi z načrtom?"

### Povezovanje baz podatkov s spletom

Sodobna arhitektura dostopa do podatkov poteka v plasteh: **spletni brskalnik** (uporabniški vmesnik) → **internet** → **spletni strežnik** (sprejme zahtevo) → **aplikacijski strežnik** (izvede poslovno logiko) → **podatkovni strežnik** (izvede poizvedbo) → **podatkovna baza** (vrne podatke). Splet tako služi kot **vmesnik do notranjih podatkov** organizacije.

---

## 8. Upravljanje in kakovost podatkov

### Upravljanje podatkov (ang. *Data Governance*)

Upravljanje podatkov določa **pravila** za ravnanje s podatki — kdo lahko **dostopa**, **spreminja** in **deli** podatke. Regulativa (npr. GDPR, AI Act) postavlja okvir, znotraj katerega morajo organizacije delovati.

### Kakovost podatkov (ang. *Data Quality*)

Kakovost podatkov se meri z **točnostjo**, **konsistentnostjo** in **ažurnostjo**. Najpogostejši problemi so: **napake** (napačni vnosi), **podvajanje** (isti zapis na več mestih) in **neusklajenost** (različne vrednosti za isti podatek v različnih sistemih). Rešitve vključujejo **revizijo podatkov** (ang. *data audit* — sistematičen pregled stanja podatkov) in **čiščenje podatkov** (ang. *data cleansing* — odkrivanje in odpravljanje napak, podvojitev in nekonsistentnosti).

---

## Ključni pojmi za ponavljanje

| Pojem | Definicija |
|---|---|
| **Strukturirani podatki** | Podatki z jasno definirano obliko, shranjeni v tabelah (vrstice in stolpci) |
| **Nestrukturirani podatki** | Podatki brez vnaprej določene oblike (besedilo, slike, video) |
| **Delno strukturirani podatki** | Podatki z nekaj strukture, a ne v klasičnih tabelah (npr. XML, spletne strani) |
| **Metapodatki** | Podatki o podatkih — opisujejo vsebino, strukturo in kontekst |
| **Dark data** | Podatki, ki jih organizacija zbira, a ne analizira ali izkorišča |
| **Redundanca** | Ponavljanje istih podatkov na več mestih; vodi v nekonsistentnost |
| **ETL** | Extract, Transform, Load — postopek prenosa in preoblikovanja podatkov v skladišče |
| **Big Data (3V)** | Volume (obseg), Velocity (hitrost), Variety (raznolikost) |
| **Primarni ključ (PK)** | Atribut ali kombinacija atributov, ki enolično identificira vsak zapis v tabeli |
| **Tuji ključ (FK)** | Atribut v tabeli, ki se sklicuje na primarni ključ druge tabele |
| **ER diagram** | Entity-Relationship diagram — grafični prikaz entitet, atributov in relacij |
| **Kardinalnost** | Število primerkov ene entitete, povezanih z drugo (1:1, 1:N, M:N) |
| **Vmesna tabela** | Tabela, ki razgradi M:N relacijo na dve 1:N relaciji |
| **Funkcionalna odvisnost** | Vrednost enega atributa enolično določa vrednost drugega |
| **1. NO** | Prva normalna oblika — atomarni atributi, brez ponavljajočih skupin |
| **2. NO** | Druga normalna oblika — 1. NO + brez parcialnih (delnih) odvisnosti |
| **3. NO** | Tretja normalna oblika — 2. NO + brez tranzitivnih odvisnosti |
| **Normalizacija** | Postopek razgradnje tabel za odpravo redundance in anomalij |
| **SQL** | Structured Query Language — standardni jezik za poizvedovanje in upravljanje relacijskih baz |
| **QBE** | Query by Example — vizualni vmesnik za poizvedbe brez pisanja SQL |
| **JOIN** | Operacija, ki poveže dve tabeli prek skupnega polja |
| **DBMS** | Database Management System — programska oprema za upravljanje podatkovne baze |
| **NoSQL** | "Not only SQL" — sistemi za velike količine nestrukturiranih podatkov |
| **Veriga blokov** | Porazdeljena knjiga transakcij v nespremenljivo povezanih blokih |
| **OLAP** | Online Analytical Processing — večdimenzionalne analitične poizvedbe |
| **Data Governance** | Pravila in procesi za upravljanje podatkov (dostop, spreminjanje, deljenje) |
| **Data Quality** | Kakovost podatkov — točnost, konsistentnost, ažurnost |
| **Data Cleansing** | Čiščenje podatkov — odkrivanje in odpravljanje napak in podvojitev |
| **Data Steward** | Skrbnik podatkov — odgovoren za kakovost in skladnost podatkov |
| **MDM** | Master Data Management — upravljanje glavnih/referenčnih podatkov organizacije |
| **Shadow Systems** | Neuradni sistemi (tabele, baze), ki jih zaposleni vzdržujejo mimo uradnega IT |
