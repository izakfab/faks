# P9 — Sodobni pristopi razvoja

**Predmet:** Osnove informacijskih sistemov (OIS) 2025/2026
**Predavatelj:** izr. prof. dr. Dejan Lavbič
**Datum predavanja:** 22. 4. 2026

---

## 1. Objektno razmišljanje in razvoj

### Objektno usmerjen pristop

Pri objektno usmerjenem pristopu problem razdelimo na **objekte** (angl. *objects*), pri čemer vsak objekt združuje dva vidika: **atribute** (angl. *attributes*) — lastnosti, ki opisujejo stanje objekta (npr. vrsta, velikost, starost) — in **vedenja** oz. **odgovornosti** (angl. *behaviours / responsibilities*) — dejanja, ki jih objekt zmore izvesti (npr. jej, spi, teci). Razred (angl. *class*) deluje kot načrt, iz katerega ustvarjamo posamezne primerke (objekte). Primer: razred Pes ima podatkovne člane (vrsta, velikost, starost, barva) in metode (Eat(), Sleep(), Sit(), Run()).

### Prednosti objektnega pristopa

Objektno usmerjeni pristop prinaša tri temeljne prednosti. **Organizacija** — koda je razdeljena v smiselne enote (razrede), kar olajša razumevanje in upravljanje sistema. **Prilagodljivost** (angl. *flexibility*) — spremembe znotraj enega objekta ne zahtevajo nujno sprememb drugod, kar omogoča lažje prilagajanje novim zahtevam. **Ponovna uporaba** (angl. *reuse*) — enkrat napisane razrede lahko uporabimo v več projektih ali kontekstih, kar zmanjšuje podvajanje kode in skrajšuje razvojni čas.

### Iterativni razvoj

Objektni pristop se naravno povezuje z **iterativnim razvojem** (angl. *iterative development*). Namesto enkratnega izvajanja vseh faz od začetka do konca, delo poteka v kratkih ciklih — **sprintih** (angl. *sprints*). Vsak sprint vključuje dnevne sestanke (angl. *daily scrum meetings*), delo se zajema v **product backlog** (vse želene funkcionalnosti) in **sprint backlog** (funkcionalnosti izbrane za tekoči sprint), rezultat vsakega sprinta pa je **potencialno dobavljiv inkrement proizvoda** (angl. *potentially shippable product increment*). Ta pristop omogoča pogosto povratno informacijo in hitro prilagajanje.

### Prehitro v implementacijo

Pogosta napaka pri razvoju je, da ekipa **prehitro skoči v implementacijo** (kodiranje) brez ustrezno opredeljenih **zahtev** (angl. *requirements*) in **načrta** (angl. *design*). Posledica je kaotičen razvoj, kjer se napake odkrijejo pozno, popravki pa so dragi. Discipliniran prehod od zahtev prek načrta do implementacije je ključen za kakovosten končni izdelek.

---

## 2. Od zahtev do načrta

### Zahteve

**Zahteve** (angl. *requirements*) opisujejo, **kaj želi naročnik** (angl. *client*). Niso zgolj začetna vizija — so bolj kot **vizija**, saj gredo v večjo podrobnost, in vedno vključujejo **kompromise** (angl. *trade-offs*). Naročnik mora sprejeti, da vsega ne more dobiti — omejitve časa, proračuna in tehnologije zahtevajo usklajevanje prioritet. Zahteve so podlaga za nadaljnje načrtovanje in razvoj.

### Načrt (angl. *Design*)

Ko je začetni sklop zahtev zajet, se lotimo načrtovanja, ki ima dve ravni. **Idejna zasnova** (angl. *conceptual design*) odgovarja na vprašanje **»kaj«** — opisuje **komponente** sistema, **povezave** med njimi in **odgovornosti** posameznih delov, a brez tehničnih podrobnosti. Pri tem se pogosto uporabijo prototipi uporabniškega vmesnika in kartice CRC. **Tehnična zasnova** (angl. *technical design*) pa odgovarja na vprašanje **»kako«** — opisuje **kako implementirati** komponente, vključuje podrobnosti o posameznih komponentah in uporablja formalne **diagrame** (npr. UML razredne diagrame). Idejno zasnovo pripravijo sistemski načrtovalci v sodelovanju z naročniki, tehnična zasnova pa je namenjena razvijalcem (angl. *system builders*).

