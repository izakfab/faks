# P6 — Arhitektura IS

**Predmet:** Osnove informacijskih sistemov (OIS) 2025/2026
**Predavatelj:** izr. prof. dr. Dejan Lavbič
**Datum predavanja:** 25. 3. 2026

---

## 1. Arhitektura IS kot poslovni koncept

### Zakaj je arhitektura IS pomembna?

Arhitektura IS ni le tehnična zadeva — je **poslovni koncept**, ki neposredno vpliva na uporabniško izkušnjo, operativno učinkovitost in konkurenčno prednost. Odločitve o arhitekturi določajo, kako organizacija zbira, obdeluje, shranjuje in distribuira podatke, ter kakšne storitve lahko ponudi strankam.

### Primer: Grab — arhitektura kot poslovni model

Grab je »superapp« platforma, ki združuje prevoz, dostavo in finančne storitve. Njegova arhitektura temelji na **mobilni arhitekturi** (Android/iOS), **oblaku** (AWS — Redshift, ElastiCache) in **podatkovno vodenem sistemu** z analitiko ter geohashingom za optimizacijo. Grab je razvil tudi lastne storitve — **GrabMaps** za lokacijsko inteligenco. Primer kaže, da arhitektura ni le infrastruktura, ampak temelj celotnega poslovnega modela.

### Primer: Disney — arhitektura kot uporabniška izkušnja

Disney uporablja IT arhitekturo za povezovanje digitalne in fizične izkušnje v zabaviščnih parkih. **Mobilna aplikacija** omogoča planiranje, navigacijo in podatke v realnem času s personalizacijo in priporočili. **MagicBand+** služi za dostop in plačila. Rezultat je prepletena **digitalna + fizična izkušnja**, ki izboljšuje uporabniško izkušnjo (UX) in hkrati povečuje prihodke.

---

## 2. IT infrastruktura kot temelj IS

### Pet ključnih komponent IT infrastrukture

IT infrastruktura je **platforma za IS** in jo sestavljajo:

- **Strojna oprema** (ang. *hardware*) — računalniki, strežniki, omrežne naprave.
- **Programska oprema** (ang. *software*) — operacijski sistemi, aplikacije.
- **Upravljanje podatkov** (ang. *data management*) — baze podatkov, podatkovni sistemi.
- **Telekomunikacije in omrežja** (ang. *telecommunications and networking*) — LAN, WAN, internet.
- **Tehnološke storitve** (ang. *technology services*) — podpora, vzdrževanje, svetovanje.

Vseh pet komponent mora biti **medsebojno usklajenih**, da lahko učinkovito podpirajo poslovne procese.

### Strojna oprema: osnovni gradniki

Osnovna arhitektura računalnika sledi shemi: **Input → Processing (CPU) → Output**, s **Storage** (pomnilnik/disk) povezanim s procesno enoto. Vhodne naprave (tipkovnica, miška, čitalci črtne kode, RFID, mikrofoni, kamere, senzorji) zajemajo podatke, ki jih procesor obdela, rezultate pa prikažejo izhodne naprave (zasloni, tiskalniki, zvočniki).

### Procesiranje in računalniške arhitekture

Zmogljivost pomnilnika merimo v enotah od kilobajta do eksabajta:

| Enota | Okrajšava | Kapaciteta (v bajtih) | Primer |
|---|---|---|---|
| Kilobyte | KB | 1.024 | kratko e-poštno sporočilo |
| Megabyte | MB | 1.024² | digitalna pesem (~3 MB) |
| Gigabyte | GB | 1.024³ | ~1 ura TV posnetka (ne HD) |
| Terabyte | TB | 1.024⁴ | ~150 ur HD video posnetka |
| Petabyte | PB | 1.024⁵ | ~1,5 mio. CD-ROM diskov |
| Exabyte | EB | 1.024⁶ | ~11 mio. filmov v 4K formatu |

### Vrste računalnikov

Računalnike razvrščamo po **procesni moči**:

