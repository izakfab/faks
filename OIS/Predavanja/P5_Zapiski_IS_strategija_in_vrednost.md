# P5 — IS, strategija in vrednost

**Predmet:** Osnove informacijskih sistemov (OIS) 2025/2026
**Predavatelj:** izr. prof. dr. Dejan Lavbič
**Datum predavanja:** 18. 3. 2026

---

## 1. Strategija in načrtovanje IS

### Tehnični dolg in poslovna vrednost IS

IS ni le operativno orodje — je **strateški vir**, ki ima dolgoročne posledice za organizacijo. Če podjetje zanemari posodabljanje IT infrastrukture, se kopiči **tehnični dolg** (ang. *technical debt*), ki sčasoma pripelje do resnih operativnih težav.

Primer: **Southwest Airlines (2022)** — zastarela IT infrastruktura ni omogočala skaliranja operacij, kar je v kombinaciji s slabim vremenom privedlo do odpovedi **17.000 letov**. Posledica je neposredni prikaz tehničnega dolga — kratkoročni prihranki pri IT investicijah so povzročili ogromno dolgoročno škodo.

### Načrtovanje IS — povezava strategij

Načrtovanje IS se začne s povezavo **organizacijske strategije** in **IT strategije**. Organizacijska misija in poslovna analiza skupaj oblikujeta **organizacijski strateški načrt**, ki se nato preslika v **IS strateški načrt**. Iz strateškega načrta IS nastane **nova informacijsko-tehnološka arhitektura**, iz katere izhajajo **IS operativni načrt** in konkretni **IS razvojni projekti**. Bistveno je, da IS projekti vedno izhajajo iz poslovnih ciljev — povezava med poslovnimi cilji in informacijskimi sistemi mora biti jasna in utemeljita.

### IT strateški načrt

IT strateški načrt opredeljuje **dolgoročne cilje IT** v organizaciji. Njegov namen je zagotoviti **podporo poslovni strategiji**, usmerjanje razvoja **IT arhitekture** in razporeditev **razvojnih virov** (kadri, proračun, čas). Načrt mora biti usklajen s strategijo organizacije kot celote.

### Strateško načrtovanje informacijskih sistemov

Strateški načrt IS vključuje: **vizijo in načela uporabe IT**, **upravljanje portfelja projektov**, **arhitekturo informacijskih sistemov**, **obnovo po katastrofah** (ang. *disaster recovery*) ter **tehnološke in poslovne trende**. Vsebina načrta IS konkretno pokriva: namen sistema, strateško utemeljitev, pregled trenutnih sistemov, načrtovane nove projekte, strategijo upravljanja, implementacijski načrt in proračun.

Pri financiranju IT obstaja več modelov: model subvencije (stroški se razporedijo na poslovne enote brez zaračunavanja), model stroškovnega centra (nekatere storitve se zaračunajo), model storitvenega centra (zaračunavanje IT storitev) in model profitnega centra (IT storitve se zaračunavajo po tržnih cenah za financiranje novih projektov).

---

## 2. Poslovna vrednost IT investicij

### Upravičevanje IT investicij

Vsaka IT investicija zahteva premislek o razmerju med **stroški in koristmi**. Temeljna metoda je **analiza stroškov in koristi** (ang. *cost-benefit analysis*). Izziv pri IS je, da je koristi pogosto **težko ovrednotiti** — zlasti neopredmetene koristi, kot so boljše odločanje, zadovoljstvo zaposlenih ali izboljšana podoba podjetja.

Med pogostejšimi metodami upravičevanja so: **neto sedanja vrednost** (ang. *Net Present Value — NPV*), **donosnost investicije** (ang. *Return on Investment — ROI*), **analiza točke pokritja** (ang. *break-even analysis*) in **poslovni primer** (ang. *Business Case*).

### Stroški in koristi IS

Stroški IS vključujejo: strojno opremo (ang. *hardware*), omrežja (ang. *networking*), programsko opremo (ang. *software*), storitve in kadre.

**Opredmetene koristi** (ang. *tangible benefits*) so merljivi prihranki: povečana produktivnost, nižji operativni stroški, zmanjšanje delovne sile, nižji stroški IT infrastrukture, nižji stroški zunanjih izvajalcev ter upočasnjena rast stroškov.

