# P10 — Modeliranje IS

**Predmet:** Osnove informacijskih sistemov (OIS) 2025/2026
**Predavatelj:** izr. prof. dr. Dejan Lavbič
**Datum predavanja:** 6. 5. 2026

---

## 1. UML kot jezik pogledov

### Več pogledov na en sistem

Pri razvoju informacijskega sistema se soočamo z različnimi vprašanji — kaj sistem dela, kako je zgrajen in kako deluje. **UML** (angl. *Unified Modeling Language*) je standardizirani **jezik za modeliranje**, ki omogoča odgovarjanje na ta vprašanja z uporabo **različnih diagramov**. Ključna ideja je, da en sam sistem opišemo z **več diagrami**, pri čemer vsak diagram odgovarja na drugo **vprašanje** in prikazuje drug **pogled** na sistem. UML torej ni programski jezik, temveč **jezik komunikacije** med deležniki — razvijalci, analitiki, naročniki in vodji projekta.

### Pregled diagramov

UML diagrame delimo v več kategorij glede na to, kaj prikazujejo. Diagrame za opis **»kaj«** sistema predstavlja **diagram primerov uporabe** (angl. *Use Case Diagram*), ki zajema funkcionalne zahteve. **Strukturni diagrami** (angl. *Structure Diagrams*) opisujejo statično zgradbo sistema — sem spada **razredni diagram** (angl. *Class Diagram*), ki prikazuje razrede in relacije med njimi. **Vedenjski diagrami** (angl. *Behavior Diagrams*) opisujejo dinamični vidik — sem spada **diagram zaporedja** (angl. *Sequence Diagram*), ki prikazuje potek komunikacije med objekti skozi čas. Poleg teh obstajajo še diagrami za **arhitekturo** — **diagram komponent** (angl. *Component Diagram*) prikazuje arhitekturno zgradbo sistema — in **infrastrukturo** — **diagram postavitve** (angl. *Deployment Diagram*) prikazuje razporeditev komponent na fizični ali virtualni infrastrukturi.

### Kako izbrati diagram?

Izbira diagrama je odvisna od tega, kaj želimo prikazati. Kadar želimo zajeti **zahteve** in opredeliti, kaj sistem počne z vidika uporabnika, uporabimo **diagram primerov uporabe**. Kadar nas zanima **struktura** sistema — razredi, njihovi atributi, metode in medsebojni odnosi — uporabimo **razredni diagram**. Kadar pa želimo prikazati **potek** interakcij med objekti pri izvajanju določene funkcionalnosti, uporabimo **diagram zaporedja**.

---

## 2. Diagram primerov uporabe

### Koncept diagrama primerov uporabe

**Diagram primerov uporabe** (angl. *Use Case Diagram*) je temeljni diagram za zajem funkcionalnih zahtev. Prikazuje sistem s **pogledom od zunaj** — osredotoča se na **uporabnika** in njegove interakcije s sistemom, brez kakršnihkoli podrobnosti o notranji implementaciji. Diagram vsebuje štiri ključne elemente: **akterje** (angl. *actors*) — uporabnike ali zunanje sisteme, ki komunicirajo s sistemom; **primere uporabe** (angl. *use cases*) — funkcionalnosti, ki jih sistem nudi; **mejo sistema** (angl. *system boundary*) — pravokotnik, ki označuje, kaj je del sistema in kaj je zunaj; ter **povezave** med akterji in primeri uporabe.

### Akterji in povezave

**Akter** (angl. *actor*) je katera koli vloga, ki interagira s sistemom — to je lahko človeški uporabnik ali zunanji sistem. Pomembno je razumeti, da akter ni konkretna oseba, temveč **vloga**. Med primeri uporabe obstajata dve posebni povezavi: **«include»** označuje, da en primer uporabe **vedno vključuje** drugega (npr. vsak primer uporabe, ki zahteva transakcijo, vedno vključi avtorizacijo), medtem ko **«extend»** označuje **neobvezno razširitev** — primer uporabe se izvede le pod določenimi pogoji (npr. pregled stanja neobvezno razširi osnovni tok z izpisom na zaslon).

---

## 3. Razredni diagram

### Koncept razrednega diagrama

**Razredni diagram** (angl. *Class Diagram*) je osrednji strukturni diagram v UML. Prikazuje **razrede** sistema, njihove **atribute** in **operacije** ter **relacije** med njimi. Razredni diagram opisuje **statično strukturo** sistema — katere entitete obstajajo, kakšne podatke hranijo in kako so med seboj povezane. Vsak razred je prikazan kot pravokotnik, razdeljen na tri dele: ime razreda, atributi (podatki) in operacije (metode).

