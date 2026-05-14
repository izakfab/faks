# P8 — Razvoj IS in življenjski cikel

**Predmet:** Osnove informacijskih sistemov (OIS) 2025/2026
**Predavatelj:** izr. prof. dr. Dejan Lavbič
**Datum predavanja:** 15. 4. 2026

---

## 1. Zakaj razvoj IS ni trivialen?

### Iterativnost vs. inkrementalnost

Preden se poglobimo v razvojne pristope, je ključno razumeti razliko med dvema temeljnima konceptoma. **Iterativnost** (angl. *iterativity*) pomeni **izboljševanje iste verzije** — isti proces ponovimo večkrat in vsakič izboljšamo rezultat. Predstavljajmo si slikanje portreta: najprej groba skica, nato vsakič bolj izpopolnjena slika. **Inkrementalnost** (angl. *incrementalness*) pa pomeni **dodajanje novih funkcionalnosti** — vsak inkrement izvedemo enkrat in dodamo nov del sistema. Kot da bi sliko gradili po delih: najprej obraz, nato telo, nato ozadje.

V praksi pogosto uporabljamo **kombinacijo obeh pristopov**. Na grafu z osema iterativnosti (navpično) in inkrementalnosti (vodoravno) se različni pristopi razvrstijo na značilna mesta: **slapovni model** (angl. *Waterfall*) je v spodnjem levem kotu (niti iterativen niti inkrementalen), **spiralni model** je visoko na osi iterativnosti, **staged delivery** je visoko na osi inkrementalnosti, **agilni pristopi** pa zasedajo osrednji prostor z visoko stopnjo obojega.

### Zakaj projekti še vedno spodletijo?

Znana karikatura z drevesom in gugalnico nazorno prikaže, kako **vsak deležnik** vidi projekt drugače. Stranka opiše problem na en način, projektni vodja ga razume na drug način, poslovni analitik predlaga tretjo rešitev, programer zakodira četrto, komercialist pa predstavi peto. Storitve, ki so bile dejansko implementirane, se lahko bistveno razlikujejo od tega, kar je stranka prvotno potrebovala. To kaže na temeljno težavo — **komunikacijske vrzeli** med deležniki povzročajo neskladje med pričakovanji in rezultatom.

Glavni razlogi za neuspeh projektov vključujejo **slabo definirane zahteve**, **napete roke** (premalo časa), **spreminjajoče se tehnologije** in **prevelike projekte**. Razvoj IS ni zgolj tehnični problem — zahteva usklajevanje ljudi, procesov in tehnologije.

---

## 2. Tradicionalni pristop: SDLC

### Različni pogledi na SDLC

**SDLC** (angl. *Systems Development Life Cycle*) — življenjski cikel razvoja sistemov — je tradicionalni, strukturirani pristop k razvoju IS. Različni avtorji ga predstavljajo na različne načine, a gre za isti koncept. **Wallace** ponuja podrobno razdelitev faz in ga bomo uporabljali kot glavni model. **Rainer** nudi poenostavljen pogled z združenimi fazami. **Strukturni pristop** pa je klasična predstavitev procesa s slapovnim modelom.

### Faze SDLC po Wallaceu

SDLC po Wallaceu obsega sedem zaporednih faz:

1. **Planiranje projekta** (angl. *Planning*),
2. **Analiza zahtev** (angl. *Analysis*),
3. **Načrt sistema** (angl. *Design*),
4. **Razvoj** (angl. *Development*),
5. **Testiranje** (angl. *Testing*),
6. **Uvedba** (angl. *Implementation*),
7. **Vzdrževanje** (angl. *Maintenance*).

Rainer prikazuje podobne faze z nekoliko drugačnimi imeni — od **Systems Investigation** (poslovne potrebe → odločitev go/no-go) prek **Systems Analysis** (uporabniške zahteve) in **Systems Design** (tehnične specifikacije) do **Programming and Testing**, **Implementation** ter **Operation and Maintenance**. Rainerjev pogled vključuje tudi podporna orodja: **Upper CASE tools** za zgodnje faze (analiza, načrt), **Lower CASE tools** za pozne faze (programiranje, testiranje), **prototipiranje** kot paralelni pristop ter **JAD** (Joint Application Design) za skupno načrtovanje.