### Kompromisi in kontekst

**Kompromisi** (angl. *trade-offs*) so vedno prisotni pri načrtovanju — od razvijalcev zahtevajo stalno **komunikacijo** z naročnikom in pripravljenost na **spremembe načrta**. Odločitve je treba sprejemati ob upoštevanju **atributov kakovosti** (angl. *quality attributes*), pri čemer je potrebno **ravnovesje** med njimi. Pomemben je **kontekst** — iste odločitve imajo v različnih okoljih različne posledice.

### Lastnosti kakovosti

Zahteve delimo na **funkcionalne zahteve** (angl. *functional requirements*), ki opisujejo **kaj** naj sistem počne, in **nefunkcionalne zahteve** (angl. *non-functional requirements*), ki opisujejo **kako dobro** naj to počne. Nefunkcionalne zahteve vključujejo zmogljivost, varnost, razpoložljivost in podobno. Med obema vrstama zahtev so pogosto potrebni **kompromisi** — npr. višja varnost lahko upočasni zmogljivost, bogatejši vmesnik pa podaljša razvojni čas. Analogija z avtomobilom: funkcionalna zahteva je »prevozi me iz točke A v točko B«, nefunkcionalne zahteve pa določajo, kako hitro, varno in udobno.

---

## 3. Modeliranje objektno usmerjenega sistema

### Kartice CRC

**Kartice CRC** (angl. *Class-Responsibility-Collaboration cards*) so preprosto, a učinkovito orodje za idejno zasnovo. Vsaka kartica predstavlja en **razred** (angl. *class*) in vsebuje dva stolpca: **odgovornosti** (angl. *responsibilities*) — kaj razred ve in počne — ter **sodelovalce** (angl. *collaborators*) — s katerimi drugimi razredi sodeluje za izpolnitev svojih nalog. CRC kartice so koristne za zgodnje razprave o strukturi sistema, saj jih lahko fizično razporedimo po mizi in simuliramo interakcije med razredi.

### Modeli načrta

Postopek razvoja poteka v zaporedju **zahteve → načrt → implementacija**. Načrt sam združuje **idejno** in **tehnično zasnovo**. V objektno usmerjenem pristopu razlikujemo tri tipe objektov: **entitetni objekti** (angl. *entity objects*) hranijo podatke in poslovno logiko (npr. razred Stranka), **kontrolni objekti** (angl. *control objects*) koordinirajo tok dogajanja med drugimi objekti (npr. kontroler za obdelavo naročila), **mejni objekti** (angl. *boundary objects*) pa upravljajo komunikacijo med sistemom in zunanjimi akterji — to so tipično uporabniški vmesniki ali API-ji.

### Načrtovalska struktura

**Idejna zasnova** se opira na **prototipe** in **CRC kartice** — gre za visoko-nivojski pogled, razumljiv tudi naročniku. **Tehnična zasnova** nato te koncepte prevede v formalne **UML razredne diagrame** (angl. *UML class diagrams*) z več **podrobnostmi** — tipi atributov, podpisi metod, odnosi med razredi. Tehnična zasnova je bližje **implementaciji** in služi razvijalcem kot neposreden vodnik za kodiranje.

---

## 4. Štiri osnovna načrtovalska načela

### Abstrakcija (angl. *Abstraction*)

**Abstrakcija** pomeni **poenostavitev** — osredotočimo se na **bistvene elemente** in zanemarimo nepomembne podrobnosti. Proces poteka postopno: CRC kartica vsebuje odgovornosti v naravnem jeziku, UML diagram jih formalizira v atribute in operacije, programska koda pa jih implementira v konkretnem jeziku. Na primeru razreda »Živilo« (angl. *Food*): CRC kartica navede »Poznavanje ID-ja živila«, »Poznavanje imena«, »Preverjanje, če je znižana cena«; UML diagram to prevede v atribute (ziviloID: String, ime: String, cena: double) in operacijo (jeZnizanaCena(): boolean); Java koda pa definira javni razred z ustreznimi polji in metodo.

