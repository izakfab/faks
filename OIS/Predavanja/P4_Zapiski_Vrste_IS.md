# P4 — Vrste informacijskih sistemov

**Predmet:** Osnove informacijskih sistemov (OIS) 2025/2026
**Predavatelj:** izr. prof. dr. Dejan Lavbič
**Datum predavanja:** 11. 3. 2026

---

## 1. Operativni informacijski sistemi

### Monolitni sistemi in sprememba pričakovanj

V 90. letih so bili poslovni IS (npr. bančni) večinoma **monolitni** — en ponudnik, ena integrirana platforma. Takšni sistemi so bili stabilni, a **težko prilagodljivi**. Po letu 2000 so se pričakovanja uporabnikov korenito spremenila: spletno bančništvo, mobilne aplikacije in nove digitalne storitve so zahtevale bolj **prilagodljive informacijske sisteme**.

### Sistem za obdelavo transakcij (TPS)

**Transakcija** je poslovni dogodek, ki generira podatke (npr. skeniranje izdelka na blagajni, vplačilo na bančnem računu). **TPS** (ang. *Transaction Processing System*) zbira in obdeluje transakcijske podatke. Podatki iz TPS se shranijo v **organizacijsko bazo podatkov**, od koder jih nato uporabljajo drugi sistemi — FAIS, DSS, BI, nadzorne plošče in ekspertni sistemi. TPS poleg tega generira tudi podrobna **poročila** o opravljenih transakcijah.

### Centraliziran vs. decentraliziran IT

Organizacija IT funkcije v podjetju je lahko zasnovana na tri načine:

**Centraliziran IT** pomeni en centralni IT oddelek, ki skrbi za celotno organizacijo. Prednosti so standardizacija, nižji stroški ter boljši nadzor in varnost.

**Decentraliziran IT** pomeni, da IT odločitve sprejemajo posamezni poslovni oddelki. To omogoča hitrejše odločanje in boljšo prilagoditev specifičnim potrebam oddelkov.

Danes je najpogostejši **hibridni model** — centralno se upravljajo varnost, standardi in infrastruktura, medtem ko oddelki sami izbirajo aplikacije in rešitve, ki jih potrebujejo.

---

## 2. Funkcionalni informacijski sistemi (FAIS)

### Kaj so FAIS?

**FAIS** (ang. *Functional Area Information Systems*) so sistemi, ki podpirajo posamezna **funkcionalna področja** organizacije. Njihov namen je povečevanje **učinkovitosti in uspešnosti** procesov ter zagotavljanje **poročil in informacij za managerje**. Primeri funkcionalnih področij: računovodstvo, finance, proizvodnja/operacije, marketing in človeški viri.

### IS za računovodstvo in finance

Računovodski in finančni IS upravljajo **denarne tokove in transakcije**, podpirajo **proračun in načrtovanje** ter omogočajo **nadzor, revizijo in poročanje**. Tipični moduli vključujejo nabavo, obveznosti do dobaviteljev, terjatve do kupcev, upravljanje sredstev, glavno knjigo in finančno poročanje (rutinska poročila, izjemna poročila, skladnost z regulativo in finančno analitiko).

### IS za proizvodnjo in operacije

Namen teh sistemov je pretvorba **vhodov v izhodne proizvode ali storitve** ter upravljanje operacij in dobavne verige. Podpirajo področja kot so **logistika**, **planiranje proizvodnje**, **CIM** (računalniško integrirana proizvodnja) in **PLM** (upravljanje življenjskega cikla izdelka). Med novejšimi tehnologijami se pojavlja **veriga blokov** (blockchain), ki omogoča boljšo sledljivost, upravljanje zalog in varnost.

### IS za upravljanje človeških virov (HRIS)