**Neopredmetene koristi** (ang. *intangible benefits*) pa so težje merljive: boljša izkoriščenost sredstev, izboljšano načrtovanje, večja organizacijska prilagodljivost, pravočasnejše informacije, boljša uporabniška izkušnja, povečano organizacijsko učenje, izpolnjevanje zakonskih zahtev, večje zadovoljstvo zaposlenih, boljše odločanje in boljša podoba podjetja.

### Finančna analiza IT investicij — NPV

**NPV** primerja današnjo vrednost prihodnjih denarnih tokov z začetno investicijo. Formula za sedanjo vrednost posameznega denarnega toka je PV = Rₜ / (1 + i)ᵗ, celotni NPV pa je vsota vseh diskontiranih denarnih tokov.

Primer: podjetje razmišlja o uvedbi novega ERP sistema s stroškom **500.000 €** in pričakovanimi letnimi prihranki **100.000 €** v petih letih, ob diskontni stopnji **10 %**. Diskontirani prihranki znašajo: 90.909 € (1. leto), 82.644 € (2. leto), 75.131 € (3. leto), 68.301 € (4. leto) in 62.069 € (5. leto). NPV = 379.054 − 500.000 = **−120.946 €**. Negativni NPV pomeni, da investicija ob danih predpostavkah **ni finančno upravičena**.

### Model ocenjevanja (ang. *Scoring Model*)

Model ocenjevanja se uporablja za **primerjavo alternativnih IS rešitev** na podlagi **uteženih kriterijev**. Vsak kriterij (npr. obdelava naročil, enostavnost uporabe, stroški) dobi utež glede na pomembnost, nato pa se za vsako alternativo oceni skladnost s kriterijem. Skupna ocena (utež × ocena) omogoča **objektivnejšo primerjavo** med kandidati. Alternativa z višjo skupno oceno je bolj primerna.

### Pristop z opcijami pri naložbah v IT

Pri velikih investicijah (npr. uvedba ERP sistema) se CIO pogosto odloča med uvedbo **celotnega sistema naenkrat** ali **faznim pristopom** (najprej pilotni modul, nato širitev).

Primer: ERP sistem s 5 moduli po 10 mio € vsak (skupaj 50 mio €), s 50 % verjetnostjo uspeha. Ob uspehu prinese 200 mio € koristi, ob neuspehu le 10 mio €. Pričakovan izkupiček celotne implementacije naenkrat je: −50 + 0,5 × 200 + 0,5 × 10 = **55 milijonov €**. Če pa najprej uvedemo 1 modul kot pilotni projekt (strošek 10 mio €, brez neposrednih koristi), nato pa ob uspehu implementiramo preostale 4 module (strošek 40 mio €), ali ob neuspehu opustimo projekt, je pričakovan izkupiček: −10 + 0,5 × (200 − 40) + 0,5 × 0 = **70 milijonov €**. Fazni pristop je boljši, ker zmanjšuje tveganje — pilotni projekt služi kot **realna opcija** (ang. *real option*), ki omogoča odločanje na podlagi dejanskih rezultatov.

### Metoda točk primerov uporabe (ang. *Use Case Points — UCP*)

UCP je metoda za **oceno obsega in stroškov** razvoja IS na podlagi primerov uporabe. Postopek:

1. Opredelitev primerov uporabe in diagramov primerov uporabe (ang. *Use Case Diagram*).
2. Izračun **neprilagojene uteži akterjev** (ang. *Unadjusted Actor Weight — UAW*).
3. Izračun **neprilagojene uteži primerov uporabe** (ang. *Unadjusted Use-Case Weight — UUCW*).
4. Ocena **faktorja tehnične kompleksnosti** (ang. *Technical Complexity Factor — TCF*) in **faktorja okoljske kompleksnosti** (ang. *Environmental Complexity Factor — ECF*).
5. Izračun točk primerov uporabe: **UCP = (UAW + UUCW) × TCF × ECF**.
6. Izračun napora: **napor = UCP × PF** (faktor produktivnosti).
7. Izračun stroška: **strošek = napor × strošek/h**.

---