### Ovijanje (angl. *Encapsulation*)

**Ovijanje** združuje **podatke** in **metode** v eno zaokroženo enoto — **objekt**. Ključni namen ovijanja je **nadzor dostopa** — razvijalec določi, kaj je **javno** (dostopno od zunaj) in kaj **skrito** (privatno). Zunanji deli sistema dostopajo do notranjih podatkov le prek javnih **metod** (getterji in setterji), kar zagotavlja **celovitost podatkov** — preprečuje nedovoljene spremembe stanja objekta. Primer: razred Student ima privatna atributa (povprecje: float, studijskiProgram: String) in javne metode za branje in nastavljanje vrednosti (getPovprecje(), setPovprecje(float), getStudijskiProgram(), setStudijskiProgram(String)).

### Razgradnja (angl. *Decomposition*)

**Razgradnja** razdeli **celoto** na **dele** (angl. *whole → parts*). Med objekti obstajajo trije tipi razgradnih odnosov, ki se razlikujejo po moči povezave:

**Asociacija** (angl. *association*) je **ohlapna povezava** med dvema neodvisnima objektoma. Objekta lahko obstajata neodvisno drug od drugega, števnost je tipično **0..\***. Primer: Oseba in Hotel — oseba lahko obišče nič ali več hotelov, hotel lahko gosti nič ali več oseb. V kodi se to izrazi kot parameter metode (npr. metoda igraj(Sport sport) v razredu Student).

**Agregacija** (angl. *aggregation*) je odnos tipa **»ima«** (angl. *has-a*), ki predstavlja **šibko** razmerje celota–del. Deli lahko **obstajajo samostojno**, tudi če celota preneha obstajati. Primer: letalska družba in člani posadke — če se letalska družba ukine, člani posadke kot osebe še naprej obstajajo. V UML jo označimo s **praznim rombom** na strani celote, števnost je **0..\***. V kodi celota vsebuje seznam delov (npr. ArrayList<ClanPosadke>), deli pa niso ustvarjeni znotraj celote.

**Kompozicija** (angl. *composition*) je prav tako odnos tipa **»ima«**, a gre za **močno** razmerje celota–del. Deli **ne obstajajo samostojno** — ko celota preneha obstajati, prenehajo tudi deli. Primer: hiša in prostori — brez hiše prostori ne obstajajo. V UML jo označimo s **polnim rombom** na strani celote, števnost je **1..\***. V kodi celota sama ustvari dele v svojem konstruktorju (npr. prostor = new Prostor()).

### Posploševanje (angl. *Generalization*)

**Posploševanje** pomeni izluščanje **skupnih lastnosti** več razredov v skupni **nadrazred** (angl. *superclass*). Podrazredi (angl. *subclasses*) nato te lastnosti **dedujejo** (angl. *inherit*), kar zmanjšuje **podvajanje** kode. Primer: razred Zival vsebuje atribute (steviloNog, steviloRepov, ime) in metode (hodi(), teci(), jej()); razred Lev deduje vse našteto in doda lastno metodo zarjovi().

V Javi se dedovanje implementira s ključno besedo **extends** — npr. `public class Lev extends Zival`. Podrazred kliče konstruktor nadrazreda z **super**(). Podrazred lahko tudi **prepiše** (angl. *override*) metodo nadrazreda — npr. Lev prepiše metodo hodi() z lastno implementacijo.

### Vrste dedovanja