### Vloge in deležniki

Pri razvoju IS sodeluje več vlog: **uporabniki** (tisti, ki bodo sistem dejansko uporabljali), **sistemski analitiki** (premostijo vrzel med poslovnimi potrebami in tehničnimi rešitvami), **programerji** (pišejo kodo), **tehnični strokovnjaki** (skrbijo za infrastrukturo in arhitekturo) ter **deležniki sistema** (angl. *stakeholders* — vsi, ki jih sistem neposredno ali posredno zadeva).

---

## 3. Faze SDLC podrobneje

### 1. Planiranje projekta (angl. *Planning*)

Prva faza zajema **identifikacijo poslovne potrebe** — zakaj sploh potrebujemo nov ali prenovljen sistem. Sledi **ocena pomembnosti projekta** (ali je projekt dovolj kritičen, da upraviči naložbo) in **izračun ROI** (angl. *Return on Investment* — donosnost naložbe). Pomemben del je tudi **zmanjševanje tveganj** in preverjanje **skladnosti** z regulativo. Celotna faza se zaključi s **študijo izvedljivosti**, ki pokriva tri dimenzije: **tehnično** (ali je rešitev tehnično mogoča), **finančno** (ali se finančno izplača) in **pravno** (ali je v skladu z zakonodajo).

### 2. Analiza zahtev (angl. *Requirements Analysis*)

V fazi analize zahtev izvedemo **zajem zahtev** od uporabnikov in deležnikov. Zahteve **prioritiziramo** v tri kategorije: **obvezne** (brez njih sistem ne deluje), **zaželene** (izboljšajo uporabniško izkušnjo) in **dodatne** (nice-to-have). Sledi **modeliranje procesov** s procesnimi diagrami in **optimizacija procesov** z uporabo pristopov kot so **BPM** (upravljanje poslovnih procesov), **RPA** (avtomatizacija robotskih procesov) in **BPR** (prenova poslovnih procesov). Izhod te faze je **dokument zahtev** oz. **RDD** (angl. *Requirements Definition Document*).

Zahteve v dokumentu delimo na: **funkcionalne zahteve** (kaj naj sistem počne), **uporabniške zahteve** (kako naj uporabnik komunicira s sistemom) in **nefunkcionalne zahteve** oz. **atributi kakovosti** — sem spadajo **zmogljivost** (angl. *performance*), **varnost** (angl. *security*), **integracija** (angl. *integration*) z obstoječimi sistemi in **skladnost** (angl. *compliance*) z regulativo.

V strukturnem pristopu faza zajema in specifikacije zahtev poteka po korakih: **zajem zahtev** (zbrani viri — obstoječa dokumentacija, izpolnjeni vprašalniki, zapiski razgovorov, posnetki) → **ureditev zahtev** (oblikovanje specifikacije z funkcionalnimi in nefunkcionalnimi zahtevami, diagrami primerov uporabe, vmesniki, slovarjem izrazov) → **potrditev zahtev** (naročnik potrdi ustreznost specifikacije).

### 3. Načrt sistema (angl. *Design*)

Faza načrtovanja se osredotoča na **tehnično arhitekturo** sistema. Vključuje izbiro **storitveno usmerjene arhitekture** (SOA), načrtovanje **API-jev** za komunikacijo med moduli, **podatkovno modeliranje** (ER diagrami, relacijski model) ter izdelavo **diagramov primerov uporabe** (angl. *Use Case diagrams*), ki opisujejo interakcije med uporabniki in sistemom.

V strukturnem pristopu faza načrtovanja vključuje pet podprocesov: **izdelava načrta podatkovne baze** (logični podatkovni model, pravice), **izdelava načrta programskih modulov** (struktura menijev, programski moduli), **izdelava načrta dokumentacije** (osnutek dokumentacije, vzorec), **izdelava načrta prehoda na nov sistem** in **izdelava načrta testiranja** (model testiranja, plan testiranja). Pri tem sodelujejo **načrtovalec aplikacije**, **načrtovalec podatkovne baze**, **skrbnik podatkovne baze** in **izdelovalec dokumentacije**.

