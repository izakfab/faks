# P2 — Podatki, informacije, znanje in odločitve

**Predmet:** Osnove informacijskih sistemov (OIS) 2025/2026
**Predavatelj:** izr. prof. dr. Dejan Lavbič
**Datum predavanja:** 25. 2. 2026

---

## 1. Upravljanje podatkov in znanja

### Zakaj so podatki strateški vir?

IS podpirajo **zajem**, **shranjevanje**, **analizo** in **interpretacijo** podatkov. Veriga vrednosti poteka po zaporedju: **podatki → informacije → znanje → konkurenčna prednost**. Podatki so strateški vir organizacije, **baze podatkov** pa temeljni gradnik IS. Odločitve o podatkih imajo **dolgoročne posledice** — napačna arhitektura ali slab podatkovni model lahko organizacijo drago stane.

### Izzivi upravljanja podatkov

Upravljanje podatkov danes zahteva soočanje z vrsto izzivov: zahtevana je **visoka kakovost podatkov**, količina podatkov pa **eksponentno narašča**. Pogosti problemi so **podatkovni silosi** (ang. *data silos*) in nekonsistentnost med oddelki. Podatki prihajajo iz več virov — POS terminali, splet, družbena omrežja, senzorji — kar otežuje integracijo. Poleg tega podatki **zastarevajo**, pojavljajo se vprašanja varnosti, regulative in skladnosti (npr. GDPR), tu so še izzivi **Big Data** in splošna potreba po sistematičnem **upravljanju podatkov** (ang. *data governance*).

### Primer: IBM Watson Health — ko UI ni dovolj

IBM je z ambicijo uporabe UI za revolucijo zdravljenja raka v Watson Health vložil približno **4 milijarde dolarjev**. Projekt ni dosegel pričakovanj in je bil leta 2022 prodan. Ključno vprašanje: ali je bil problem v **UI** ali v **podatkih**? Primer nazorno pokaže, da tudi najnaprednejša tehnologija ne more nadomestiti slabih, nekonsistentnih ali nepopolnih podatkov.

### Zakaj kljub podatkom sprejemamo slabe odločitve?

Štirje pogosti vzroki za slabe odločitve:

- **Napačno opredeljen problem** — rešujemo napačno stvar.
- **Napačna metrika/KPI** — merimo nekaj, kar ne odraža dejanskega cilja.
- **Pristranskost podatkov** — podatki ne predstavljajo celotne slike (npr. pristranskost preživelih).
- **Analitična paraliza** — preveč informacij, premalo presoje; odločitev se odlaga ali sprejme napačno.

### Primer: Pristranskost preživelih (ang. *Survivorship Bias*)

Klasičen primer iz 2. svetovne vojne: analizirali so poškodbe na letalih, ki so se **vrnila** iz boja, in želeli okrepiti dele z največ zadetki. Statistik Abraham Wald je ugotovil, da je treba okrepiti ravno dele **brez** zadetkov — ker letala, zadeta na teh mestih, sploh niso preživela in jih v podatkih ni. To je šolski primer, kako **manjkajoči podatki** vodijo v napačne zaključke.

### Primer: Aplikacija UniFit — zakaj je definicija metrike ključna

Aplikacija **UniFit** za spremljanje študijskih navad želi meriti KPI "Število aktivnih uporabnikov". Po prvem mesecu so rezultati: 8.000 registriranih uporabnikov, 5.200 prijav v 30 dneh, 2.900 oddanih vaj, 1.100 uporabnikov z več kot 5 odprtji. Marketing trdi, da je projekt uspešen, finance opozarjajo na stagnacijo, razvojna ekipa meni, da je problem **definicija metrike**.

Ključna vprašanja pri definiciji "aktivnega uporabnika": Kaj šteje kot **aktivnost** (prijava, oddana vaja, odprtje aplikacije)? Kakšen je **časovni okvir** (dnevno, tedensko, mesečno)? Ali koga **izključimo** (testni uporabniki, administratorji)? Brez jasne definicije KPI so podatki neuporabni za odločanje.

---

## 2. Hierarhija podatkov in baze podatkov

### Hierarhija podatkov

Podatki so organizirani v hierarhiji od najmanjše enote do celotne baze:

- **Bit** — najmanjša enota (0 ali 1).
- **Byte** — 8 bitov, predstavlja en znak.
- **Polje** (ang. *field*) — lastnost entitete (npr. priimek).
- **Zapis** (ang. *record*) — skupina povezanih polj (npr. vsi podatki o enem zaposlenem).
- **Tabela** (ang. *data file*) — skupina zapisov istega tipa.
- **Podatkovna baza** (ang. *database*) — skupina povezanih tabel.

### Datoteke vs. podatkovna baza

V **datotečnem okolju** ima vsaka aplikacija svojo datoteko, kar povzroča **podvajanje**, **izolacijo** podatkov in **nekonsistentnost**. Rešitev je uporaba **podatkovne baze** skupaj s sistemom za upravljanje baz podatkov (**DBMS** — Database Management System). Prednosti so manjša redundanca ter večja **integriteta in varnost** podatkov. Slabost je večja kompleksnost sistema in tveganje, ki ga prinaša **centralizacija**.

---

## 3. Podatkovna skladišča

### Podatkovno skladišče (ang. *Data Warehouse — DW*)

Podatkovno skladišče je **centralni repozitorij zgodovinskih podatkov**, namenjen **analitiki in odločanju**. V nasprotju z operativnimi bazami podatkov (OLTP), ki obdelujejo tekoče transakcije, je DW optimiziran za analitične poizvedbe (OLAP).

### Področno podatkovno skladišče (ang. *Data Mart*)

Področno podatkovno skladišče je **manjša, oddelčna različica** podatkovnega skladišča — npr. DW samo za marketing ali finance.

### Značilnosti podatkovnega skladišča

Podatkovno skladišče je **integrirano** (združuje podatke iz več virov), **časovno** (hrani zgodovinske podatke), **nevolatilno** (podatki se ne spreminjajo po zapisu), podpira **OLAP** poizvedbe in je **večdimenzionalno** (podatki so organizirani po več dimenzijah hkrati — npr. izdelek × regija × čas).

### Relacijski vs. večdimenzionalni pogled

V relacijski bazi so podatki o prodaji shranjeni v tabelah (izdelek, regija, prodaja za vsako leto posebej). V **podatkovni kocki** pa iste podatke prikažemo večdimenzionalno — npr. prodaja po izdelku, regiji in letu hkrati. To omogoča hitrejši analitični vpogled, primerjave in rezanje podatkov (ang. *slicing and dicing*).

---

## 4. Upravljanje znanja

### Kaj je upravljanje znanja?

**Upravljanje znanja** (ang. *Knowledge Management — KM*) je sistematično ravnanje z znanjem v organizaciji. **Intelektualni kapital** predstavlja celotno organizacijsko znanje.

Ločimo dve vrsti znanja:

- **Eksplicitno znanje** — zapisano, dokumentirano (navodila, postopki, priročniki).
- **Tacitno znanje** — izkušnje, intuicija, praksa posameznika (težko ga je formalizirati).

Cilj KM je **boljše odločanje** in **prenos ekspertize** med zaposlenimi.

### Cikel sistema za upravljanje znanja

Znanje v organizaciji kroži skozi cikel: **Create** (ustvari) → **Capture** (zajemi) → **Refine** (izboljšaj) → **Store** (shrani) → **Manage** (upravljaj) → **Disseminate** (razširjaj) → nazaj v **Knowledge**.

### Primer: Wiki platforma (npr. SharePoint)

Praktična implementacija KM v organizaciji vključuje: bazo **postopkov, navodil in najboljših praks**, profile zaposlenih z navedenimi **kompetencami**, iskanje po vsebini in ključnih besedah, verzije dokumentov in sledljivost sprememb ter forume ali komentarje za deljenje **tacitnih izkušenj**.

---

## 5. Poslovna analitika (ang. *Business Analytics — BA*)

### Kaj je poslovna analitika?

Poslovna analitika je razvoj **ukrepov in priporočil** na podlagi analize **zgodovinskih podatkov**. Uporablja statistične metode, modele in analitična orodja. Cilj je dostaviti **pravo informacijo pravemu odločevalcu ob pravem času**.

### Tri vrste analitike

| Vrsta | Ključno vprašanje | Metode |
|---|---|---|
| **Opisna** (ang. *Descriptive*) | Kaj se je zgodilo? | opisna statistika, OLAP, nadzorne plošče, podatkovni rudarjenje |
| **Napovedna** (ang. *Predictive*) | Kaj se bo zgodilo? | podatkovni rudarjenje, linearna/logistična regresija, klasifikacija |
| **Predpisna** (ang. *Prescriptive*) | Kaj naj naredimo? | optimizacija, simulacija, odločitvena drevesa |