Ločimo dva tipa dedovanja. **Implementacijsko dedovanje** temelji na razredih: en **nadrazred** ima lahko več **podrazredov**, ki dedujejo atribute in metode. **Dedovanje vmesnika** (angl. *interface inheritance*) pa temelji na vmesnikih: **vmesnik** (angl. *interface*) definira le **metode** brez implementacije (tip, ne razred), razred ga implementira z **implements**. Razred lahko implementira **več vmesnikov** (v nasprotju z implementacijskim dedovanjem, kjer ima razred le en nadrazred). To omogoča **polimorfizem** (angl. *polymorphism*) — isti vmesnik, različne implementacije. Primer: vmesnik IZival z metodami premikaj(), govori(), jej(); razred Lev implementira IZival in zagotovi konkretne implementacije teh metod. Dedovanje v obeh oblikah podpira **ponovno uporabo** kode.

### Skrivanje informacij (angl. *Information Hiding*)

Načelo **skrivanja informacij** narekuje, da vsak modul vidi le tisto, **kar potrebuje** za opravljanje svojih nalog. To pomeni **omejitev dostopa** do notranjih podrobnosti modula in zagotavljanje **jasno ločenih vmesnikov**. Skrivanje informacij je tesno povezano z **ovijanjem** (angl. *encapsulation*) — ovijanje je mehanizem (kako), skrivanje informacij pa načelo (zakaj).

### Modifikatorji dostopa

V Javi nadzor dostopa urejajo štirje **modifikatorji dostopa** (angl. *access modifiers*), ki določajo, kdo vidi atribute in metode. **public** — viden vsem (razredu, paketu, podrazredu, svetu). **protected** — viden razredu, paketu in podrazredu, ne pa svetu. **default** (brez modifikatorja) — viden le razredu in paketu. **private** — viden le znotraj razreda samega. Pravilna izbira modifikatorja je ključna za izvedbo načela skrivanja informacij.

---

## 5. Načela dobre modularne zasnove

### Evolucija programskih paradigm

Programski jeziki in paradigme se **razvijajo** v odziv na nove težave. Evolucija je potekala od **imperativnega** programiranja (podprogrami dostopajo do globalnih podatkov) prek **proceduralnega** (procedure z lokalnimi podatki in gnezdenimi podprogrami) in **modularnega** (podatki in procedure združeni v module) do **objektnega** pristopa (podatki in procedure združeni v razrede z dedovanjem in polimorfizmom). Objektno usmerjen pristop **ni vedno najboljša rešitev** — pomembno je razumevanje zgodovine in izbira paradigme glede na kontekst problema.

### Ključni načrtovalski načeli: sklopljenost in kohezija

Cilj dobrega načrtovanja je zagotoviti **prilagodljivost**, **ponovno uporabo** in **vzdržljivost** sistema. Sistem je sestavljen iz **modulov** — razredov, komponent ali storitev — ki morajo biti čim bolj preprosti in razumljivi. Kakovost modularne zasnove merimo z dvema metrikama.

**Sklopljenost** (angl. *coupling*) meri **odvisnost med moduli**. **Tesna sklopljenost** pomeni, da so moduli močno odvisni drug od drugega — to je **slab načrt**, saj sprememba enega modula zahteva spremembe v več drugih. **Šibka sklopljenost** (angl. *loose coupling*) pomeni, da so moduli čim bolj neodvisni — to je **dober načrt**. Sklopljenost merimo po stopnji (število povezav med moduli), enostavnosti povezav in prilagodljivosti. Znaki težav so veliko parametrov pri komunikaciji med moduli in težka zamenjava posameznih modulov.

**Kohezija** (angl. *cohesion*) meri **jasnost odgovornosti** posameznega modula. **Visoka kohezija** pomeni, da ima modul **en namen** — vse kar počne, je tesno povezano — to je **dober** načrt. **Nizka kohezija** pomeni, da ima modul **več namenov** — opravlja nepovezane naloge — to je **slab** načrt. Idealen sistem teži k **visoki koheziji** in **šibki sklopljenosti** — v grafu kohezija/sklopljenost se tak sistem nahaja v spodnjem desnem kvadrantu (»Ideal«). Nasprotni ekstremi so »God Object« (visoka kohezija posameznega objekta, a preveč v enem razredu — visoka sklopljenost) ali »Poorly Selected Boundaries« (slabo razmejeni moduli z visoko sklopljenostjo in nizko kohezijo).