### 4. Razvoj (angl. *Development*) in 5. Testiranje (angl. *Testing*)

Faza razvoja vključuje **programiranje** (pisanje dejanske kode), **verzioniranje** (upravljanje različic kode z orodji kot je Git), **pregled kode** (ang. *code review*) in uporabo **orodij za projektno vodenje** (npr. Jira).

Testiranje obsega več ravni: **testiranje enot** (angl. *unit testing* — preverjanje posameznih modulov kode), **testiranje integracije** (angl. *integration testing* — preverjanje, ali moduli pravilno sodelujejo), **testiranje sistema** (angl. *system testing* — preverjanje delovanja celotnega sistema), **stresni test** (angl. *stress testing* — preverjanje obnašanja pod visoko obremenitvijo) in **test sprejemljivosti** (angl. *acceptance testing* — končni uporabniki preverijo, ali sistem ustreza zahtevam).

V strukturnem pristopu testiranje poteka prek več okolij: **razvojno okolje** (razvijalec testira module ob razvoju), **testno okolje** (načrtovalec aplikacije testira funkcionalne sklope; končni uporabnik izvede potrditveni test) in **produkcijsko okolje** (končni test pred uvedbo).

### 6. Uvedba (angl. *Implementation*)

Uvedba sistema lahko poteka na tri načine: **vzporedna uvedba** (stari in novi sistem tečeta hkrati, dokler se novi ne izkaže za zanesljivega — najvarnejša, a najdražja možnost), **fazna uvedba** (sistem se uvaja postopoma po oddelkih ali funkcionalnostih) in **neposredna uvedba** oz. **Big bang** (stari sistem se ugasne in novi vklopi naenkrat — najhitrejša, a najtveganjša možnost). Poleg same uvedbe je kritičnega pomena tudi **usposabljanje uporabnikov** in priprava **dokumentacije sistema**.

### 7. Vzdrževanje (angl. *Maintenance*)

Po uvedbi se začne najdaljša faza — vzdrževanje. Ta vključuje **odpravljanje napak** (popravki hroščev, ki se pojavijo v produkciji), **nadgradnje in nove funkcionalnosti** (odziv na spreminjajoče se poslovne potrebe), vzpostavitev **procesa obvladovanja sprememb** (formalni postopek za odobravanje in sledenje spremembam), **integracijo z novimi sistemi** (ko organizacija uvede dodatne rešitve) ter skrb za **podedovane sisteme** (angl. *legacy systems* — starejši sistemi, ki jih je težko nadomestiti, a so še vedno poslovno kritični).

Spremembe zahtev v poznejših fazah so **neprimerno dražje** kot v zgodnjih fazah — to je eden ključnih argumentov za temeljito analizo in načrtovanje na začetku projekta.

---

## 4. Sodobni pristopi razvoja

### Strategije razvoja programske opreme

Poleg tradicionalnega SDLC obstajajo tudi sodobnejše strategije. Najpogostejše so: **slapovni model** (angl. *Waterfall*), **iterativni pristopi** in **agilni pristopi**. Med seboj se razlikujejo po: **logiki planiranja** (vnaprejšnje vs. sproti), **odzivu na spremembe** (odpornost vs. prilagodljivost) in **tempu dostave delujoče rešitve** (ena velika dostava vs. pogoste manjše).

### Slapovni model (angl. *Waterfall*)

V slapovnem modelu faze potekajo **zaporedno** — naslednja faza se začne šele po zaključku prejšnje. Zahteve se določijo **na začetku** in se med projektom ne spreminjajo. Model je primeren za **stabilne projekte** z jasno definiranimi zahtevami (npr. regulirane panoge, infrastrukturni projekti). Glavna težava je, da **spremembe povzročijo drag povratek nazaj** — če v fazi testiranja odkrijemo napako v zahtevah, moramo iti čez vse vmesne faze.

### Alternativne metode razvoja IS