## 3. Pridobivanje IS — strategije

### Odločitve pri pridobivanju IT aplikacij

Pri pridobivanju IS se organizacija sooča s štirimi ključnimi vprašanji: **koliko kode razviti** (obstoječa aplikacija, prilagoditev ali lastni razvoj), **način financiranja** (nakup ali najem), **kje bo aplikacija delovala** (lastna infrastruktura ali oblak/SaaS) in **od kod aplikacija prihaja** (dobavitelj, odprtokodna rešitev ali zunanji razvoj).

### Nakup obstoječe aplikacije (ang. *Buy-off-the-shelf*)

Prednosti nakupa obstoječe aplikacije so: **hitrejša uvedba**, **nižji razvojni stroški**, možnost **preizkusa pred nakupom** in **znane funkcionalnosti** ter zmogljivosti. Slabosti pa vključujejo: **nepopolno ujemanje** s potrebami organizacije, **težavno prilagoditev**, **odvisnost od dobavitelja** in **izzive pri integraciji** z obstoječimi sistemi.

### Prilagoditev ali najem aplikacije

**Prilagoditev** pomeni modifikacijo programske opreme ponudnika. Prinaša večjo **fleksibilnost**, a je lahko **kompleksna in draga** ter povzroča težave pri nadgradnjah. **Najem** (tipično SaaS ali ASP model) ponuja **nižje začetne stroške**, hitrejšo uvedbo in deluje po pravilu **80/20** — 80 % funkcionalnosti je pokritih, preostalih 20 % pa organizacija prilagodi procesom.

### ASP in SaaS

**ASP** (ang. *Application Service Provider*) je model, kjer ponudnik gosti **ločeno instanco aplikacije** za vsakega naročnika, z ločenimi podatkovnimi bazami. **SaaS** (ang. *Software-as-a-Service*) pa temelji na **večnajemniški arhitekturi** (ang. *multi-tenant*) — ena aplikacija in skupna infrastruktura služita več strankam hkrati, podatki pa so logično ločeni znotraj skupne baze.

### Odprta koda in zunanje izvajanje

**Odprtokodna programska oprema** ima odprto licenco in jo je mogoče prosto uporabljati, prilagajati ali razvijati. Predstavlja alternativo komercialni programski opremi.

**Zunanje izvajanje** (ang. *outsourcing*) pomeni, da IT storitve opravlja **zunanji izvajalec**. Prednosti so dostop do strokovnjakov, nižji stroški in hitrejši razvoj. Glavno tveganje pa je **izguba nadzora nad podatki**. Pri zunanjem izvajanju (zlasti pri offshore outsourcingu) se pojavljajo tudi skriti stroški — izbira dobavitelja, stroški prehoda, odpuščanje in zadrževanje kadrov, izguba produktivnosti, upravljanje pogodbe — ki lahko v najslabšem primeru skupni strošek povečajo tudi za **57 %** nad osnovno pogodbo.

---

## 4. Razvoj IS

### Razvoj rešitve informacijskega sistema

Razvoj IS rešitve poteka v treh fazah **sistemske analize** in fazi **implementacije**. Najprej je treba **opredeliti in razumeti problem** (identificirati vzroke, cilje rešitve in informacijske zahteve), nato **razviti alternativne rešitve** in **izbrati najboljšo**. Sledi **implementacija** — izdelava podrobnih specifikacij, pridobitev strojne opreme, razvoj ali pridobitev programske opreme, testiranje, priprava usposabljanja in dokumentacije, konverzija sistema ter evalvacija rešitve.

### Tradicionalni razvojni cikel (SDLC)

**SDLC** (ang. *Systems Development Life Cycle*) je klasičen pristop z zaporednimi fazami: **sistemska analiza** → **načrtovanje sistema** → **programiranje** → **testiranje** → **konverzija** → **produkcija in vzdrževanje**. Faze si sledijo zaporedno (ang. *waterfall*) — vsaka se zaključi pred začetkom naslednje. Prednost je strukturiranost, slabost pa togost in počasno odzivanje na spremembe zahtev.

### Prototipiranje