### Kdo uporablja poslovno analitiko? (pravilo 80/20)

Uporabnike delimo na dve skupini:

- **Power Users / Producers (20 % zaposlenih)**: IT razvijalci, super uporabniki, poslovni analitiki, analitični modelarji — ti **ustvarjajo** poročila, nadzorne plošče in modele.
- **Casual Users / Consumers (80 % zaposlenih)**: stranke/dobavitelji, operativni zaposleni, višji managerji, managerji/osebje, poslovni analitiki — ti analitične produkte **uporabljajo** za odločanje.

### Primer: Zillow — ko algoritem zgreši trg

Zillow je nepremičninska platforma z milijoni podatkov. Njihov algoritem **Zestimate** ocenjuje tržno vrednost nepremičnin. Ko so prešli iz **opisne** v **napovedno analitiko** in poskušali napovedati cene 3–6 mesecev vnaprej, so utrpeli več kot **500 milijonov USD izgub**. Primer kaže, da napovedno modeliranje prinaša večjo vrednost, a tudi bistveno večja tveganja.

### Primer: UPS in tri vrste analitike

| Tip analitike | Ključno vprašanje | Primer pri UPS | Poslovni učinek |
|---|---|---|---|
| **Opisna** | Kaj se je zgodilo? | DIAD, sledenje paketom, merjenje kilometrov in napak | Pregled nad delovanjem |
| **Napovedna** | Kaj se bo zgodilo? | HEAT — napoved obremenitev in zamud, digitalni dvojček | Boljše planiranje |
| **Predpisna** | Kaj naj naredimo? | ORION — optimizacija dnevnih poti, prilagoditve za vreme/promet | Neposredni finančni prihranki |

---

## 6. Odločanje v praksi

### Vloga managerjev pri odločanju

**Management** pomeni doseganje ciljev z uporabo virov. **Produktivnost** je razmerje med vložki in rezultati. **Odločanje** je izbira med alternativami — in predstavlja jedro managerskega dela.

### Faze odločanja (Herbert Simon)

Herbert Simon je opredelil štiri faze odločanja (cikel s povratnimi zankami):

1. **Intelligence** (odkrivanje problema) — Kaj je problem?
2. **Design** (iskanje rešitev) — Katere rešitve so mogoče?
3. **Choice** (izbira rešitve) — Katera rešitev je najboljša?
4. **Implementation** (izvedba) — Ali rešitev deluje? Jo lahko izboljšamo?

Med fazami obstajajo povratne zanke — če npr. v fazi izbire ugotovimo, da nobena rešitev ni ustrezna, se vrnemo v fazo načrtovanja.

### Struktura odločitev po ravneh

| Raven upravljanja | Tip odločitve | Primeri |
|---|---|---|
| **Senior Management** | Nestrukturirane | vstop/izstop s trga, odobritev proračuna, dolgoročni cilji |
| **Middle Management** | Pol-strukturirane | marketinški načrt, oddelčni proračun, korporativna spletna stran |
| **Operational Management** | Strukturirane | upravičenost nadur, dopolnitev zalog, kreditni pogoji, posebne ponudbe |

### Okvir za podporo odločanju

Odločitve se razlikujejo po dveh dimenzijah — **strukturiranost** (strukturirane, pol-strukturirane, nestrukturirane) in **raven upravljanja** (operativna, managerska, strateška). Strukturirane odločitve na operativni ravni podpirajo MIS in statistični modeli, pol-strukturirane in nestrukturirane pa zahtevajo DSS, ekspertne sisteme, BI in Big Data analitiko.

---

## 7. Orodja za odločanje

### Nadzorne plošče (ang. *Dashboards*)

Nadzorne plošče nudijo **vizualni prikaz KPI-jev** in kritičnih faktorjev uspeha (**CSF**). Omogočajo hiter pregled stanja v **realnem času**, podpirajo odločanje **na vseh ravneh** in ponujajo možnost **drill-down** — poglabljanje do podrobnosti.

### Zmogljivosti nadzornih plošč