- **Superračunalniki** — za znanstvene izračune, big data in simulacije.
- **Osrednji računalniki** (ang. *mainframes*) — za množične transakcije (banke, rezervacijski sistemi).
- **Strežniki** — za podporo omrežjem in aplikacijam.
- **PC / prenosnik** — za osebno delo.
- **Mobilne naprave** — pametni telefoni, tablice, nosljive naprave (ang. *wearables*).

Trend razvoja: **centralizacija → porazdeljenost → mobilnost**.

---

## 3. Arhitekturni modeli in razvoj IS

### Poslovno-informacijska arhitektura (ang. *Enterprise Architecture*)

Poslovno-informacijska arhitektura izhaja iz **poslovnega poslanstva** (ang. *business mission*) organizacije in vodi **podatkovno**, **aplikacijsko** in **tehnološko** arhitekturo. Predstavlja **celostno sliko** organizacije in služi kot **načrt za prihodnji razvoj** IS.

### Arhitektura odjemalec/strežnik (ang. *Client/Server*)

V arhitekturi odjemalec/strežnik **odjemalec** (ang. *client*) skrbi za uporabniški vmesnik, **strežnik** (ang. *server*) pa za podatke in storitve. Obdelava je **porazdeljena** med obe strani. To je standardni model delovanja interneta.

### Večnivojska arhitektura (ang. *N-tier Architecture*)

Večnivojska arhitektura razdeli sistem na ločene plasti:

- **Odjemalec** — uporabniški dostop (brskalnik, aplikacija).
- **Spletni strežnik** — prikaz spletnih strani.
- **Aplikacijski strežnik** — poslovna logika.
- **Podatkovna baza** — shranjevanje podatkov.

Glavna prednost je **ločitev funkcionalnosti** — vsako plast lahko neodvisno nadgrajujemo, skaliramo ali zamenjamo, ne da bi vplivali na ostale. To zagotavlja večjo prilagodljivost in lažje vzdrževanje.

### Spletni formati

- **HTML** (HyperText Markup Language) — služi za **prikaz vsebine** na spletnih straneh. HTML oznake opisujejo, kako se podatek prikaže (npr. `<TITLE>`, `<LI>`).
- **XML** (eXtensible Markup Language) — služi za opis **pomena podatkov** in njihovo izmenjavo med sistemi. XML oznake opisujejo, kaj podatek pomeni (npr. `<PRICE CURRENCY="USD">`).

### Spletne storitve in SOA

**Spletne storitve** (ang. *web services*) omogočajo komunikacijo med različnimi sistemi prek interneta z uporabo standardnih protokolov. **SOA** (Service-Oriented Architecture) je arhitekturni pristop, kjer so poslovne funkcije razdeljene v **neodvisne storitve**, ki jih lahko različni sistemi (tudi zunanji partnerji) kličejo in kombinirajo. Primer: sistem letalske družbe, potovalne agencije in rent-a-car podjetja si prek spletnih storitev izmenjujejo podatke.

---

## 4. Programska oprema in razvoj rešitev

### Vrste programske opreme

Programsko opremo delimo na dve glavni kategoriji:

- **Sistemska programska oprema** — vključuje **operacijski sistem** (upravlja strojno opremo in procese), **jezične prevajalnike** (ang. *language translators*) in **pomožne programe** (ang. *utility programs*) za varnost, upravljanje datotek, čiščenje diska ipd.
- **Aplikativna programska oprema** — vključuje programske jezike, aplikacije ter programske pakete in storitve za končne uporabnike.

### Operacijski sistemi

Operacijski sistem upravlja **strojno opremo in procese** ter omogoča **interakcijo uporabnika** z računalnikom.

| Operacijski sistem | Značilnosti |
|---|---|
| **Windows 11** | Najnovejši Microsoftov odjemalski OS; poenostavljen vmesnik, varnost, podpora Android aplikacijam |
| **Windows Server** | Strežniški operacijski sistem |
| **UNIX** | Za delovne postaje in strežnike; večopravilnost, večuporabniškost, prenosljivost |
| **Linux** | Odprtokodna alternativa; prilagodljiv, deluje na različni strojni opremi |
| **macOS** | Operacijski sistem za računalnike Apple; vizualno prijazen |