### Elementi razrednega diagrama

Razredni diagram vključuje več vrst elementov in relacij. **Asociacija** (angl. *association*) povezuje dva razreda in lahko vsebuje **števnost** (angl. *multiplicity*) — npr. 1, 0..1, * (nič ali več). **Posploševanje** (angl. *generalization*) izraža dedovanje — npr. razred Korporativna stranka in Osebna stranka dedujeta od razreda Stranka. **Omejitev** (angl. *constraint*) je pogoj, ki mora veljati — npr. »če je kreditna ocena stranke slaba, mora biti naročilo predplačano«. Diagram lahko vsebuje tudi **ime vloge** (angl. *role name*), ki opisuje vlogo razreda v asociaciji, ter oznako **navigabilnosti** (angl. *navigable*), ki pove, v katero smer je asociacija dostopna.

---

## 4. Diagram zaporedja

### Koncept diagrama zaporedja

**Diagram zaporedja** (angl. *Sequence Diagram*) je vedenjski diagram, ki prikazuje **potek dogodkov** in **komunikacijo** med objekti skozi **čas**. Čas teče od zgoraj navzdol, vsak objekt (udeleženec) ima svojo **življenjsko črto** (angl. *lifeline*) — navpično črtkano črto, ki predstavlja obstoj objekta skozi čas. Kadar je objekt aktiven (izvaja operacijo), se na življenjski črti pojavi **aktivacijski blok** (angl. *activation*).

### Elementi diagrama zaporedja

Komunikacija med objekti poteka prek **sporočil** (angl. *messages*) — horizontalnih puščic med življenjskimi črtami. **Najdeno sporočilo** (angl. *found message*) označuje začetek interakcije od zunaj. **Samoklic** (angl. *self-call*) je sporočilo, ki ga objekt pošlje samemu sebi. **Povratno sporočilo** (angl. *return*) je črtkana puščica, ki označuje vrnjen rezultat klica. Diagram zaporedja lahko vsebuje tudi **zanke** (angl. *loop*) — ponavljajoče se bloke s pogojem, kot npr. »[dokler ni ustrezen znesek]«. Ta diagram predstavlja most med opisi primerov uporabe in dejansko implementacijo, saj prikazuje **odgovornosti objektov** in **zaporedje klicev**.

---

## 5. Ostali diagrami

### Diagram komponent

**Diagram komponent** (angl. *Component Diagram*) prikazuje **arhitekturo** sistema — kako je sistem razdeljen na komponente in kako te med seboj komunicirajo prek vmesnikov. Komponente so logične enote sistema (npr. prodajni strežnik, transakcijski procesor, računovodski gonilnik), ki ponujajo in zahtevajo storitve prek jasno definiranih vmesnikov. Ta diagram je koristen za razumevanje višjenivojske zgradbe sistema.

### Diagram postavitve

**Diagram postavitve** (angl. *Deployment Diagram*) prikazuje **infrastrukturo** — fizične ali virtualne naprave (angl. *device nodes*), izvajalska okolja (angl. *execution environment nodes*) in **artefakte** (angl. *deployed artifacts*), ki tečejo na njih. Elementi diagrama vključujejo **komunikacijske poti** (angl. *communication paths*) med napravami (npr. HTTP/Internet, Java RMI/LAN, JDBC), **označene vrednosti** (angl. *tagged values*), ki specificirajo lastnosti naprav (npr. OS = Solaris, web server = apache), in konkretne datoteke (npr. .war, .ear), ki so nameščene na posameznih vozliščih. Ta diagram je ključen za ekipe, ki skrbijo za namestitev in infrastrukturo.

---

## 6. Primer razvoja IS: Bankomat

### Poslovni problem

Bankomat (angl. *ATM — Automated Teller Machine*) je tipičen primer informacijskega sistema, na katerem lahko demonstriramo celoten postopek razvoja od **problema** do **rešitve**. Poslovni problem, ki ga bankomat naslavlja, vključuje tri ključne potrebe: **dostop do gotovine** — uporabniki potrebujejo možnost dviga denarja zunaj delovnega časa bančnih poslovalnic; **vpogled v stanje** — uporabniki želijo preveriti stanje svojega računa; ter **varnost** — vse operacije morajo biti zaščitene pred nepooblaščenim dostopom.

### Deležniki in akterji