Prototipiranje je iterativni pristop k razvoju IS. Koraki so: identificiraj **osnovne zahteve**, razvij **delujoč prototip**, **uporabi** prototip, nato pa — če uporabnik ni zadovoljen — **izboljšaj** prototip in ponovi cikel. Ko je uporabnik zadovoljen, prototip postane **operativni sistem**. Prednost je hitrejša povratna informacija od uporabnikov, slabost pa tveganje, da prototip prerase v produkcijski sistem brez ustrezne arhitekture.

### Povzetek načinov razvoja IS

Organizacija ima na voljo več pristopov: **SDLC** (klasičen, strukturiran razvoj), **prototipiranje** (iterativen pristop), **razvoj s strani končnih uporabnikov** (ang. *end-user development*), **programski paketi oz. SaaS** (nakup ali najem rešitev) in **zunanje izvajanje** (ang. *outsourcing*).

### Primer: McAfee — avtomatizirano testiranje

McAfee, podjetje za varnostno programsko opremo, upravlja okolje s SAP ERP in več kot **40 poslovnimi sistemi**. Ob prehodu na **agilni razvoj** (2-tedenski sprinti) je ročno testiranje postalo prepočasno za količino sprememb. Uvedli so **avtomatizirano testiranje** (Worksoft Certify), kar je privedlo do prihranka približno **2.500 ur in 200.000 $** ter bolj zanesljivega testiranja kompleksnih medprocesnih tokov.

---

## 5. Projektno vodenje IS

### Kaj je projekt?

Projekt je **začasen** podvig z **unikatnim ciljem**, ki ima **primarnega naročnika in deležnike**, zahteva vire iz različnih področij, vključuje element **negotovosti** in ima **merila uspeha**. Projekt se razlikuje od procesa — projekt je enkraten (npr. odprtje nove restavracije), medtem ko je proces ponavljajoč (npr. nabava pisarniškega materiala).

### Trojna omejitev projekta

Vsak projekt omejujejo tri dimenzije: **čas**, **stroški** in **obseg** (ang. *scope*). Sprememba ene dimenzije neizogibno vpliva na ostali dve — npr. širitev obsega brez povečanja proračuna zahteva podaljšanje roka ali znižanje kakovosti.

### Procesi projektnega vodenja

Projektno vodenje obsega **5 procesov**: **iniciacija** (ang. *Initiating*) — zagon projekta, **načrtovanje** (ang. *Planning*) — opredelitev obsega, urnika in virov, **izvajanje** (ang. *Executing*) — izvedba načrtovanih aktivnosti, **spremljanje in nadzor** (ang. *Monitoring & Controlling*) — preverjanje napredka in prilagajanje ter **zaključek** (ang. *Closing*) — formalno zaprtje projekta.

### Projektni vodja

Projektni vodja upravlja več področij hkrati: **integracijo** (celostno vodenje), **obseg** (kaj je v projektu in kaj ne), **čas** (izpolnjevanje rokov), **stroške** (proračun), **kakovost** (standardi), **človeške vire** (dodeljevanje nalog, motiviranje), **komunikacije** (poročila deležnikom) in **tveganja** (načrt za obvladovanje tveganj). Ključne kompetence vključujejo vodstvene sposobnosti, komunikacijske veščine, tehnično kompetenco, sposobnost reševanja problemov in upravljanje prioritet.

### Orodja za projektno vodenje

**Ganttov diagram** prikazuje naloge na časovni osi — za vsako nalogo je vidno trajanje, zaporednost in dodelitev virov. Omogoča primerjavo med **načrtovanim** in **dejanskim** napredkom ter spremljanje odstopanj stroškov (varianca).

**Diagram PERT** (ang. *Program Evaluation Review Technique*) prikazuje naloge kot **mrežni diagram** z odvisnostmi med nalogami. Identificira **kritično pot** — najdaljše zaporedje odvisnih nalog, ki določa minimalno trajanje projekta. Vsaka zamuda na kritični poti zamakne celoten projekt.

### Primer: Al-Asasyah — implementacija ERP sistema

Podjetje Al-Asasyah je zamenjalo podedovane (ang. *legacy*) sisteme z ERP sistemom. Uporabili so **fazni pristop** (postopno uvajanje modulov), **prototipiranje** in skrbno **migracijo podatkov**. Kombinacija projektnih metod je pripeljala do uspešne implementacije.