**HRIS** (ang. *Human Resource Information System*) podpira ključne kadrovske funkcije: **zaposlovanje**, **razvoj zaposlenih**, **planiranje** in **upravljanje kadrov**. Konkretni primeri vključujejo spletno zaposlovanje, ocenjevanje zaposlenih, usposabljanje ter obračun plač in ugodnosti. Sodobni HRIS sistemi vključujejo tudi **analitiko talentov** — nadzorne plošče, ki prikazujejo kadrovske metrike kot so stopnja prostih delovnih mest po lokaciji, status kandidatov, zadrževanje zaposlenih po oddelkih in odstotek dokončanih izobraževanj.

### IS po funkcionalnih področjih in ravneh

FAIS delujejo na treh ravneh — **operativni**, **taktični** in **strateški** — za vsako funkcionalno področje:

| Raven | Računovodstvo | Finance | Človeški viri | Proizvodnja/operacije | Marketing |
|---|---|---|---|---|---|
| **Strateška** | načrtovanje dobičkonosnosti | finančno načrtovanje | planiranje zaposlovanja, outsourcing | upravljanje življenjskega cikla izdelka | napovedovanje prodaje, načrtovanje oglaševanja |
| **Taktična** | revizija, proračun | upravljanje naložb | administracija ugodnosti, ocenjevanje uspešnosti | nadzor kakovosti, upravljanje zalog | odnosi s strankami, avtomatizacija prodaje |
| **Operativna** | plače, obveznosti, terjatve | upravljanje denarnih tokov, finančne transakcije | vzdrževanje kadrovske evidence | izpolnjevanje naročil, obdelava naročil | oblikovanje cen, profiliranje strank |

---

## 3. Integrirani poslovni sistemi (ERP)

### Problem informacijskih silosov

Ko ima vsak oddelek **svoj ločen informacijski sistem**, nastanejo **informacijski silosi** — podatki so razpršeni, nekonsistentni in nedostopni med oddelki. To otežuje koordinacijo, podvaja delo in onemogoča celovit pogled na poslovanje.

### Kaj je ERP?

**ERP** (ang. *Enterprise Resource Planning*) je integriran poslovni sistem, ki **povezuje funkcionalna področja** organizacije. Uporablja **skupno podatkovno bazo**, kar omogoča nemoten **pretok informacij med oddelki**. Med najpomembnejšimi ponudniki ERP sistemov sta **SAP** in **Oracle**.

### Moduli ERP sistema

ERP sistemi so sestavljeni iz **jedrnih** in **razširjenih** modulov:

**Jedrni moduli** vključujejo **finančno upravljanje** (računovodstvo, poročanje, proračun, upravljanje sredstev), **upravljanje operacij** (planiranje proizvodnje, nabava, zaloge, logistika, kontrola kakovosti) in **upravljanje človeških virov** (kadrovanje, razvoj, plače, ocenjevanje uspešnosti).

**Razširjeni moduli** zajemajo **CRM** (upravljanje odnosov s strankami — zvestoba, retencija, integriran pogled na stranko), **SCM** (upravljanje dobavne verige — informacijski tokovi med fazami), **poslovno analitiko** (zbiranje in analiza podatkov za odločanje) ter **e-poslovanje** (spletni dostop do ERP informacij za stranke in dobavitelje — B2C in B2B kanali).

### Pristopi k integraciji ERP

Pri implementaciji ERP obstajajo trije pristopi k integraciji:

**The engineered suite** — sistem je zgrajen od začetka s konsistentnim vmesnikom, integrirano bazo in enotno arhitekturo. Prednost je visoka integriteta podatkov, slabost pa visoka soodvisnost modulov in drago preklapljanje.

**Suite with synchronized modules** — ponudnik zagotovi vmesno opremo (middleware), ki povezuje in sinhronizira sisteme na različnih platformah. Prednost je skupna arhitektura, slabost pa krhke povezave med moduli.

**Best of breed** — ločeni, posamično izbrani sistemi, ki najbolje ustrezajo potrebam. Moduli imajo bogato funkcionalnost in nižje posamično tveganje, a integracija je šibka, sinhronizacija zahtevna in draga.

### Prednosti in omejitve ERP