### Aplikativna programska oprema

| Kategorija | Zmogljivosti | Primeri |
|---|---|---|
| Urejevalnik besedil | Urejanje in oblikovanje dokumentov | Microsoft Word, Apple Pages |
| Preglednica | Organizacija podatkov v vrstice/stolpce; kaj-če analiza | Microsoft Excel, Apple Numbers |
| Upravljanje podatkov | Shranjevanje, iskanje in manipulacija podatkov | Microsoft Access, FileMaker Pro |
| Predstavitve | Izdelava grafično bogatih diapozitivov | Microsoft PowerPoint, Apple Keynote |
| Upravljanje osebnih informacij | Koledar, naloge, kontakti, e-pošta | Microsoft Outlook, Google Calendar |
| Sodelovanje | Deljenje dokumentov, virtualni sestanki | Microsoft Teams, Google Drive |

### Kako nastane programska oprema?

Razvoj programske opreme je **sodelovalen proces**, v katerem sodelujejo programerji, analitiki in uporabniki. Za zapis izvorne kode se uporabljajo **programski jeziki** (C++, Java, JavaScript, Python itd.). Med pristopi razvoja prevladuje **objektno usmerjeno programiranje**, ki poudarja modularnost in ponovno uporabo.

Načini pridobitve programske opreme so: **COTS** (ang. *Commercial Off-The-Shelf*) — kupljena gotova rešitev, **SaaS** — najem programske opreme kot storitve, **lasten razvoj** — razvoj po meri ter **odprta koda** (ang. *open source*).

### Ključni izzivi programske opreme

- **Napake** — veliko napak v kodi zahteva temeljito testiranje.
- **Licenciranje** — zakonita uporaba, boj proti piratstvu, upravljanje licenc.
- **Posodobitve in agilnost** — hitre spremembe, **DevOps**, low-code platforme.
- **Odprti sistemi (API)** — povezovanje sistemov, »best-of-breed« pristop.
- **Open-source vs. lastniška oprema** — odprta koda prinaša prilagodljivost in nižje stroške, lastniška oprema ponuja podporo in garancije.

### Trendi programske opreme

Trije ključni premiki v razvoju programske opreme:

- Od **lastništva** → do **storitve** — računalništvo v oblaku nadomešča lokalno nameščeno programsko opremo.
- Od **zaprtih** → do **odprtih** rešitev — odprtokodna programska oprema postaja mainstream.
- Od **monolita** → do **modularnosti** — aplikacije, mash-up pristopi in mikrostoritve.

---

## 5. Evolucija arhitektur

### Od mainframov do oblaka

Razvoj IT arhitektur je potekal v treh fazah:

- **1960-a: Mainframe arhitektura** — osrednji računalnik z neumnimi terminali (ang. *dumb terminals*) in telefonom PBX. Vsa obdelava je bila centralizirana.
- **1980–2000-a: Odjemalec/strežnik arhitektura** — podatkovni center s strežniki, hub, namizni računalniki s telefoni. Obdelava je bila porazdeljena med odjemalcem in strežnikom.
- **2000-a naprej: Računalništvo v oblaku** — oblačne platforme in storitve, brezžični usmerjevalniki, namizni računalniki, prenosniki in pametni telefoni. Dostop od kjerkoli, prek katerekoli naprave.

---

## 6. Sodobni trendi strojne opreme

### Mobilne platforme

Pametni telefoni, tablice in nosljive naprave (ang. *wearables*) omogočajo **dostop do IS kjerkoli**. Mobilnost je danes ključni dejavnik arhitekturnih odločitev.

### Lastne naprave — BYOD (Bring Your Own Device)

BYOD pomeni uporabo **osebnih naprav zaposlenih** za delo. Prednost je **povečana produktivnost**, tveganje pa predstavljajo varnostne grožnje in izzivi upravljanja naprav.