### Uspešnost projektov IS

Projekti IS imajo **visoko stopnjo neuspeha**. Pogosti razlogi vključujejo: napačno oceno **poslovne vrednosti**, podcenjevanje **organizacijskih sprememb** in pomanjkljivo **projektno vodenje**. Uspešnost projekta je odvisna od **človeških faktorjev** (podpora vodstva, usposobljeni kadri, strategija za reševanje konfliktov), **organizacijskih faktorjev** (vključenost uporabnikov, usklajenost s poslovnimi cilji), **projektnih faktorjev** (jasen cilj, definiran obseg, integracija z obstoječimi sistemi), **faktorjev projektnega vodenja** (ustrezna metodologija, orodja, nadzor sprememb obsega) in **zunanjih faktorjev** (dogovori z dobavitelji in svetovalci).

---

## 6. Portfelj, tveganja in strateška negotovost

### Upravljanje portfelja projektov

**Portfelj projektov** predstavlja vse IT projekte v organizaciji. Cilj upravljanja portfelja je **izbrati prave projekte** — tiste, ki prinašajo največjo vrednost ob sprejemljivem tveganju. To je stalni proces, ki vključuje **izbor projektov**, **spremljanje napredka** in **ustavitev neuspešnih projektov**.

Kriteriji za izbiro projektov vključujejo: **prispevek h konkurenčni strategiji**, **donosnost investicije** (ROI) in **skladnost z regulativo ter zmanjševanje tveganja**.

### Analiza portfelja projektov IS

Projekte razvrstimo v matriko glede na **tveganje** (visoko/nizko) in **pričakovane koristi** (visoke/nizke). Projekti z nizkimi tveganji in visokimi koristmi so prioritetni za razvoj (ang. *identify and develop*). Projekti z visokimi tveganji in visokimi koristmi zahtevajo **previdno preučitev** (ang. *cautiously examine*). Projekti z nizkimi tveganji in nizkimi koristmi so rutinski, projekte z visokimi tveganji in nizkimi koristmi pa se velja **izogibati**.

---

## 7. Obnova po katastrofi in neprekinjeno poslovanje

### Obnova po nesreči (ang. *Disaster Recovery*)

Obnova po nesreči zajema **postopke za obnovo IT infrastrukture** po nepričakovanem dogodku. **Neprekinjeno poslovanje** (ang. *Business Continuity*) pa je širši koncept, ki zagotavlja, da organizacija **nadaljuje delo** tudi ob resnih motnjah. Ključni elementi obeh načrtov so: **varnostne kopije podatkov**, **nadomestna lokacija** (ang. *recovery site*), **postopki ponovnega zagona sistemov** in redno **testiranje načrtov**.

### Vrste nesreč in posledice

Nesreče, ki ogrožajo IS, vključujejo: **naravne katastrofe** (poplave, požari, potresi) — povzročajo uničenje infrastrukture in motnje dobavnih verig; **varnostne kršitve** (nepooblaščeni vdori, kraje podatkov, napadi z zavrnitvijo storitve) — ogrožajo zaupne podatke in funkcionalnost sistemov; **pandemije** — množična odsotnost zaposlenih; in **okoljske nevarnosti** (razlitje nevarnih snovi, sevanje) — onemogočajo delo v prostorih podjetja.

---

## 8. Tehnološki trendi in strateška negotovost

### Tehnološki trendi

Med ključnimi trendi, ki vplivajo na strateško načrtovanje IS, so: **avtonomne naprave** (roboti, droni, inteligentni agenti, ki opravljajo naloge, ki so jih tradicionalno opravljali ljudje), **razširjena analitika** (ang. *augmented analytics* — avtomatizirani algoritmi za odkrivanje skritih vzorcev v velikih količinah podatkov), **veriga blokov** (ang. *blockchain* — porazdeljena knjiga transakcij, ki jo delijo vsi udeleženci omrežja) in **digitalna etika ter zasebnost** (naraščajoča pozornost potrošnikov do vrednosti in zaščite osebnih podatkov).

### Človeški dejavnik pri strateškem načrtovanju