Razvoj IS se vedno začne z identifikacijo **deležnikov** (angl. *stakeholders*) in **akterjev** (angl. *actors*). Pri bankomatu so to: **uporabnik** oz. **komitent** (angl. *customer*) — oseba, ki uporablja bankomat za dvige, vplačila in pregledovanje stanja; **banka** (angl. *bank*) — zunanja institucija, ki hrani podatke o računih in odobrava transakcije; **vzdrževalec** (angl. *operator*) — oseba, ki skrbi za fizično delovanje naprave (zagon, izklop, polnjenje z gotovino); ter **zunanji sistemi** — npr. Bankart, ki posreduje med bankomati in bankami za medbankovne transakcije. Pomembno je, da podatkovna baza ni akter — je notranja komponenta sistema.

### Funkcionalne zahteve

**Funkcionalne zahteve** (angl. *functional requirements*) opisujejo, kaj sistem omogoča. Za bankomat so ključne funkcionalnosti: **dvig denarja** — uporabnik izbere znesek, sistem preveri razpoložljivost in izda gotovino; **preverjanje stanja** — uporabnik pridobi informacijo o stanju računa; **vnos PIN** — avtentikacijski mehanizem za preverjanje identitete uporabnika; ter **izpis potrdila** — uporabnik po transakciji prejme pisno potrdilo o izvedeni operaciji.

### Atributi kakovosti (nefunkcionalne zahteve)

Poleg funkcionalnih zahtev mora sistem izpolnjevati tudi **atribute kakovosti** (angl. *quality attributes*), ki opisujejo, **kako dobro** sistem deluje. Pri bankomatu so najpomembnejši trije: **varnost** (angl. *security*) — zaščita pred nepooblaščenim dostopom (šifriranje PIN-a, zaklepanje kartice po večkratnem napačnem vnosu); **odzivnost** (angl. *responsiveness*) — sistem mora hitro obdelati zahtevo in uporabniku pravočasno vrniti rezultat; ter **zanesljivost** (angl. *reliability*) — sistem mora delovati neprekinjeno in brez izpadov, saj uporabniki od bankomata pričakujejo razpoložljivost 24/7.

### Primer uporabe: Dvig denarja

Vsak **primer uporabe** (angl. *use case*) je podrobno opisan s tremi elementi: **akter** — kdo sproži primer uporabe (pri dvigu denarja je to stranka); **tok dogodkov** (angl. *flow of events*) — zaporedje korakov, ki se izvedejo (vstavi kartico → vnesi PIN → izberi znesek → sistem preveri stanje → izda gotovino → izpiše potrdilo); ter **rezultat** — pričakovani izid (uporabnik prejme gotovino in potrdilo). Poleg osnovnega toka se opišejo tudi **alternativni tokovi** (npr. napačen PIN, nezadostno stanje) in **izjemni tokovi** (npr. napaka pri komunikaciji z banko).

### Začetni funkcionalni testi

Ko so zahteve opredeljene, se pripravijo **začetni funkcionalni testi** (angl. *initial functional tests*), ki preverjajo, ali sistem deluje pravilno. Ti testi pokrivajo ključne scenarije: ali **dvig denarja** dejansko izda gotovino in zmanjša stanje; ali **preverjanje PIN** pravilno zavrne ali sprejme vstopno kodo; ali **stanje računa** prikaže pravilno vrednost; ter ali **izpis potrdila** vsebuje pravilne podatke o transakciji.

---

## 7. Modeliranje bankomata z UML

### Diagram primerov uporabe bankomata

Na diagramu primerov uporabe za bankomat so trije **akterji**: **Stranka**, **Operater** in **Banka**. Meja sistema je označena s pravokotnikom z imenom »Bankomat«. Primeri uporabe vključujejo: **PU1 — Zagon sistema** (sproži Operater), **PU2 — Izklop sistema** (sproži Operater), **PU3 — Interakcija** (sproži Stranka), **PU4 — Izvedba transakcije** (povezava z Banko), **PU5 — Dvig denarja**, **PU6 — Polog denarja**, **PU7 — Prenos denarja**, **PU8 — Pregled stanja** in **PU9 — Napačen PIN**. Med primeri uporabe so vzpostavljene povezave **«include»** (npr. Dvig, Polog, Prenos in Pregled vključujejo Izvedbo transakcije) in **«extend»** (npr. Pregled stanja razširi osnovni tok z neobveznim dodatkom).

### Identifikacija objektov