Med alternativne metode spadajo: **JAD** (angl. *Joint Application Design* — skupno načrtovanje z aktivnim vključevanjem uporabnikov v delavnicah), **RAD** (angl. *Rapid Application Development* — hitri razvoj s prototipi in povratnimi informacijami uporabnikov), **agilni razvoj** (angl. *Agile development*) in **razvoj s strani končnih uporabnikov**. Vse te metode poudarjajo **hitrost**, **iterativnost** in **vključenost uporabnikov**.

### Iterativni in agilni pristopi

Pri iterativnih in agilnih pristopih razvoj poteka v **iteracijah** (kratkih razvojnih ciklih), faze se lahko **prekrivajo**, poudarek pa je na **hitri dostavi delujočih delov** sistema. Konkretne metode vključujejo:

- **RAD** — temelji na **prototipih** in **povratnih informacijah uporabnikov**; tradicionalne faze se stisnejo v iterativne cikle (zahteve → načrt → razvoj → test → pregled uporabnika → ponovitev).
- **Agile** — temelji na **sodelovanju**, **kratkih ciklih** in **prilagajanju** spreminjajočim se zahtevam.
- **Scrum** — najpogostejši agilni okvir: delo poteka v **sprintih** (2–4 tedne), ključne vloge so **product owner** (lastnik produkta, določa prioritete), **Scrum Master** (skrbi za proces) in **ekipa** (izvaja delo). Cikel vključuje načrtovanje → razvoj → testiranje → pregled uporabnika.
- **XP** (angl. *Extreme Programming*) — poudarek na **delu v parih** (angl. *pair programming*), **pogostem testiranju** in **pogostih izdajah**.

### Orodja za razvoj sistema

Razvijalcem so na voljo različna orodja: **Design thinking** (usmerjen v razumevanje uporabnikov), **prototipiranje** (hitra izdelava delovnih modelov za testiranje idej), **CASE/iCASE** (angl. *Computer-Aided Software Engineering* — orodja za avtomatizirano podporo razvoju), **komponentni razvoj** (ponovna uporaba obstoječih komponent), **objektni razvoj** (razvoj na osnovi objektov z lastnostmi in metodami), **low-code/no-code** (platforme za razvoj z malo ali brez kodiranja) ter **vsebniki** (angl. *containers* — lahke, prenosljive enote za poganjanje aplikacij).

### Izbira pristopa razvoja IS

Ni enega najboljšega pristopa — izbira je odvisna od **tipa projekta**, **jasnosti zahtev** in **organizacijske kulture**. Smernica: **stabilne zahteve** → slapovni model; **spreminjajoče zahteve** → iterativni/agilni pristopi.

### Primerjava pristopov v praksi

Podatki kažejo, da je slapovni pristop še vedno pogosto uporabljen (34 % projektov po podatkih iz leta 2018), a imajo **agilni/iterativni pristopi** boljše rezultate: **več pravočasno zaključenih projektov** (69 % vs. 52 %) in **več projektov v okviru proračuna** (66 % vs. 46 %). V praksi se pogosto uporablja **kombinacija pristopov** — hibridni modeli, ki združujejo elemente različnih strategij.

---

## 5. Razvoj vs. nakup (angl. *Build vs. Buy*)

### Odločitev o razvoju oz. nakupu

Odločitev med razvojem lastnega sistema in nakupom gotove rešitve je **strateška**, ne zgolj tehnična. **Razvoj** (angl. *Build*) prinaša **prilagojen sistem**, ki natančno ustreza potrebam organizacije, in potencialno **konkurenčno prednost**. **Nakup** (angl. *Buy*) prinaša **nižje stroške**, **hitrejšo implementacijo** in dostop do preverjenih rešitev — vključno s **SaaS** (Software as a Service), **oblačnimi rešitvami** in **odprtokodnimi** (angl. *open source*) sistemi.

Splošno pravilo: če gotova rešitev pokriva **vsaj 75 % zahtev**, je smiselno izbrati **nakup** in preostale zahteve rešiti s prilagoditvijo.

### Prednosti in slabosti razvoja oz. nakupa

**Razvoj** prinaša popolno prilagoditev in strateško vrednost, a zahteva visoke stroške in daljši čas. **Nakup** prinaša hitrost in nižjo ceno, a zahteva prilagajanje poslovnih procesov organizacije kupljeni rešitvi.