Strateško načrtovanje temelji na **človeških odločitvah**. Analitiki ocenjujejo trende, tehnologije in trg, a je napovedovanje prihodnosti inherentno **negotovo**. Na odločitve pogosto vplivajo **izkušnje**, **intuicija** in **kognitivne pristranskosti**.

### Kognitivne pristranskosti

| Pristranskost | Opis |
|---|---|
| **Potrditvena pristranskost** (ang. *Confirmation bias*) | Nagnjenje k iskanju informacij, ki potrjujejo obstoječe prepričanje, in ignoriranje nasprotnih dokazov |
| **Pretirana samozavest** (ang. *Overconfidence*) | Pretirano zaupanje v lastne ocene in napovedi |
| **Planiranje napake** (ang. *Planning fallacy*) | Podcenjevanje časa, potrebnega za dokončanje naloge |
| **Sidranje** (ang. *Anchoring*) | Pretirano zanašanje na prvi podatek, ne glede na njegovo relevantnost |
| **Razpoložljivostna pristranskost** (ang. *Availability bias*) | Ocenjevanje verjetnosti na podlagi primerov, ki nam najlažje pridejo na misel |
| **Pristranskost za nazaj** (ang. *Hindsight bias*) | Prepričanje, da je bil izid dogodka napovedljiv, čeprav v resnici ni bil |

### Dogodki črnega laboda

Dogodki **črnega laboda** (ang. *black swan events*) so nepredvidljivi, imajo velik vpliv in jih za nazaj pogosto razlagamo kot predvidljive. Strateško načrtovanje mora upoštevati, da nobena analiza ne more zajeti vseh možnih scenarijev — zato sta **odpornost** (ang. *resilience*) in **prilagodljivost** sistemov ključnega pomena.

---

## Ključni pojmi za ponavljanje

| Pojem | Definicija |
|---|---|
| **Tehnični dolg** | Posledica zanemarjanja posodabljanja IT; kopiči se in sčasoma povzroča velike operativne težave |
| **IT strateški načrt** | Dolgoročni načrt IT, ki podpira poslovno strategijo, usmerja arhitekturo in razporeja vire |
| **NPV** | Net Present Value — neto sedanja vrednost; primerja diskontirane prihodnje denarne tokove z začetno investicijo |
| **ROI** | Return on Investment — donosnost investicije |
| **Scoring model** | Model ocenjevanja alternativ na podlagi uteženih kriterijev |
| **Realna opcija** | Pristop, kjer fazna uvedba IS zmanjšuje tveganje — pilotni projekt omogoča odločanje na podlagi dejanskih rezultatov |
| **UCP** | Use Case Points — metoda za oceno obsega in stroškov razvoja IS na podlagi primerov uporabe |
| **Buy-off-the-shelf** | Nakup obstoječe aplikacije brez prilagoditev |
| **ASP** | Application Service Provider — ločena instanca aplikacije za vsakega naročnika |
| **SaaS** | Software-as-a-Service — večnajemniška arhitektura; ena aplikacija za več strank |
| **Outsourcing** | Zunanje izvajanje IT storitev pri zunanjem izvajalcu |
| **SDLC** | Systems Development Life Cycle — klasičen zaporedni razvojni cikel IS |
| **Prototipiranje** | Iterativni pristop k razvoju IS z zgodnjim delujočim prototipom |
| **Trojna omejitev** | Čas, stroški in obseg — tri medsebojno odvisne dimenzije vsakega projekta |
| **Ganttov diagram** | Časovni prikaz nalog projekta z vidom na trajanje, zaporednost in vire |
| **PERT diagram** | Mrežni diagram nalog z odvisnostmi; identificira kritično pot projekta |
| **Portfelj projektov** | Celota vseh IT projektov v organizaciji; cilj je izbrati prave projekte |
| **Disaster Recovery** | Postopki za obnovo IT infrastrukture po nesreči |
| **Business Continuity** | Zagotavljanje neprekinjenega poslovanja ob resnih motnjah |
| **Kognitivna pristranskost** | Sistematična napaka v presoji, ki vpliva na odločanje |
| **Črni labod** | Nepredvidljiv dogodek z velikim vplivom, ki ga za nazaj razlagamo kot predvidljivega |