V fazi analize identificiramo objekte sistema in jih razvrstimo v tri kategorije po vzorcu **BCE** (angl. *Boundary-Control-Entity*). **Mejni objekti** (angl. *boundary*) upravljajo komunikacijo z zunanjim svetom: Nadzorna plošča (vmesnik za operaterja), Bralnik kartic, Uporabniška plošča (tipkovnica in zaslon), Tiskalnik potrdil, Reža za denar, Predal za kuverte in Povezava do banke. **Krmilni objekti** (angl. *control*) koordinirajo poslovno logiko: Bankomat (glavni krmilnik), Interakcija (upravlja sejo uporabnika) in Transakcija (upravlja posamezno transakcijo). **Entitetni objekti** (angl. *entity*) hranijo podatke: Kartica (podatki o kartici uporabnika) in Dnevnik (zapis vseh transakcij).

### Razredni diagram bankomata

Razredni diagram bankomata prikazuje **statično strukturo** sistema z vsemi razredi in njihovimi povezavami. Krmilni razred **Bankomat** je povezan z mejnimi razredi (Nadzorna plošča, Uporabniška plošča, Tiskalnik potrdil, Povezava do banke, Predal za kuverte, Reža za denar) in koordinira celoten sistem. Krmilni razred **Interakcija** upravlja sejo med uporabnikom in bankomatom ter je povezan z Bralnikom kartic in entitetnim razredom Kartica. Krmilni razred **Transakcija** upravlja posamezno transakcijo in ima podrazrede za različne tipe transakcij: **Dvig**, **Polog**, **Prenos** in **Pregled stanja**. Transakcija komunicira s Povezavo do banke in operira nad podatki kot so Podatki o računu, Denar, Stanje, Status, Potrdilo in Sporočilo. Entitetni razred **Dnevnik** hrani zapise vseh izvedenih transakcij.

### Diagram zaporedja bankomata: Dvig denarja