ERP prinaša številne prednosti: večjo **povezanost procesov**, boljšo **podporo odločanju** ter večjo **učinkovitost in kakovost**. Hkrati pa ima omejitve: organizacija mora prilagoditi procese **najboljšim praksam ERP** (namesto obratno), uvedba je povezana z **visokimi stroški** in **zahtevno implementacijo**, vedno pa obstaja tveganje **neuspešne implementacije**.

### Implementacija ERP sistemov

Pri uvedbi ERP sta na voljo dva osnovna pristopa. **On-premise** implementacija ima tri različice: **vanilla** (standardna konfiguracija brez prilagoditev), **custom** (prilagojena rešitev specifičnim potrebam) in **best-of-breed** (kombinacija modulov različnih ponudnikov). Alternativa je **ERP v oblaku**, ki omogoča dostop prek interneta, ne zahteva lastne infrastrukture in ponuja **skalabilnost**.

### ERP in poslovni procesi

ERP povezuje poslovne procese znotraj organizacije. Trije ključni procesi so:

**Nabava** — od zahtevka za nakup (warehouse) prek naročilnice (purchasing) do prejema blaga in plačila (accounting).

**Prodaja** — od povpraševanja stranke in ponudbe prek naročila in priprave za odpremo do izdaje računa in prejema plačila.

**Proizvodnja** — od planiranega naročila prek proizvodnega naloga, izdaje materiala iz skladišča do izdelave in prejema končnih izdelkov.

Vsi trije procesi so v ERP **medsebojno povezani** — če ob povpraševanju stranke ni dovolj končnih izdelkov, se sproži proizvodni proces; če ni dovolj surovin, se sproži nabavni proces.

### Poslovna vrednost ERP

ERP prinaša **operativno učinkovitost** (standardizacija procesov, boljša koordinacija oddelkov, manj zalog in napak) ter **podporo odločanju** (enotni podatki za celotno podjetje, boljše napovedi prodaje in proizvodnje, analiza uspešnosti poslovanja).

### Primer: J&J Snack Foods

J&J Snack Foods je leta 2022 nadgradil ERP sistem (JD Edwards) z namenom boljše dobavne verige in integracije poslovanja. Implementacija je kratkoročno povzročila izpad 20 mio $ prodaje in 4,5 mio $ dobička. Po stabilizaciji sistema pa je podjetje doseglo rekordno četrtletno prodajo, izboljšano operativno učinkovitost in višjo maržo. Primer nazorno pokaže, da je uvedba ERP kratkoročno tvegana, a dolgoročno donosna.

### Primer: Versum — digitalna preobrazba ERP

Versum se je po ločitvi od matičnega podjetja znašel pred problemom — odvisen od starega sistema in z neustreznim ERP za nov poslovni model. Rešitev je bila uvedba **SAP S/4HANA v zasebnem oblaku** s standardnimi procesi brez večjih prilagoditev. Rezultat so bili enotni poslovni procesi, analitika v realnem času in podpora globalni dobavni verigi.

---

## 4. Upravljanje dobavne verige (SCM)

### Kaj je dobavna veriga?

Dobavna veriga je mreža organizacij in procesov, ki zajema celoten tok od surovin do končnega kupca. Vključuje **upstream** (dobavitelji več nivojev — Tier 3, Tier 2, Tier 1) in **downstream** (distributer, trgovec, končni kupec). V upstream smeri tečejo informacije o kapacitetah, zalogah, dobavnih rokih in plačilnih pogojih. V downstream smeri pa tečejo naročila, zahtevki za vračila, popravila in plačila.

### Učinek biča (ang. *Bullwhip Effect*)

Učinek biča je pojav, ko se majhne spremembe v povpraševanju končnih kupcev eksponentno **povečajo** vzdolž dobavne verige navzgor. Če se povpraševanje kupcev poveča za 5 %, proizvajalec pogosto naroči bistveno več, ker želi zagotoviti varnostno zalogo, kompenzirati negotovost in se zaščititi pred morebitnim izpadom. Posledica je prekomerno naročanje, prevelike zaloge in neučinkovitost. Rešitev je **boljša vidljivost podatkov** vzdolž celotne verige.