### Proces nakupa

Proces nakupa gotove rešitve poteka v korakih: izdaja **RFI** (angl. *Request for Information* — povpraševanje po informacijah o razpoložljivih rešitvah) → izdaja **RFP** (angl. *Request for Proposal* — formalni poziv ponudnikom za oddajo ponudbe) → **izbor ponudnika** (na podlagi uteženih kriterijev) → **pogodba** (pogajanja in podpis) → **implementacija** (namestitev, konfiguracija, migracija podatkov).

### Ovrednotenje ponudnikov

Ponudnike ocenimo z **uteženo oceno** na podlagi kriterijev: **ujemanje zahtev** (utež 30 %), **izkušnje ponudnika** (20 %), **reference** (10 %), **arhitektura** (20 %) in **cena** (20 %). Vsak ponudnik dobi oceno od 1 (zelo slabo) do 5 (zelo dobro), končna ocena pa je uteženo povprečje. Primer: SaaS rešitev z ocenam 4-1-4-4-3 dobi skupno oceno 3,2, medtem ko komercialni ponudnik z ocenami 5-3-2-1-1 dobi le 2,7.

### Prilagoditev in integracija

Ko ima organizacija več sistemov, nastane potreba po **integraciji IS**. Na voljo sta dve možnosti: **prilagoditev procesov organizacije** (organizacija spremeni svoje procese, da ustrezajo kupljeni programski opremi) ali **prilagoditev programske opreme** (ponudnik ali organizacija prilagodi kodo). Prilagoditev programske opreme nosi tveganja: **napake** (nestabilnost sistema), **težje nadgradnje** (prilagojene dele je treba ročno prenesti ob vsaki nadgradnji) in **izguba podpore** (ponudnik morda ne podpira prilagojenih različic).

Dve strategiji pri nakupu: **best-of-breed** (za vsako področje izberemo najboljšo rešitev — npr. najboljši CRM, najboljši ERP, najboljši SCM — a se soočimo z integracijo) in **unified procurement** (enotni nabavni pristop — vse rešitve od enega ponudnika, kar poenostavi integracijo, a morda ni optimalno za vsako posamezno področje).

---

## 6. Človeški in organizacijski vidik razvoja IS

### Človeški dejavnik pri razvoju IS

Razvoj IS ni zgolj tehnični proces — ključna je **komunikacija** med vsemi udeleženci. Pomembna je vloga **ljudi in organizacije** ter njihov vpliv na **uspešnost projekta**. Najboljša tehnična rešitev bo spodletela, če ljudje ne sodelujejo, ne razumejo zahtev ali se upirajo spremembam.

### Delo v ekipah

Projekti razvoja IS zahtevajo **medfunkcijske ekipe** (angl. *cross-functional teams*), v katerih sodelujejo ljudje iz različnih oddelkov — IT, poslovanje, finance, pravo. Izzivi so **različni cilji in jezik** (IT govori o modulih in API-jih, poslovanje o prihodkih in procesih), **težave pri razumevanju zahtev** (poslovni uporabnik težko izrazi, kaj natančno potrebuje, v tehničnem jeziku) in hkrati **priložnost za deljenje znanja** (IT spozna poslovne procese, poslovni uporabniki pa razumejo tehnične omejitve).

### Organizacijska kultura

Prehod na **agilni pristop** ni le metodološka sprememba — je **kulturna sprememba**. Zahteva premik od **"jaz"** k **"mi"**, več **sodelovanja** in **zaupanja** med člani ekipe ter **sprejemanje sprememb zahtev** kot naravnega dela procesa (namesto kot napake v planiranju). Slapovni pristop daje poudarek na **dokumentaciji** in vnaprejšnjem **načrtu**, medtem ko agilni pristop poudarek prestavlja na **ekipo** in **fleksibilnost**.

### Globalni razvoj programske opreme