| Zmogljivost | Opis |
|---|---|
| **Drill down** | Poglabljanje v podrobnosti na več ravneh |
| **Critical Success Factors (CSFs)** | Prikaz ključnih faktorjev za uspeh organizacije, oddelka ali posameznika |
| **Key Performance Indicators (KPIs)** | Konkretne meritve CSF-jev |
| **Status access** | Najnovejši podatki o KPI ali drugi metriki, pogosto v realnem času |
| **Trend analysis** | Kratko-, srednje- in dolgoročni trendi KPI-jev z napovedovanjem |
| **Exception reporting** | Poročila, ki izpostavljajo odstopanja nad definiranimi mejami |

### Vrtilna tabela (ang. *Pivot Table*)

Vrtilna tabela omogoča **hiter odgovor na poslovno vprašanje** z dinamičnim prestrukturiranjem podatkov — npr. prikaz števila transakcij po regiji in viru (e-pošta vs. splet) v preglednici.

### Kaj-če analiza (ang. *What-If Analysis*)

Kaj-če analiza preverja **občutljivost** oziroma **robustnost odločitve** — kaj se zgodi z rezultatom, če spremenimo vhodne parametre. Primer: kako se spremeni **break-even point** (točka pokritja), če variiramo ceno izdelka in variabilne stroške na enoto. Uporabno za testiranje različnih scenarijev pred sprejetjem odločitve.

### Iskanje cilja (ang. *Goal Seeking*)

Iskanje cilja je **obratna kaj-če analiza** — namesto da spreminjamo vhode in opazujemo izhod, določimo **želeni izhod** in iščemo vhodne vrednosti, ki ga dosežejo. Primer: koliko udeležencev na seminar potrebujemo, da dosežemo nič dobička/izgube (break-even)?

### Napovedovanje (ang. *Forecasting*)

Napovedovanje uporablja **zgodovinske podatke** za projekcijo prihodnjih vrednosti. Primer: razmerje med tedensko količino snega in prihodki od smučarskih vozovnic (linearna regresija z r = 0.64). Na podlagi napovedi snega lahko ocenimo pričakovane prihodke.

---

## 8. Uravnoteženi kazalniki uspešnosti (ang. *Balanced Scorecard*)

Balanced Scorecard povezuje **strategijo** z merljivimi KPI-ji prek štirih perspektiv:

| Perspektiva | Primeri KPI-jev |
|---|---|
| **Finančna** | denarni tok, ROI, finančni rezultat, donosnost kapitala |
| **Stranke** | kakovost dostave, zadovoljstvo strank, zvestoba, retencija |
| **Poslovni procesi** | število aktivnosti, čas izvedbe procesa, učinkovitost virov, izpadi opreme |
| **Učenje in rast** | stopnja investicij, bolniške, interne napredovanja, fluktuacija zaposlenih |

Vse štiri perspektive so povezane s **strategijo in cilji organizacije** v sredini — KPI-ji niso izolirani, ampak tvorijo celoto.

---

## 9. Ekspertni sistemi in UI pri odločanju

### Ekspertni sistemi: odločanje na podlagi pravil

Ekspertni sistemi avtomatizirajo odločitve na podlagi **vnaprej definiranih pravil** (ang. *if-then rules*). Primer: sistem za odobritev kredita preverja dohodek, obstoječe obveznosti, leta zaposlitve in dolgove ter na podlagi tega dodeli kreditni limit (10.000 ali 3.000) ali zavrne prošnjo.

### UI pri odločanju — pridobitve in tveganja

UI podpira **napovedovanje**, **razvrščanje**, **priporočanje** in **optimizacijo** ter omogoča avtomatizirane in zelo hitre odločitve.

Tveganja uporabe UI vključujejo: **pristranskost** (ang. *bias*) v učnih podatkih, **netransparentnost** (ang. *black box*) — ne vemo, zakaj je model sprejel odločitev, **napačno definirane cilje** ter **model drift** — model sčasoma postane manj natančen, ker se razmere spreminjajo.

Ključno pravilo: **odgovornost in nadzor ostaneta pri organizaciji** — pristop *human-in-the-loop*.

### Področja uporabe UI

| Področje | Primeri |
|---|---|
| **Marketing in prodaja** | priporočilni sistemi, personalizacija, dinamično oblikovanje cen |
| **Finance** | odkrivanje goljufij, kreditno ocenjevanje, algoritemsko trgovanje |
| **Operacije in logistika** | optimizacija poti, napoved povpraševanja, upravljanje zalog |
| **HR** | selekcija kandidatov, napoved fluktuacije |
| **Podpora strankam** | chatboti, avtomatska obdelava zahtevkov |
| **Proizvodnja** | napovedno vzdrževanje, nadzor kakovosti |