### Programska oprema in tehnologije SCM

SCM sistemi se delijo na dva dela: **SCP** (Supply Chain Planning — planiranje) in **SCE** (Supply Chain Execution — izvajanje). Specifični sistemi vključujejo **WMS** (Warehouse Management System — upravljanje skladišča) in **TMS** (Transportation Management System — upravljanje transporta). Med ključnimi tehnologijami so **RFID/IoT** (sledenje izdelkov v realnem času), **GPS** (sledenje vozil in pošiljk), **črtne kode** (identifikacija), **droni** in **robotika** (avtomatizirana skladišča in dostava).

### Vrste dobavnih verig: Push vs. Pull

**Push model** temelji na **napovedih** — dobavitelj dobavlja na podlagi napovedi, proizvajalec proizvaja na podlagi napovedi, distributer in trgovec vzdržujeta zaloge na podlagi napovedi, kupec pa kupi, kar je na policah.

**Pull model** temelji na **dejanskem povpraševanju** — kupec odda naročilo, trgovec avtomatsko dopolnjuje zalogo, distributer avtomatsko dopolnjuje skladišče, proizvajalec proizvaja po naročilu, dobavitelj dobavlja po naročilu. Pull model zmanjšuje zaloge in učinek biča.

### Poslovna vrednost SCM

SCM sistemi organizacijam prinašajo boljše **usklajevanje ponudbe in povpraševanja**, nižje **zaloge in stroške** dobavne verige, hitrejši **čas prihoda izdelka na trg** ter boljšo **razpoložljivost izdelkov za kupce**.

### Primer: Lenzing — trajnostno usklajevanje ponudbe in povpraševanja

Lenzing, proizvajalec trajnostnih celuloznih vlaken, se je soočal z izzivom globalne dobavne verige in usklajevanja ponudbe s povpraševanjem. Iz Excela so prešli na **S&OP** (Sales & Operations Planning) rešitev v oblaku. Učinki so bili boljša napoved prodaje, večja preglednost, manj odpadkov in **50 % manj časa** za planiranje in odločanje.

---

## 5. Upravljanje odnosov s strankami (CRM)

### Kaj je CRM?

**CRM** (ang. *Customer Relationship Management*) zajema **strategije**, **procese** in **informacijske sisteme** za upravljanje odnosov s strankami. Cilj je povečanje zvestobe, retencije in dobičkonosnosti strank. CRM pokriva tri ključna področja: prodajo (telefon, splet, fizična prodajalna, terenska prodaja), marketing (kampanje, vsebine, analiza podatkov) in storitve (klicni centri, spletna samopostrežba, terenska podpora, podatki iz družbenih omrežij).

### Operativni in analitični CRM

**Operativni CRM** podpira vsakodnevne procese — prodajo (upravljanje potencialnih kupcev, prodajne priložnosti), marketing (kampanje, segmentacija, personalizacija) in podporo strankam (klicni centri, help desk, self-service portali).

**Analitični CRM** se osredotoča na analizo podatkov — segmentacijo strank, izračun **CLTV** (Customer Lifetime Value — življenjska vrednost stranke) in napovedovanje **odliva strank** (ang. *churn*).

### Upravljanje lojalnosti strank

CRM sistemi omogočajo diferencirano obravnavo strank. Ko organizacija prejme storitveni zahtevek, najprej pridobi informacije o stranki iz podatkovne baze. Če so podatki na voljo, sistem **oceni stranko** (scoring). Visoko vredne in zveste stranke prejmejo posebne ponudbe in storitve. Ostale stranke se usmerijo k najboljšemu agentu za reševanje težave.

### Primer: MillerKnoll — CRM kot podpora digitalni strategiji

MillerKnoll je z uporabo platforme **Salesforce** (Marketing Cloud, Sales Cloud, Service Cloud, Commerce Cloud) dosegel **večkanalno izkušnjo kupca** in **personalizacijo**. Rezultat je bil enoten pogled na stranko, izboljšana spletna trgovina in učinkovitejša podpora strankam.