### Virtualizacija

Virtualizacija omogoča poganjanje **več sistemov na enem strežniku** z uporabo programske plasti (hipervizorja). Rezultat je **višja izkoriščenost** strojne opreme in **nižji stroški**.

### Robno računalništvo (ang. *Edge Computing*)

Robno računalništvo pomeni obdelavo podatkov **blizu vira** (senzorji, kamere, IoT naprave). Prednosti so **manj zakasnitev** (ang. *latency*) in **manj prenosa** podatkov do oblaka. Odločanje poteka v **realnem času**, kar je ključno za aplikacije, kot so pametna mesta, upravljanje prometa in pametna razsvetljava.

### Zeleno računalništvo (ang. *Green Computing*)

Zeleno računalništvo stremi k **nižji porabi energije** in **manjšemu vplivu na okolje**. To dosegamo z virtualizacijo, oblakom in učinkovitimi podatkovnimi centri.

### Visokozmogljivo računalništvo

Med napredne smeri sodijo: **kvantno računalništvo**, **nanotehnologija**, **večjedrni procesorji** in **energijsko učinkoviti čipi**.

### Pametna mesta in robno računalništvo

Pametna mesta uporabljajo **IKT, IoT in podatke** za boljše storitve za občane. Robno računalništvo v tem kontekstu omogoča analizo **blizu vira** (senzorji, kamere), odločanje v **realnem času** z manj zakasnitvami. Primeri uporabe so upravljanje prometa (zastoji, nesreče) in pametna razsvetljava. Učinki so boljša **operativna učinkovitost**, **odločanje** in **kakovost življenja**.

---

## 7. Računalništvo v oblaku

### Kaj je računalništvo v oblaku?

Računalništvo v oblaku (ang. *cloud computing*) pomeni dostop do računalniških virov (strežnikov, pomnilnika, aplikacij) **prek interneta**, brez lastne fizične infrastrukture. Oblačni ponudniki (AWS, Azure, Google Cloud) upravljajo strežniške farme po vsem svetu.

### Vrste oblakov

| Vrsta | Opis | Primeren za |
|---|---|---|
| **Javni oblak** | Deljeni viri, dostopni vsem; upravljajo ga tretji ponudniki | Podjetja brez večjih zahtev po zasebnosti; pay-as-you-go model |
| **Zasebni oblak** | Namenjen eni organizaciji; upravljan interno ali pri zasebnem ponudniku | Podjetja s strogimi zahtevami po zasebnosti in varnosti |
| **Hibridni oblak** | Kombinacija javnega in zasebnega oblaka | Podjetja, ki želijo del nadzora ohraniti interno, del pa prenesti v javni oblak |
| **Vertikalni oblak** | Prilagojen specifični panogi | Specializirane industrije z regulativnimi zahtevami |

### Storitveni modeli: IaaS, PaaS, SaaS

| Model | Kaj ponudnik upravlja | Kaj upravlja uporabnik | Primeri |
|---|---|---|---|
| **IaaS** (Infrastructure as a Service) | Strežnike, omrežja, shranjevanje, virtualizacijo | Aplikacije, podatke, vmesno programsko opremo, operacijski sistem | Amazon AWS, IBM, Google, Microsoft |
| **PaaS** (Platform as a Service) | Vse do operacijskega sistema vključno | Aplikacije in podatke | Microsoft Azure, Google App Engine |
| **SaaS** (Software as a Service) | Celoten sklad — vse upravlja ponudnik | Uporabnik le uporablja končno aplikacijo | Salesforce, Google Apps, Dropbox, Apple iCloud |

Razlika med njimi je v tem, **koliko plasti upravlja ponudnik in koliko uporabnik**. Pri **on-premise** (lokalni namestitvi) uporabnik upravlja vse sam.

### Dodatne oblačne storitve