Sodobne ekipe pogosto niso na **isti lokaciji** — razpršene so po več državah ali celinah. Izzivi globalnega razvoja vključujejo **časovne pasove** (ko ena ekipa dela, druga spi) in **jezikovne ter kulturne razlike**. Podpora globalnim ekipam vključuje **video klice**, **takojšnje sporočanje** (angl. *instant messaging*) in **deljenje zaslona**. Agilni pristop se uspešno uporablja tudi v **globalnih ekipah**, čeprav zahteva dodatno prilagoditev (npr. asinhroni stand-upi, prekrivanje delovnega časa).

### Delo s svetovalci

Organizacije pogosto vključijo **zunanje strokovnjake** (svetovalce), ki pomagajo pri **implementaciji** sistema. Svetovalci opravljajo različne vloge: **zajem zahtev**, **konfiguracijo** sistema, **integracijo** z obstoječimi sistemi in **izobraževanje** uporabnikov in IT osebja. Prednosti so **dostop do ekspertnega znanja** in **manjša obremenitev notranjih zaposlenih**. Slabosti pa so **manj znanja v organizaciji** (znanje odide s svetovalcem), **manjši občutek lastništva** (zaposleni čutijo manj odgovornosti za sistem, ki ga niso sami razvili) ter **tveganja** v obliki visokih **stroškov** in morebitnih **sporov**.

### Upravljanje pogodb

Ko organizacija najame svetovalce ali kupi rešitev, je kritično **upravljanje pogodb** — to vključuje **pogajanja in pogoje** (obseg dela, roki, cena, penali), **spremljanje napredka** (ali projekt napreduje po načrtu), **nadzor nad stroški** (ali ostajamo v proračunu) in **upravljanje sprememb** (kaj se zgodi, ko se zahteve spremenijo — kako to vpliva na ceno in rok).

### Vloga vodstva

Vodstvo organizacije ima ključno vlogo: zagotavlja **poudarek na strateški vrednosti IS** (projekt ni le IT stroški, ampak poslovna naložba), nudi **podporo spremembam** (zaposleni sprejmejo nov sistem lažje, če vodstvo stoji za njim), zagotavlja sredstva za **izobraževanje** in deluje v vlogi **"influencerjev"** — ključnih oseb, ki s svojim zgledom in podporo vplivajo na sprejemanje novega sistema v organizaciji.

---

## 7. Novi trendi in etični vidik

### SaaS in "citizen developers"

Vzpon **SaaS** (Software as a Service) in oblaka omogoča organizacijam dostop do IS brez lastne infrastrukture. Hkrati pa se pojavlja fenomen **IT-ja v senci** (angl. *shadow IT*) — zaposleni mimo uradnega IT oddelka uporabljajo lastna orodja in rešitve. Pojavljajo se tudi **citizen developers** — poslovni uporabniki, ki brez formalnega tehničnega znanja razvijajo aplikacije z uporabo **low-code/no-code** platform. Ta trend zahteva **upravljanje in nadzor**, da ne nastanejo varnostne luknje in neusklajeni sistemi.

### Razvoj pri končnih uporabnikih in RPA

**Razvoj s strani končnih uporabnikov** (angl. *end-user development*) je vedno bolj razširjen — orodja kot so OpenAI Codex, Anthropic Claude Code in podobni omogočajo netehničnim uporabnikom pisanje kode. Tveganje ostaja **IT v senci** — neupravljane rešitve, ki niso del uradne IT arhitekture.

**RPA** (angl. *Robotic Process Automation*) je avtomatizacija **ponavljajočih opravil** z uporabo programskih robotov — npr. prenos podatkov med sistemi, izpolnjevanje obrazcev, preverjanje skladnosti. RPA prinaša **večjo učinkovitost** in **manj napak** pri rutinskih procesih.

### Etični vidik razvoja sistemov

Zahteve za razvoj IS lahko vključujejo tudi **etične cilje** — podpora **trajnosti** (angl. *sustainability*, "going green"), večja **transparentnost** odločitev (sistem pojasni, zakaj je sprejel določeno odločitev), **opozorila pri delu z zaupnimi podatki** (sistem uporabnika opozori, ko dostopa do občutljivih informacij) in mehanizmi za **preprečevanje neustreznega prenosa podatkov** (varovalke proti nepooblaščenemu izvozu ali kopiranju).