### Načelo ločevanja pomislekov (angl. *Separation of Concerns*)

**Ločevanje pomislekov** je načelo, po katerem se vsak **pomislek** (angl. *concern*) — en vidik problema — obravnava ločeno. Načelo je tesno povezano z **razgradnjo** in vodi do uporabe abstrakcije, ovijanja in posplošitve. Rezultat je **modularnost** sistema in **lažje vzdrževanje** — sprememba enega vidika (npr. uporabniški vmesnik) ne zahteva sprememb drugega (npr. poslovna logika).

---

## 6. Presoja dobre zasnove v praksi

### Primer: Pametni telefon

Nazoren primer ilustrira, kako načrtovalska načela delujejo v praksi. V začetni, slabi zasnovi en sam razred **PametniTelefon** združuje vse funkcionalnosti: telefoniranje (telefoniraj(), sifrirajOdhodniZvok(), desifrirajDohodniZvok()) in fotografiranje (fotografiraj(), shraniSliko(), uporabiBliskavico()). Problem je **nizka kohezija** — razred ima preveč nepovezanih odgovornosti — in **ni modularnosti** — zamenjava kamere zahteva spremembo celotnega razreda.

Izboljšana zasnova identificira ločene **pomisleke** — telefon in fotoaparat — ter uvede **vmesnika** ITelefon in IFotoaparat. Razred PametniTelefon postane **koordinator**, ki vsebuje reference na vmesnika (mojTelefon: ITelefon, mojFotoaparat: IFotoaparat). Konkretne implementacije (KlasicniTelefon, FotoaparatPrveGeneracije) implementirajo ustrezni vmesnik. Rezultat je **višja kohezija** (vsak razred ima jasno odgovornost), **večja modularnost** in **zamenljivost komponent** (npr. zamenjava kamere pomeni le novo implementacijo vmesnika IFotoaparat). Kompromis je **večja sklopljenost na vmesnike** — PametniTelefon je zdaj odvisen od dveh vmesnikov.

### Konceptualna celovitost (angl. *Conceptual Integrity*)

**Konceptualna celovitost** pomeni, da sistem deluje **usklajeno** — kot da ga je zasnoval **en razvijalec**, čeprav ga v resnici razvija celotna ekipa. Dosežemo jo z: **komunikacijo** (redni sestanki, jasna dokumentacija), **pregledi kode** (angl. *code reviews*), doslednim upoštevanjem **načrtovalskih načel** in enotno **arhitekturo**.

### Doslednost in vzdrževanje

Dodatni mehanizmi za zagotavljanje doslednosti vključujejo **poenotenje pojmov** (skupni slovar, konvencije poimenovanja) in vzpostavitev **osrednje skupine** (angl. *core team*), ki skrbi za arhitekturne odločitve. Rezultat je boljša **doslednost** celotnega sistema, **lažje vzdrževanje** (nov razvijalec hitreje razume strukturo) in **jasne spremembe** (predvidljiv vpliv sprememb).

### Načela posploševanja

Pri odločanju o uporabi **posploševanja** (dedovanja) se je treba vprašati: ali podrazredi dodajajo **novo vedenje** (legitimna uporaba dedovanja) ali pa gre le za **ponovno uporabo** kode (bolje uporabiti razgradnjo). Ključno je **načelo zamenjave Liskova** (angl. *Liskov Substitution Principle*): podrazred mora biti sposoben **nadomestiti** nadrazred brez spremembe **pričakovanega vedenja** — če uporabimo podrazred namesto nadrazreda, mora program delovati enako.

### Dedovanje vs. razgradnja

Če dedovanje ni primerno (npr. ker podrazred ne bi mogel nadomestiti nadrazreda ali ker gre za odnos »ima« namesto »je«), uporabimo **razgradnjo** — ločimo funkcionalnosti v posamezne razrede, povezane prek vmesnikov. Na primeru pametnega telefona: namesto da PametniTelefon deduje od Telefon (in s tem dobi metode za fotografiranje le z nadaljnjim dodajanjem), raje uporabimo razgradnjo z vmesnikoma ITelefon in IFotoaparat, kar omogoča zamenljivost in boljšo modularnost.