- **SECaaS** (Security as a Service) — varnost kot storitev: antivirus, DLP (Data Loss Prevention), IDS (Intrusion Detection System), zaščita migracij.
- **FaaS / XaaS** (Function / Everything as a Service) — funkcije kot storitev; dogodkovno proženje (ang. *event-driven*), »serverless« arhitektura.
- **Low-code / no-code** — razvoj brez programiranja; omogoča hitrejše reševanje poslovnih problemov tudi neprogramerjem.

### Prednosti računalništva v oblaku

- **Dostop od kjerkoli** — neodvisno od naprave ali lokacije.
- Boljše **sodelovanje** in produktivnost.
- **Nižji stroški** — model plačila po porabi (ang. *pay-per-use*), brez velikih začetnih investicij (CAPEX).
- Hitra **skalabilnost** — viri se prilagajajo potrebam (navzgor ali navzdol).
- Večja **fleksibilnost** in agilnost.
- Hitrejši **razvoj in uvedba** rešitev.

### Tveganja računalništva v oblaku

- **Podedovani sistemi** (ang. *legacy systems*) — težka migracija obstoječih sistemov v oblak.
- **Zanesljivost** — možni izpadi oblačnih storitev.
- **Zasebnost** — omejen nadzor nad podatki.
- **Varnost** — vprašanja dostopa, izolacije in napadov.
- **Pravni vidik** — regulativa in lokacija podatkov (npr. GDPR zahteve glede shranjevanja podatkov v EU).
- **Zlorabe** — izkoriščanje oblačnih virov za kriminalne namene.

### Ponudniki in izbira okolja

| Ponudnik | Prednost |
|---|---|
| **AWS** | Največja ponudba storitev, zrel ekosistem, močna infrastruktura |
| **Microsoft Azure** | Integracija z Microsoft okoljem, hibridne rešitve |
| **Google Cloud** | Močan na področju AI/ML in Kubernetes |

Vsi trije ponujajo **IaaS + PaaS + serverless** po podobnih cenah. Izbira je odvisna od **primera uporabe** in **obstoječega IT okolja** organizacije.

---

## 8. Strateška vprašanja pri upravljanju IT infrastrukture

### Skupni stroški lastništva (ang. *Total Cost of Ownership — TCO*)

TCO zajema vse stroške, povezane z IT, skozi celotno življenjsko dobo:

| Komponenta TCO | Opis |
|---|---|
| **Nakup strojne opreme** | Cena računalnikov, zaslonov, tiskalnikov, pomnilniških naprav |
| **Nakup programske opreme** | Licenciranje za vsakega uporabnika |
| **Namestitev** | Stroški namestitve opreme in migracije v oblak |
| **Usposabljanje** | Izobraževanje IT strokovnjakov in končnih uporabnikov |
| **Podpora** | Tekoča tehnična podpora in helpdesk |
| **Vzdrževanje** | Nadgradnje strojne in programske opreme |
| **Infrastruktura** | Omrežja, varnostne kopije, specialna oprema |
| **Izpadi** (ang. *downtime*) | Izgubljena produktivnost ob napakah sistema |
| **Prostor in energija** | Nepremičnine in elektrika za podatkovne centre |

### Ključni izzivi upravljanja IT

- **Načrtovanje kapacitet** — zagotavljanje dovolj zmogljivosti za rast.
- **Razširljivost** (ang. *scalability*) — sistem mora prenesti povečano število uporabnikov.
- **Lastništvo vs. najem** — odločitev med lastno infrastrukturo in outsourcingom ali oblakom.
- **Mobilne naprave (BYOD)** — izzivi varnosti in upravljanja naprav (MDM — Mobile Device Management).
- **Globalni sistemi** — prilagajanje jezikom in kulturam (lokalizacija).

---

## 9. Napredne tehnologije in prihodnost

### AR / VR / MR — primeri uporabe

| Področje | AR | VR |
|---|---|---|
| **Izobraževanje in usposabljanje** | Interaktivni učbeniki, 3D modeli | Pilotni simulatorji, medicinski trening |
| **Industrija in inženiring** | Načrtovanje (BMW, Airbus) | — |
| **Trgovina in marketing** | »Try-on« (očala, kozmetika) | Virtualni ogledi (pohištvo) |
| **Zdravstvo** | AR/MR: podpora operacijam | VR: terapije in rehabilitacija |