---

## 6. Poslovna vrednost in prihodnost poslovnih aplikacij

### Temeljni poslovni IS

Štirje temeljni poslovni informacijski sistemi, ki skupaj pokrivajo celotno delovanje organizacije, so: **finance in upravljanje sredstev**, **upravljanje človeškega kapitala**, **upravljanje dobavne verige (SCM)** in **upravljanje odnosov s strankami (CRM)**.

### Izzivi poslovnih aplikacij

Uvedba poslovnih aplikacij prinaša tri skupine izzivov. **Tehnološki izzivi** — kompleksni sistemi in visoki stroški. **Organizacijski izzivi** — spremembe procesov in načina dela (odpor zaposlenih). **Podatkovni izzivi in odvisnost od dobaviteljev** — usklajevanje podatkov med sistemi ter odvisnost od ponudnika (ang. *vendor lock-in*).

### Nova generacija poslovnih aplikacij

Prihodnost poslovnih aplikacij gre v smeri **integriranih poslovnih platform** v oblaku z mobilnim dostopom. Nove tehnologije vključujejo **socialni CRM** (integracija družbenih omrežij v upravljanje odnosov), **poslovno analitiko** (vgrajeni analitični moduli) in **umetno inteligenco** (avtomatizirane odločitve, napovedi, personalizacija). Ključni trend je **konvergenca** ERP, SCM in CRM v enotne, integrirane platforme.

---

## Ključni pojmi za ponavljanje

| Pojem | Definicija |
|---|---|
| **TPS** | Transaction Processing System — sistem za zbiranje in obdelavo poslovnih transakcij |
| **FAIS** | Functional Area Information System — IS za posamezno funkcionalno področje (finance, HR, marketing ...) |
| **HRIS** | Human Resource Information System — IS za upravljanje človeških virov |
| **CIM** | Computer Integrated Manufacturing — računalniško integrirana proizvodnja |
| **PLM** | Product Lifecycle Management — upravljanje življenjskega cikla izdelka |
| **ERP** | Enterprise Resource Planning — integriran sistem, ki povezuje oddelke prek skupne podatkovne baze |
| **Informacijski silos** | Izoliran nabor podatkov posameznega oddelka; povzroča nekonsistentnost in podvajanje |
| **Vanilla ERP** | Standardna implementacija ERP brez prilagoditev |
| **Best-of-breed** | Pristop, kjer se za vsak modul izbere najboljšega ponudnika, a integracija je zahtevnejša |
| **SCM** | Supply Chain Management — upravljanje dobavne verige od surovin do končnega kupca |
| **SCP** | Supply Chain Planning — planiranje dobavne verige |
| **SCE** | Supply Chain Execution — izvajanje procesov v dobavni verigi |
| **WMS** | Warehouse Management System — sistem za upravljanje skladišča |
| **TMS** | Transportation Management System — sistem za upravljanje transporta |
| **Učinek biča** | Bullwhip Effect — eksponentno povečevanje nihanj povpraševanja vzdolž dobavne verige navzgor |
| **Push model** | Dobavna veriga, ki temelji na napovedih povpraševanja |
| **Pull model** | Dobavna veriga, ki temelji na dejanskih naročilih kupcev |
| **S&OP** | Sales & Operations Planning — proces usklajevanja napovedi prodaje z operativnim načrtom |
| **CRM** | Customer Relationship Management — strategije, procesi in IS za upravljanje odnosov s strankami |
| **Operativni CRM** | Del CRM, ki podpira vsakodnevno prodajo, marketing in storitve |
| **Analitični CRM** | Del CRM, ki analizira podatke o strankah (segmentacija, CLTV, odliv) |
| **CLTV** | Customer Lifetime Value — življenjska vrednost stranke za organizacijo |
| **Vendor lock-in** | Odvisnost organizacije od enega ponudnika IS, ki otežuje menjavo |
| **ERP II** | Razširjen ERP, ki poleg jedrnih modulov vključuje SCM, CRM, BI in e-poslovanje |