### Prepoznavanje obrazov — etični izziv

Prepoznavanje obrazov (ang. *facial recognition*) kombinira UI in biometrijo. Obraz se pretvori v **matematični vzorec** (ang. *face template*) in primerja z velikimi bazami obrazov. Uporablja se v policiji, na letališčih, telefonih in socialnih omrežjih. Ključna vprašanja so: **zasebnost**, **nadzor** in **pristranskost** algoritmov.

---

## 10. Proces poslovne analitike — celotna slika

Proces poslovne analitike poteka v zaporedju:

1. **Poslovni problem** — identificiramo izziv ali »bolečino« organizacije.
2. **Upravljanje podatkov** — zunanji podatki, interni podatki (organizacijske baze), Big Data (NoSQL) se skozi ETL proces (Extract, Transform, Load) naložijo v **podatkovno skladišče**.
3. **Opisna analitika** — kaj se je zgodilo (opisna statistika, OLAP, DSS, podatkovni rudarjenje).
4. **Napovedna analitika** — kaj se bo zgodilo (podatkovni rudarjenje, regresija).
5. **Predpisna analitika** — kaj naj naredimo (optimizacija, simulacija, odločitvena drevesa).
6. **Akcija** — poslovne odločitve ali priporočeni ukrepi.

Rezultate podpirajo **prezentacijska orodja** (nadzorne plošče, grafi, poročila), ki sprožajo **nova vprašanja** — cikel se ponavlja. Na dnu vse skupaj poganjajo **tehnologije**: GPU-ji, cenejše shranjevanje, hitrejši internet, nevronske mreže, strojno učenje in globoko učenje.

---

## Ključni pojmi za ponavljanje

| Pojem | Definicija |
|---|---|
| **Podatkovni silos** | Izoliran nabor podatkov, dostopen le enemu oddelku; povzroča nekonsistentnost |
| **Data Governance** | Sistematično upravljanje podatkov — pravila, procesi, odgovornosti za kakovost |
| **Data Warehouse (DW)** | Centralni repozitorij zgodovinskih podatkov za analitiko in odločanje |
| **Data Mart** | Manjša, oddelčna različica podatkovnega skladišča |
| **OLTP** | Online Transaction Processing — obdelava tekočih transakcij |
| **OLAP** | Online Analytical Processing — analitične poizvedbe nad večdimenzionalnimi podatki |
| **Podatkovna kocka** | Večdimenzionalna struktura za analizo podatkov po več dimenzijah hkrati |
| **ETL** | Extract, Transform, Load — postopek prenosa podatkov v skladišče |
| **Eksplicitno znanje** | Znanje, ki je zapisano in dokumentirano (navodila, priročniki) |
| **Tacitno znanje** | Znanje, ki temelji na izkušnjah in intuiciji (težko ga je formalizirati) |
| **Knowledge Management (KM)** | Sistematično upravljanje znanja v organizaciji |
| **Business Analytics (BA)** | Analiza zgodovinskih podatkov za razvoj ukrepov in priporočil |
| **Opisna analitika** | Kaj se je zgodilo? (retrospektiva) |
| **Napovedna analitika** | Kaj se bo zgodilo? (napoved) |
| **Predpisna analitika** | Kaj naj naredimo? (priporočilo za ukrepanje) |
| **Dashboard** | Vizualni prikaz KPI-jev in CSF-jev za hiter pregled stanja |
| **CSF** | Critical Success Factor — ključni faktor za uspeh organizacije |
| **Kaj-če analiza** | Preverjanje občutljivosti rezultata na spremembe vhodnih parametrov |
| **Iskanje cilja** | Obratna kaj-če analiza — iščemo vhod za želen izhod |
| **Balanced Scorecard** | Okvir, ki povezuje strategijo s KPI-ji prek 4 perspektiv |
| **Simonov model odločanja** | Intelligence → Design → Choice → Implementation |
| **Human-in-the-loop** | Pristop, kjer človek ohrani nadzor in odgovornost nad odločitvami UI |
| **Survivorship Bias** | Pristranskost preživelih — analiza le uspešnih primerov vodi v napačne zaključke |
| **Model Drift** | Postopno poslabšanje natančnosti modela UI zaradi spreminjanja razmer |