### Kvantno računalništvo

Kvantno računalništvo temelji na **qubitih** namesto bitov. Qubit je lahko **hkrati 0 in 1** (superpozicija), kar prinaša potencial za **eksponentno procesno moč**. Področja z največjim potencialom so kriptografija, medicina in finance.

### Trendi in strateška vprašanja

Splošni trend strojne opreme: **manjše, hitrejše, cenejše, zmogljivejše**. To prinaša dilemo — **kupiti zdaj ali kasneje**? Strateški vidiki vključujejo: nadgradnje in vpliv na produktivnost, delo na daljavo, BYOD in **DaaS** (Desktop as a Service).

---

## Ključni pojmi za ponavljanje

| Pojem | Definicija |
|---|---|
| **IT infrastruktura** | Pet ključnih komponent (strojna oprema, programska oprema, upravljanje podatkov, telekomunikacije, tehnološke storitve), ki tvorijo platformo za IS |
| **Enterprise Architecture** | Celostna poslovno-informacijska arhitektura, ki povezuje poslovno poslanstvo s podatkovno, aplikacijsko in tehnološko arhitekturo |
| **Odjemalec/strežnik** | Arhitekturni model, v katerem odjemalec skrbi za vmesnik, strežnik pa za podatke in storitve |
| **N-tier arhitektura** | Večnivojska arhitektura z ločenimi plastmi (odjemalec, spletni strežnik, aplikacijski strežnik, podatkovna baza) |
| **HTML** | Označevalni jezik za prikaz vsebine na spletnih straneh |
| **XML** | Označevalni jezik za opis pomena podatkov in izmenjavo med sistemi |
| **SOA** | Service-Oriented Architecture — arhitektura z neodvisnimi storitvami, ki komunicirajo prek standardnih protokolov |
| **Virtualizacija** | Tehnologija za poganjanje več virtualnih sistemov na enem fizičnem strežniku |
| **Računalništvo v oblaku** | Dostop do računalniških virov (strežnikov, pomnilnika, aplikacij) prek interneta |
| **IaaS** | Infrastructure as a Service — najem infrastrukture (strežniki, omrežja, shranjevanje) |
| **PaaS** | Platform as a Service — najem platforme (vključno z OS) za razvoj aplikacij |
| **SaaS** | Software as a Service — najem končne aplikacije brez skrbi za infrastrukturo |
| **FaaS / Serverless** | Function as a Service — izvajanje posameznih funkcij brez upravljanja strežnikov |
| **BYOD** | Bring Your Own Device — uporaba osebnih naprav zaposlenih za delo |
| **TCO** | Total Cost of Ownership — skupni stroški lastništva IT skozi celotno življenjsko dobo |
| **Robno računalništvo** | Edge Computing — obdelava podatkov blizu vira za manj zakasnitev |
| **Zeleno računalništvo** | Green Computing — zmanjševanje okoljskega vpliva IT z energijsko učinkovitimi praksami |
| **Kvantno računalništvo** | Računalništvo na podlagi qubitov, ki so lahko hkrati v stanju 0 in 1 (superpozicija) |
| **Scalability** | Razširljivost — zmožnost sistema, da prenese povečano obremenitev |
| **MDM** | Mobile Device Management — upravljanje mobilnih naprav v organizaciji |
| **COTS** | Commercial Off-The-Shelf — kupljena gotova programska rešitev |
| **DevOps** | Pristop, ki združuje razvoj in operacije za hitrejše in zanesljivejše uvajanje sprememb |
| **Low-code / No-code** | Platforme za razvoj aplikacij brez ali z minimalnim programiranjem |
| **DaaS** | Desktop as a Service — najem virtualnega namizja v oblaku |
| **SECaaS** | Security as a Service — varnostne storitve v oblaku |