---

## Ključni pojmi za ponavljanje

| Pojem | Definicija |
|---|---|
| **Objekt (Object)** | Enota, ki združuje atribute (stanje) in vedenja (metode); primerek razreda |
| **Razred (Class)** | Načrt za ustvarjanje objektov; definira atribute in metode |
| **Atributi (Attributes)** | Lastnosti objekta, ki opisujejo njegovo stanje (npr. ime, starost) |
| **Vedenja (Behaviours)** | Dejanja oz. metode, ki jih objekt lahko izvede |
| **Idejna zasnova (Conceptual Design)** | Načrt na ravni »kaj« — komponente, povezave in odgovornosti brez tehničnih podrobnosti |
| **Tehnična zasnova (Technical Design)** | Načrt na ravni »kako« — podrobnosti implementacije z diagrami (UML) |
| **Kartice CRC** | Class-Responsibility-Collaboration — kartice za identifikacijo razredov, odgovornosti in sodelovalcev |
| **Entitetni objekt (Entity Object)** | Objekt, ki hrani podatke in poslovno logiko |
| **Kontrolni objekt (Control Object)** | Objekt, ki koordinira tok dogajanja med drugimi objekti |
| **Mejni objekt (Boundary Object)** | Objekt, ki upravlja komunikacijo med sistemom in zunanjimi akterji |
| **Abstrakcija (Abstraction)** | Poenostavitev — fokus na bistvene elemente, zanemarjanje podrobnosti |
| **Ovijanje (Encapsulation)** | Združevanje podatkov in metod v objekt z nadzorom dostopa (javno/skrito) |
| **Razgradnja (Decomposition)** | Delitev celote na dele; tri oblike: asociacija, agregacija, kompozicija |
| **Asociacija (Association)** | Ohlapna povezava med neodvisnima objektoma (0..\*) |
| **Agregacija (Aggregation)** | Šibek odnos celota–del; deli obstajajo samostojno; prazen romb v UML |
| **Kompozicija (Composition)** | Močen odnos celota–del; deli ne obstajajo samostojno; poln romb v UML |
| **Posploševanje (Generalization)** | Izluščanje skupnih lastnosti v nadrazred; dedovanje |
| **Dedovanje (Inheritance)** | Mehanizem, s katerim podrazred prevzame atribute in metode nadrazreda (extends) |
| **Vmesnik (Interface)** | Tip, ki definira le metode brez implementacije; razred ga implementira z implements |
| **Polimorfizem (Polymorphism)** | Sposobnost, da isti vmesnik ali nadrazred deluje z različnimi implementacijami |
| **Skrivanje informacij (Information Hiding)** | Načelo, da modul vidi le tisto, kar potrebuje; omejitev dostopa do podrobnosti |
| **Modifikatorji dostopa** | public, protected, default, private — določajo vidnost atributov in metod |
| **Sklopljenost (Coupling)** | Mera odvisnosti med moduli; šibka = dober načrt, tesna = slab načrt |
| **Kohezija (Cohesion)** | Mera jasnosti odgovornosti modula; visoka = dober načrt, nizka = slab načrt |
| **Ločevanje pomislekov (Separation of Concerns)** | Načelo, da se vsak vidik problema obravnava ločeno; vodi v modularnost |
| **Konceptualna celovitost (Conceptual Integrity)** | Usklajenost sistema, kot da ga je zasnoval en razvijalec |
| **Načelo zamenjave Liskova (Liskov Substitution Principle)** | Podrazred mora nadomestiti nadrazred brez spremembe pričakovanega vedenja |
| **Funkcionalne zahteve (Functional Requirements)** | Zahteve, ki opisujejo, kaj naj sistem počne |
| **Nefunkcionalne zahteve (Non-functional Requirements)** | Zahteve, ki opisujejo, kako dobro naj sistem deluje (kakovost) |