Diagram zaporedja za primer uporabe **Dvig denarja** prikazuje komunikacijo med objekti skozi čas. Udeleženci so: **:Dvig** (krmilni objekt), **:Uporabniška plošča** (mejni objekt), **:Reža za denar** (mejni objekt) in **:Sporočilo** (entitetni objekt). Tok poteka takole: objekt :Dvig najprej pridobi podatke od stranke (pridobiPodatkeOdStranke()), nato prikaže izbiro menija na uporabniški plošči (vrniIzbiroMenija(racunZaDvigDenarja, racuniNaVoljo)). Sledi **zanka** [dokler ni ustrezen znesek], v kateri uporabniška plošča prikazuje izbiro vrednosti dviga (vrniVrednostDviga(vrniIzbiroMenija(visinaDviga, postavkeMenija))). Ko je znesek izbran, :Dvig preveri razpoložljivost sredstev pri reži za denar (izplacajZnesek := preveriAliJeDenarNaZalogi(visina)). Nato se ustvari objekt :Sporočilo (// kreiraj). Transakcija se zaključi (potrdilo := zakljuciTransakcijo()) in reža za denar izda gotovino (izdajDenar(visina)). Na koncu se transakcija še enkrat zaključi (potrdilo := zakljuciTransakcijo()).

---

## 8. Povezava modeliranja z razvojnim procesom

### Kje smo v SDLC?

Modeliranje z UML se umešča v več faz **življenjskega cikla razvoja sistema** (angl. *SDLC — Software Development Life Cycle*). Diagram primerov uporabe nastane v fazi **zahtev** — služi kot formalen zapis, kaj sistem počne. Razredni diagram nastaja v fazah **analize** in **načrtovanja** — v analizi identificiramo ključne razrede in relacije, v načrtovanju jih dopolnimo s podrobnostmi. Diagram zaporedja nastane v fazi **načrtovanja** in služi kot most proti **implementaciji** — preverjanje poteka interakcij vodi neposredno v kodiranje metod.

### Tipične napake

Pri razvoju IS se pogosto pojavljajo štiri tipične napake. **Prehitro v implementacijo** (angl. *code jump*) — ekipa preskoči fazi zahtev in načrtovanja ter začne neposredno kodirati, kar vodi v naknadno iskanje napak in drage popravke. **Nejasne zahteve** (angl. *missing features*) — funkcionalne zahteve niso dovolj podrobno opredeljene, zato v končnem izdelku manjkajo ključne funkcionalnosti. **Ignoriranje uporabnika** — sistem je morda tehnično brezhiben, a neuporaben, ker ne ustreza dejanskim potrebam uporabnikov (angl. *not useful/successful system*). **Manjkajoči modeli** — brez modelov ekipa nima jasne slike sistema, kar vodi v slabšo komunikacijo, večje tveganje in nepredvidljive posledice sprememb.

### Povzetek: Sistem = zahteve + modeli + implementacija

Razvoj kakovostnega informacijskega sistema zahteva sistematičen pristop: najprej **zahteve** (kaj sistem počne in kako dobro), nato **modele** (formalen opis strukture in obnašanja z UML) in šele nato **implementacijo** (kodiranje). **UML** služi kot **jezik komunikacije** med vsemi deležniki — zagotavlja, da vsi razumejo isti sistem na enak način. Bankomat je **tipičen primer IS**, na katerem se jasno pokažejo vse faze razvoja in vsi trije ključni diagrami (primeri uporabe, razredni diagram, diagram zaporedja).

---

## 9. Simulacija projekta

### Razvoj IS kot niz odločitev

Razvoj informacijskega sistema ni le tehnični podvig, temveč je tudi **upravljanje projekta**, ki zahteva **odločitve** in soočanje s **tveganji** (angl. *risks*). Viri so vedno **omejeni** — proračun in čas sta končna — ob tem pa se pojavljajo **nepredvidljivi dogodki** (angl. *unexpected events*), ki lahko projekt pospešijo ali upočasnijo. Cilj vsakega razvojnega projekta je **uspešna dostava** sistema znotraj časovnih in finančnih omejitev ter ob ustrezni kakovosti.

### Pravila simulacije

Simulacija projekta poteka po naslednjih pravilih. Delo poteka v **skupinah**, pri čemer vsaka **iteracija** (angl. *iteration*) zajema natanko eno **odločitev** — izbiro enega primera uporabe za razvoj. Projekt ima omejen **proračun** (maksimalno 100.000 €) in omejen **čas** (maksimalno 31 tednov). En zaposleni stane **1.000 € na teden** in izdela **5 enot primerov uporabe na teden** (ena enota ustreza relativni ceni izdelave primera uporabe). K vsaki iteraciji se prišteje **1 teden** za načrtovanje in režijo. Stroški na teden se izračunajo kot 1.000 € × število zaposlenih, urnik v tednih pa kot 1 + (skupno število enot PU) / (5 × število zaposlenih), pri čemer se čas **zaokroži navzgor**.

### Dodatna pravila

Relativne cene primerov uporabe so **konstantne** — se ne spreminjajo med iteracijami. V eni iteraciji se razvija natanko **1 primer uporabe**. Možna je **delna dodelitev** zaposlenih (z natančnostjo 10 %) — npr. 2,5 zaposlenega. Izračunan čas za iteracijo se vedno **zaokroži navzgor** na celo število tednov.

### Nepredvideni dogodki

Med izvajanjem projekta se pojavijo **nepredvideni dogodki**, ki vplivajo na potek dela. Ti vključujejo: **spremembe zahtev** — naročnik spremeni ali doda zahteve med razvojem; **odhod člana ekipe** — zmanjšanje razvojne kapacitete; **tehnične probleme** — nepričakovane težave s tehnologijo ali infrastrukturo; ter **priložnosti** — npr. možnost dodajanja nove funkcionalnosti, ki poveča vrednost sistema. Ekipa mora na te dogodke reagirati z ustreznimi prilagoditvami načrta.

### Uspešnost projekta in izračun točk

Uspešnost projekta se meri po štirih merilih: **čas izvedbe**, **stroški**, **kakovost rešitve** in **zadovoljstvo uporabnika**. V simulaciji se rezultat izračuna po formuli: začetna vrednost je **2.000 točk**, h kateri se prišteje ali odšteje **±400 točk za vsak teden pred ali po roku**, **±200 točk za vsakih 3.000 € pod ali čez proračun** ter **−200 točk za vsak nedokončan primer uporabe**. Ta formula spodbuja uravnotežen pristop — ne le hitrost ali varčnost, temveč dokončanje vseh funkcionalnosti v ustreznem času in proračunu.

### Potek simulacije in refleksija

Vsaka iteracija simulacije poteka v petih korakih: (1) izdelajte **načrt iteracije** — izberite primer uporabe, določite število zaposlenih in izračunajte čas ter stroške; (2) ocenite predlog ekipe in načrt iteracije; (3) preučite naključno izbran **nepričakovan dogodek**; (4) izdelajte končno **oceno iteracije** na podlagi nepričakovanega dogodka; (5) prenovite plan za preostanek projekta in začnite naslednjo iteracijo ali zaključite projekt. Ob koncu simulacije sledi **refleksija**: kaj je delovalo, kaj bi naredili drugače in kje so bile največje napake. Namen simulacije je praktična izkušnja, da razvoj IS ni le modeliranje in kodiranje, temveč tudi **upravljanje virov, tveganj in kompromisov**.

---

## Ključni pojmi za ponavljanje

| Pojem | Definicija |
|---|---|
| **UML (Unified Modeling Language)** | Standardizirani jezik za modeliranje IS; omogoča več pogledov na sistem z različnimi diagrami |
| **Diagram primerov uporabe (Use Case Diagram)** | Diagram, ki prikazuje funkcionalne zahteve s pogledom od zunaj — akterji, primeri uporabe, meja sistema |
| **Akter (Actor)** | Vloga (uporabnik ali zunanji sistem), ki interagira s sistemom; prikazan kot palčka na diagramu |
| **Primer uporabe (Use Case)** | Funkcionalnost, ki jo sistem nudi akterju; opisan s tokom dogodkov, akterjem in rezultatom |
| **Meja sistema (System Boundary)** | Pravokotnik na diagramu primerov uporabe, ki ločuje notranjost sistema od zunanjega okolja |
| **«include»** | Povezava med primeri uporabe; označuje obvezno vključitev enega primera uporabe v drugega |
| **«extend»** | Povezava med primeri uporabe; označuje neobvezno razširitev pod določenimi pogoji |
| **Razredni diagram (Class Diagram)** | Strukturni diagram, ki prikazuje razrede, atribute, operacije in relacije med njimi |
| **Števnost (Multiplicity)** | Oznaka na asociaciji, ki določa, koliko primerkov razreda lahko sodeluje v relaciji (npr. 1, 0..1, *) |
| **Asociacija (Association)** | Povezava med dvema razredoma v razrednem diagramu |
| **Posploševanje (Generalization)** | Relacija dedovanja med nadrazredom in podrazredi v razrednem diagramu |
| **Omejitev (Constraint)** | Pogoj, ki mora veljati v razrednem diagramu (npr. poslovne pravilo) |
| **Diagram zaporedja (Sequence Diagram)** | Vedenjski diagram, ki prikazuje potek komunikacije med objekti skozi čas |
| **Življenjska črta (Lifeline)** | Navpična črtkana črta, ki predstavlja obstoj objekta skozi čas v diagramu zaporedja |
| **Aktivacijski blok (Activation)** | Pravokotnik na življenjski črti, ki označuje obdobje, ko je objekt aktiven |
| **Sporočilo (Message)** | Horizontalna puščica med življenjskimi črtami; predstavlja klic metode ali komunikacijo |
| **Samoklic (Self-call)** | Sporočilo, ki ga objekt pošlje samemu sebi |
| **Zanka (Loop)** | Ponavljajoči se blok v diagramu zaporedja s pogojem ponavljanja |
| **Diagram komponent (Component Diagram)** | Diagram, ki prikazuje arhitekturno zgradbo sistema — komponente in vmesnike |
| **Diagram postavitve (Deployment Diagram)** | Diagram, ki prikazuje fizično/virtualno infrastrukturo in nameščene artefakte |
| **BCE vzorec (Boundary-Control-Entity)** | Vzorec za razvrščanje objektov: mejni (vmesnik), krmilni (logika) in entitetni (podatki) |
| **Mejni objekt (Boundary Object)** | Objekt, ki upravlja komunikacijo med sistemom in zunanjim svetom (npr. uporabniški vmesnik) |
| **Krmilni objekt (Control Object)** | Objekt, ki koordinira poslovno logiko in tok dogajanja |
| **Entitetni objekt (Entity Object)** | Objekt, ki hrani podatke (npr. kartica, dnevnik transakcij) |
| **Funkcionalne zahteve (Functional Requirements)** | Zahteve, ki opisujejo, kaj sistem omogoča (npr. dvig denarja, preverjanje stanja) |
| **Atributi kakovosti (Quality Attributes)** | Nefunkcionalne zahteve — kako dobro sistem deluje (varnost, odzivnost, zanesljivost) |
| **Tok dogodkov (Flow of Events)** | Zaporedje korakov pri izvajanju primera uporabe |
| **Iteracija (Iteration)** | En cikel razvoja v simulaciji projekta; zajema eno odločitev in en primer uporabe |
| **Simulacija projekta** | Praktična vaja upravljanja IS-projekta z omejenimi viri, odločitvami in nepredvidljivimi dogodki |