---

## Ključni pojmi za ponavljanje

| Pojem | Definicija |
|---|---|
| **SDLC** | Systems Development Life Cycle — življenjski cikel razvoja sistemov; strukturirani pristop s fazami od planiranja do vzdrževanja |
| **Iterativnost** | Izboljševanje iste verzije skozi ponavljajoče cikle (iteracije) |
| **Inkrementalnost** | Dodajanje novih funkcionalnosti po delih (inkrementih) |
| **Slapovni model (Waterfall)** | Pristop, kjer faze potekajo zaporedno; zahteve se določijo na začetku |
| **Študija izvedljivosti** | Preverjanje tehnične, finančne in pravne izvedljivosti projekta |
| **RDD** | Requirements Definition Document — dokument zahtev s funkcionalnimi in nefunkcionalnimi zahtevami |
| **Funkcionalne zahteve** | Zahteve, ki opisujejo, kaj naj sistem počne (funkcije, operacije) |
| **Nefunkcionalne zahteve** | Atributi kakovosti — zmogljivost, varnost, integracija, skladnost |
| **Testiranje enot** | Preverjanje posameznih modulov kode (unit testing) |
| **Testiranje integracije** | Preverjanje, ali moduli pravilno sodelujejo med seboj |
| **Stresni test** | Preverjanje obnašanja sistema pod visoko obremenitvijo |
| **Test sprejemljivosti** | Končni uporabniki preverijo, ali sistem ustreza zahtevam |
| **Vzporedna uvedba** | Stari in novi sistem tečeta hkrati; najvarnejša, a najdražja možnost |
| **Fazna uvedba** | Sistem se uvaja postopoma po oddelkih ali funkcionalnostih |
| **Neposredna uvedba (Big bang)** | Stari sistem se ugasne, novi se vklopi naenkrat; najhitrejša, a najtveganjša |
| **Podedovani sistemi (Legacy)** | Starejši sistemi, ki jih je težko nadomestiti, a so še vedno poslovno kritični |
| **JAD** | Joint Application Design — skupno načrtovanje z aktivnim vključevanjem uporabnikov |
| **RAD** | Rapid Application Development — hitri razvoj s prototipi in povratnimi informacijami |
| **Agile** | Filozofija razvoja s poudarkom na sodelovanju, kratkih ciklih in prilagajanju |
| **Scrum** | Agilni okvir s sprinti (2–4 tedne), product ownerjem, Scrum Masterjem in ekipo |
| **XP (Extreme Programming)** | Agilna metoda: delo v parih, pogosto testiranje, pogoste izdaje |
| **CASE/iCASE** | Computer-Aided Software Engineering — orodja za avtomatizirano podporo razvoju |
| **Low-code/No-code** | Platforme za razvoj aplikacij z malo ali brez kodiranja |
| **Vsebniki (Containers)** | Lahke, prenosljive enote za poganjanje aplikacij (npr. Docker) |
| **Build vs. Buy** | Strateška odločitev med razvojem lastnega sistema in nakupom gotove rešitve |
| **RFI** | Request for Information — povpraševanje po informacijah o razpoložljivih rešitvah |
| **RFP** | Request for Proposal — formalni poziv ponudnikom za oddajo ponudbe |
| **Best-of-breed** | Strategija, kjer za vsako področje izberemo najboljšo rešitev od različnih ponudnikov |
| **Unified procurement** | Enotni nabavni pristop — vse rešitve od enega ponudnika |
| **Medfunkcijske ekipe** | Ekipe iz več oddelkov (IT, poslovanje, finance); cross-functional teams |
| **Shadow IT** | IT v senci — neuradne rešitve, ki jih zaposleni vzdržujejo mimo IT oddelka |
| **Citizen developers** | Poslovni uporabniki, ki razvijajo aplikacije brez formalnega tehničnega znanja |
| **RPA** | Robotic Process Automation — avtomatizacija ponavljajočih opravil s programskimi roboti |
| **Design thinking** | Pristop k reševanju problemov, usmerjen v razumevanje uporabnikov |
