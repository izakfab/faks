# P12 — Od pisanja kode do razvoja z UI

**Predmet:** Osnove informacijskih sistemov (OIS) 2025/2026
**Predavatelj:** izr. prof. dr. Dejan Lavbič
**Datum predavanja:** 20. 5. 2026

---

## 1. Vibe coding: nova vloga razvijalca

### Kaj je vibe coding?

**Vibe coding** je pristop k razvoju programske opreme po načelu **najprej namen, nato koda** (angl. *intent-first development*). Razvijalec opiše želeno funkcionalnost v **naravnem jeziku** (angl. *natural language*), **umetna inteligenca** (UI) pa zapolni **implementacijske podrobnosti** — dejansko kodo, konfiguracijo in strukturo. Cilj vibe codinga je **hitro raziskovanje** (angl. *rapid exploration*) idej in prototipov, pri čemer je uporabnik ves čas vključen **v zanko** (angl. *human-in-the-loop*) — pregleduje, usmerja in potrjuje rezultate. Izraz je populariziral Addy Osmani v knjigi *Beyond Vibe Coding: From Coder to AI-Era Developer* (2025), ki ga opisuje kot raziskovalni pristop, pri katerem razvijalec v naravnem jeziku opiše, kaj želi, veliki jezikovni model pa zapolni podrobnosti.

### Nova vloga razvijalca

V dobi UI-podprtega razvoja se vloga razvijalca spreminja. UI postaja **sodelavec pri razvoju** (angl. *AI as collaborator*), razvijalec pa prevzema vlogo **vizionarja**, **arhitekta** in **orkestratorja**. Namesto ročnega pisanja vsake vrstice kode se razvijalec osredotoča na tri ključna področja: **namen** (kaj želimo doseči), **načrtovanje** (kako naj bo sistem zasnovan) in **presojo kakovosti** (ali generirani rezultat ustreza zahtevam). Ključni izziv tega prehoda je **paradoks znanja** (angl. *knowledge paradox*) — da bi lahko učinkovito ocenjevali in usmerjali UI-generirano kodo, mora razvijalec še vedno globoko razumeti programiranje, arhitekturo in inženirske prakse, čeprav sam piše manj kode kot nekoč.

### Spekter kodiranja z UI

Kodiranje s pomočjo UI ni enoten pristop, temveč se razteza po **spektru** med dvema skrajnostma. Na enem koncu je **vibe coding**, ki sledi toku ideja → pogovor → prototip. Zanj je značilna večja **hitrost** razvoja, a tudi več **negotovosti** glede kakovosti in pravilnosti rezultata. Na drugem koncu spektra je **inženiring s pomočjo UI** (angl. *AI-assisted engineering*), ki sledi postopku načrt → omejitve → preverjanje. Ta pristop zahteva več **discipline**, a zagotavlja boljšo **vzdrževalnost** (angl. *maintainability*) in zanesljivost končnega izdelka. Razvijalec se med projektom premika po tem spektru — vibe coding za hitro preizkušanje idej, inženiring s pomočjo UI pa za produkcijsko kodo.

---

## 2. Načrtno usmerjeno inženirstvo z UI

### Od specifikacije do testiranja

**Načrtno usmerjeno inženirstvo z UI** (angl. *design-driven AI engineering*) je bolj strukturiran pristop, pri katerem razvijalec ne prepusti usmeritve UI-ju, temveč vodi celoten proces. Postopek poteka v petih korakih: najprej razvijalec pripravi **specifikacijo** (angl. *specification*) — jasen opis zahtev in omejitev. Nato oblikuje **ciljane pozive** (angl. *targeted prompts*), ki UI usmerijo k želenemu rezultatu. Sledi **pregled kode**, ki jo je generirala UI — razvijalec preveri, ali koda ustreza specifikaciji. Pregledano kodo nato **integrira v projekt** — umesti jo v obstoječo arhitekturo in kodne baze. Zadnji korak je **obvezno testiranje** — preverjanje pravilnosti z enotskimi testi, integracijskimi testi in ročnim pregledom.

### Pozivi kot mikro-specifikacije

**Poziv** (angl. *prompt*) ni le vprašanje, temveč deluje kot **opis namena** — mikro-specifikacija, ki UI pove, kaj naj ustvari. UI pri tem nastopa kot **sogovornik** (angl. *conversational partner*) — proces razvoja postane dialog, v katerem razvijalec postopoma natančuje zahteve. Kakovost generirane kode je neposredno odvisna od treh lastnosti poziva: **konteksta** (kakšno je okolje, projekt, obstoječa koda), **jasnosti** (ali je namen nedvoumen) in **omejitev** (kaj koda ne sme početi, katere tehnologije mora ali ne sme uporabiti). Razvoj tako postane iterativen **dialog** med razvijalcem in UI.

### Dober poziv zmanjša stopnjo ugibanja

Nejasen poziv vodi v **ugibanje** (angl. *guessing*) — UI mora predpostavljati kontekst in namen, kar pogosto rezultira v generični ali napačni kodi. Specifičen poziv pa vodi do **boljše rešitve**, ker UI prejme dovolj informacij za natančen odgovor. Razvijalec naj v poziv vključi: **jezik in okolje** (npr. Python 3.12, Flask), **namen funkcije** (kaj natančno naj funkcija počne), **primer vhoda in izhoda** (konkreten primer pričakovanega delovanja), **napako** (če gre za odpravljanje hrošča — katera napaka se pojavlja), ter **omejitve in robne primere** (angl. *edge cases*). Po prejemu generirane kode sledi cikel **pregled → popravek → ponovitev** (angl. *review → fix → iterate*), dokler rezultat ne ustreza zahtevam.

---

## 3. Problem 70 %: hitro do osnutka, težje do produkcijske rešitve

### Prvih 70 % in zadnjih 30 %

UI lahko hitro izdela **prvih 70 %** rešitve — osnovno strukturo, rutinsko logiko in začetni prototip. Vendar pa **zadnjih 30 %** zahteva **človeško presojo** (angl. *human judgment*), ki je UI trenutno še ne zmore zanesljivo zagotoviti. V teh 30 % spadajo: **arhitektura** sistema — kako se komponente povezujejo in komunicirajo; **robni primeri** (angl. *edge cases*) — situacije, ki jih tipičen poziv ne opiše, a se pojavljajo v resničnem svetu; **kakovost kode** — berljivost, učinkovitost, skladnost s standardi; in **kontekst uporabnikov** — razumevanje, kdo in kako bo sistem dejansko uporabljal. Razvijalec tako nastopa kot **arhitekt in urednik** — zagotavlja celostno kakovost, ki presega zmožnosti same UI.

### Nevarnost dveh korakov nazaj

Pri uporabi UI za popravljanje napak obstaja nevarnost, ki jo Osmani imenuje **dva koraka nazaj** (angl. *two steps back*). Vzorec je naslednji: razvijalec najde napako, UI predlaga popravek, ki se zdi razumen, vendar ta popravek uvede nove, nepredvidene težave. Razvijalec nato prosi UI, naj popravi nove težave, kar ustvari nadaljnje probleme — cikel se ponavlja. **Boljši vzorec** je uporaba UI kot **validatorja** (angl. *AI as validator*): razvijalec sam napiše kodo, UI pa jo analizira, poišče potencialne hrošče, varnostne ranljivosti in predlaga izboljšave. V tem modelu razvijalec ohranja nadzor nad kodo, UI pa dopolnjuje človeško presojo z avtomatiziranim pregledom.

---

## 4. Odgovorna uporaba UI pri razvoju

### Pregled, popravek, prevzem

Pri delu z UI-generirano kodo velja načelo **preglej, popravi, prevzemi**. Razvijalec mora generirano kodo primerjati s prvotnim **namenom** — ali koda dejansko rešuje zastavljeni problem. Preveriti mora **predpostavke** (angl. *assumptions*), ki jih je UI naredila — ali so smiselne v danem kontekstu. Poiskati mora **robne primere**, **napake** in **neustrezne odvisnosti** (angl. *inappropriate dependencies*) — knjižnice ali module, ki niso primerni za projekt. Dodati mora **teste** (angl. *tests*) — tako enotske kot integracijske — ki preverijo pravilnost kode. Ključno je zavedanje: **po sprejemu je koda tvoja odgovornost** — ne glede na to, kdo ali kaj jo je napisal.

### UI prototipiranje: od ideje do osnutka

**UI prototipiranje** (angl. *AI prototyping*) služi **hitremu preverjanju ideje** (angl. *rapid idea validation*). UI ustvari **prvi prototip** na podlagi opisa, razvijalec pa vodi **iteracije** — popravi opis, preizkusi rezultat, izboljša naslednji cikel. Tipični iteracijski cikel je: začetni poziv → prototip v1 → popravek opisa (npr. "spremeni X") → prototip v2 → dodajanje funkcionalnosti (npr. "dodaj Y") → prototip v3 → preizkušanje in testiranje. Bistveno je zavedanje, da **prototip ni produkcijska rešitev** (angl. *prototype ≠ production*) — služi za validacijo koncepta, ne pa za neposredno uvedbo v produkcijo.

### Spletna aplikacija z UI: celoten sklad

UI lahko pomaga pri razvoju **celotnega sklada** (angl. *full stack*) spletne aplikacije. **Čelni del** (angl. *frontend*) obsega komponente uporabniškega vmesnika, obrazce in upravljanje stanj. **Zaledni del** (angl. *backend*) vključuje API-je, validacijo in poslovno logiko. **Podatkovna plast** (angl. *data layer*) zajema podatkovne modele, migracije in poizvedbe. Razvijalec pri tem določi **arhitekturo** — kakšna je struktura sistema, katere tehnologije se uporabljajo, kako se komponente povezujejo — UI pa pripravi **rutinsko kodo** (angl. *boilerplate code*), ki sledi razvijalčevim smernicam.

### Celostni razvoj: vmesniki, testi, validacija

Pri celostnem razvoju je ključna **uskladitev vmesnikov** (angl. *interface alignment*) med čelnim in zalednim delom. Razvijalec mora preveriti: **obliko JSON odzivov** (angl. *JSON response shape*) — ali struktura odgovora ustreza pričakovanjem čelnega dela; **imena polj** — ali so konsistentna med vsemi plastmi; ter **napake in stanja nalaganja** (angl. *error and loading states*) — ali so napake ustrezno obravnavane in uporabniku sporočene. UI pomaga pri pisanju **testov**, človek pa zagotovi **kakovost celote** — skladnost med vsemi deli sistema.

---

## 5. Varnost UI-generirane kode

### Zaupaj, vendar preveri

Pri UI-generirani kodi velja načelo **zaupaj, vendar preveri** (angl. *trust, but verify*). **Hitrost** razvoja ne pomeni avtomatično tudi **varnosti** — UI lahko nenamerno uvede **ranljivosti** (angl. *vulnerabilities*) v kodo. Med pogoste varnostne težave spadajo: **skrivnosti v kodi** (angl. *hardcoded secrets*) — gesla, API-ključi ali tokeni, zapisani neposredno v izvorno kodo; **SQL injection** — napad, pri katerem napadalec prek vhodnih polj vstavi zlonamerne SQL-poizvedbe; **XSS** (angl. *Cross-Site Scripting*) — vstavljanje zlonamernih skriptov v spletne strani; in **šibka avtentikacija** (angl. *weak authentication*) — nezadostno preverjanje identitete uporabnikov. Zato je pri UI-generirani kodi potreben temeljit **varnostni pregled** (angl. *security review*).

### Varnostni pregled UI kode

Varnostni pregled UI-generirane kode vključuje več ravni. **SAST** (angl. *Static Application Security Testing*) je statična analiza izvorne kode, ki poišče potencialne ranljivosti brez zagona aplikacije, skupaj s **pregledom odvisnosti** (angl. *dependency review*) — preverjanjem, ali uporabljene knjižnice nimajo znanih ranljivosti. **Varnostni testi** (angl. *security tests*) preverjajo obnašanje aplikacije v simuliranih napadnih scenarijih. UI lahko nastopi kot **dodatni recenzent** (angl. *additional reviewer*) — analizira kodo z varnostnega vidika. Preverjati je treba tri ključna področja: **vhod/izhod** (angl. *input/output*) — ali so vsi uporabniški vhodi ustrezno validirani; **avtorizacijo** (angl. *authorization*) — ali imajo uporabniki dostop le do virov, ki jim pripadajo; in **odvisnosti** (angl. *dependencies*) — ali so vse knjižnice posodobljene in varne. Varnostne preverbe je smiselno **vključiti v CI/CD** (angl. *Continuous Integration/Continuous Deployment*) — avtomatizirani cevovod za gradnjo, testiranje in uvajanje programske opreme.

---

## 6. Zanesljivost in vzdrževanje

### Zanesljivost po pospešku UI

UI ustvari kodo **hitro**, a hitreje nastala koda zahteva dodatno pozornost na **zanesljivost** (angl. *reliability*). Za zagotavljanje zanesljivosti so potrebni: **testi** (angl. *tests*) — avtomatizirani preizkusi, ki preverjajo pravilnost delovanja; **postopno uvajanje** (angl. *gradual rollout*) — nova koda se najprej uvede za majhen delež uporabnikov, šele nato za vse; in **možnost vrnitve nazaj** (angl. *rollback capability*) — zmožnost hitrega preklopa na prejšnjo, delujočo različico v primeru težav.

### Vzdrževalnost

Dolgoročno **vzdrževanje** (angl. *maintenance*) UI-generirane kode zahteva pozornost na: **slog kodiranja** (angl. *coding style*) — doslednost poimenovanj, oblikovanja in strukture; **modularnost** (angl. *modularity*) — razdelitev kode na logične, neodvisne enote, ki jih je mogoče ločeno razvijati in testirati; in **dokumentacijo** (angl. *documentation*) — jasne opise namenov, vmesnikov in odločitev. Končni cilj je **produkcijska stabilnost** (angl. *production stability*) — sistem, ki zanesljivo deluje v resničnem okolju in ga je mogoče učinkovito vzdrževati in nadgrajevati.

---

## 7. Odgovornost razvijalca

### Etična in profesionalna odgovornost

Odgovorna uporaba UI pri razvoju zahteva sistematičen pristop. Razvijalec mora **odstraniti občutljive podatke** (angl. *sensitive data*) — preden kodo ali podatke deli z UI, odstrani osebne podatke, gesla in poslovne skrivnosti. Preveriti mora **intelektualno lastnino in licence** (angl. *IP/licenses*) — ali generirani kodi ne kršijo avtorskih pravic ali licenčnih pogojev. Preveriti mora **pristranskost** (angl. *bias*) — ali koda ali podatki ne vsebujejo diskriminatornih vzorcev. Izvesti mora **varnostni pregled** — kot je opisano v prejšnjem poglavju. **Dokumentirati mora uporabo UI** (angl. *document AI usage*) — zabeležiti, kateri deli kode so bili generirani s pomočjo UI. Nad vsem tem stoji temeljno načelo: **odgovornost ostane pri razvijalcu** — ne glede na to, da je kodo generirala UI.

---

## 8. Avtonomni agenti za kodiranje

### Od pomočnika do agenta

Razvoj UI orodij poteka po lestvici avtonomije — od **Copilota** (angl. *Copilot*), ki predlaga posamezne vrstice kode v realnem času, do **agenta** (angl. *agent*), ki samostojno izvede celotno nalogo. Agent prejme opis naloge, jo **izvede v ozadju** (angl. *runs in the background*) v **zaščitenem okolju** (angl. *sandbox*) — izoliranem okolju, kjer morebitne napake ne vplivajo na produkcijski sistem. Rezultat agentovega dela so: **spremembe kode** (angl. *code changes*), **testi** in **pull request** (angl. *pull request*) — zahtevek za vključitev sprememb v glavno vejo kode. Človek pri tem ostane **recenzent** (angl. *reviewer*) — pregleduje in potrjuje delo agenta, preden se spremembe združijo v projekt.

### Učinkovita uporaba agentov

Za učinkovito uporabo kodirnih agentov je treba upoštevati več načel. Izbrati je treba **omejene naloge** (angl. *scoped tasks*) — jasno definirane, zaključene enote dela. Preden agent začne, je treba preveriti **načrt agenta** (angl. *agent plan*) — kako namerava nalogo izvesti. **Vzporednost** (angl. *concurrency*) je treba omejiti — preveliko število hkratno delujočih agentov ustvari kaos. Pričakovati je treba **zastoj pregledov** (angl. *review bottleneck*) — več agentov ustvari več zahtevkov za pregled, kar obremeni razvijalce. Meriti je treba: **teste** (ali testi uspejo), **diff** (ali so spremembe smiselne in minimalne) in **skladnost z arhitekturo** (ali spremembe spoštujejo obstoječo strukturo). Ključna miselnost je, da je agent primerljiv z **mlajšim razvijalcem** (angl. *junior developer*) — učinkovit pri rutinskih nalogah, a potrebuje nadzor in vodenje izkušenega razvijalca.

---

## 9. UI čez celoten razvojni cikel

### Širša vloga UI v razvoju

UI ni več samo **generator kode** (angl. *code generator*). Sodobna orodja pomagajo na vseh stopnjah razvojnega cikla: pri **zahtevah** (angl. *requirements*) — pomagajo razjasniti in strukturirati uporabniške zgodbe; pri **testiranju** (angl. *testing*) — generirajo testne primere in testno kodo; pri **razhroščevanju** (angl. *debugging*) — analizirajo napake in predlagajo popravke; pri **vzdrževanju** (angl. *maintenance*) — identificirajo zastarelo kodo in predlagajo posodobitve; pri **preoblikovanju** (angl. *refactoring*) — prestrukturirajo kodo za boljšo berljivost in učinkovitost; in pri **projektni koordinaciji** (angl. *project coordination*) — pomagajo pri triažiranju napak, upravljanju nalog in komunikaciji. Kljub vsemu pa človek ostane **usmerjevalec** (angl. *director*) — tisti, ki postavlja cilje, sprejema odločitve in nosi odgovornost.

### Prihodnost programiranja: namen pred sintakso

Prihodnost programiranja se premika proti **več naravnega jezika** in **več specifikacij** v razvojnem procesu, z **manj sintakse** — manj ročnega pisanja kode v tradicionalnem smislu. Razvoj bo vse bolj potekal kot **pogovor** (angl. *conversation*) med razvijalcem in UI: zahteva → pojasnilo → koda → testi → popravek → ponovitev. **Veščine prihodnosti** (angl. *future skills*) za razvijalce so: **jasno izražanje namena** (angl. *clear intent articulation*) — zmožnost natančnega opisa želenega obnašanja; **sistemsko razmišljanje** (angl. *systems thinking*) — razumevanje, kako se deli sistema povezujejo v celoto; in **presoja kakovosti** (angl. *quality judgment*) — zmožnost ocenjevanja, ali je rešitev dovolj dobra za produkcijo.

---

## 10. Praktični prikaz: Smart Events

### Primer za demonstracijo

**Smart Events** je mini informacijski sistem za **priporočanje dogodkov**, razvit kot učni primer za prikaz UI-podprtega razvoja. Sistem kot vhod prejme uporabnikove **interese** (npr. UI, šport, kultura), **razpoložljivost** (prosti časovni termini) in **lokacijo** (npr. Ljubljana). Na podlagi teh podatkov vrne **razvrščene in razložene predloge** — seznam priporočenih dogodkov z obrazložitvijo, zakaj so primerni za danega uporabnika. Primer je namenoma preprost: brez strojnega učenja, a z dovolj poslovnih pravil, da prikaže realen razvojni potek s pomočjo UI.

### Tri ravni uporabe UI na istem projektu

Na primeru Smart Events so prikazane tri ravni uporabe UI z naraščajočo avtonomijo. **Copilot v IDE** (angl. *Copilot in IDE*) je prva raven — UI pomaga pri posamezni funkciji, razlaga obstoječo kodo, predlaga popravke in generira teste. **Agent mode** je druga raven — UI samostojno izvede omejeno nalogo z več koraki, spreminja več datotek hkrati in ustvari celovit pull request. **Codex CLI + proces** je tretja raven — UI deluje v okviru trajnih pravil (angl. *persistent rules*) in **skillov** (angl. *skills*) — vnaprej definiranih navodil, ki zagotavljajo ponovljivo kakovost. Ta raven omogoča **ponovljiv pregled kakovosti** (angl. *repeatable quality checks*) in dosledno upoštevanje standardov projekta.

### Opažanja med demonstracijo

Med demonstracijo se pojavljajo ključna vprašanja: ali je naloga **dovolj jasno opisana** (angl. *well-scoped*), da jo UI lahko smiselno izvede? Kaj orodje naredi **samostojno** (angl. *autonomously*) — brez posredovanja razvijalca? In kaj mora človek še vedno **pregledati**, **preizkusiti** in **presoditi** (angl. *review, test, judge*)? Ključna poanta je, da **več avtonomije pomeni tudi več potrebe po procesu** (angl. *more autonomy requires more process*) — ko UI prevzame večji delež izvedbe, postane sistematičen pregled, testiranje in varnostna presoja še bolj nujna.

---

## 11. One-man-band: en razvijalec orkestrira agente

### Everything Claude Code (ECC)

Koncept **"one-man-band"** (angl. *one-man-band*) opisuje scenarij, v katerem en sam razvijalec z orkestriranjem več UI agentov dosega rezultate, ki bi jih prej zahtevala celotna ekipa. Primer tega je projekt **Everything Claude Code (ECC)**, zmagovalec na **Anthropic Hackathonu**. Projekt vključuje **38 agentov**, ki skupaj ponujajo **156 skillov** in **72 ukazov** za raznolike razvojne naloge. Ključne značilnosti so **selektivna namestitev** (angl. *selective installation*) — razvijalec namesti le agente, ki jih potrebuje — in **varnostni pregled agentov** (angl. *agent security review*) — preverjanje, ali agenti ne izvajajo škodljivih dejanj.

---

## Ključni pojmi za ponavljanje

| Pojem | Definicija |
|---|---|
| **Vibe coding** | Pristop k razvoju po načelu najprej namen, nato koda — opis v naravnem jeziku, UI zapolni implementacijske podrobnosti |
| **Paradoks znanja (Knowledge Paradox)** | Za učinkovito uporabo UI-generiranega koda mora razvijalec še vedno globoko razumeti programiranje |
| **Inženiring s pomočjo UI (AI-Assisted Engineering)** | Strukturiran pristop: načrt → omejitve → preverjanje, z večjo disciplino in boljšo vzdrževalnostjo |
| **Poziv (Prompt)** | Opis namena, ki deluje kot mikro-specifikacija za UI; kakovost kode je odvisna od konteksta, jasnosti in omejitev |
| **Problem 70 %** | UI hitro izdela prvih 70 % rešitve, zadnjih 30 % (arhitektura, robni primeri, kakovost) zahteva človeško presojo |
| **Dva koraka nazaj (Two Steps Back)** | Vzorec, kjer popravek UI-generirane napake uvede nove težave, cikel pa se ponavlja |
| **UI kot validator (AI as Validator)** | Boljši vzorec: razvijalec piše kodo, UI jo analizira in predlaga izboljšave |
| **Robni primeri (Edge Cases)** | Situacije, ki jih tipičen opis ne pokrije, a se pojavljajo v resničnem svetu |
| **SAST (Static Application Security Testing)** | Statična analiza izvorne kode za odkrivanje ranljivosti brez zagona aplikacije |
| **SQL injection** | Napad, pri katerem napadalec prek vhodnih polj vstavi zlonamerne SQL-poizvedbe |
| **XSS (Cross-Site Scripting)** | Vstavljanje zlonamernih skriptov v spletne strani |
| **Zaščiteno okolje (Sandbox)** | Izolirano okolje, v katerem agent izvaja kodo brez vpliva na produkcijski sistem |
| **Pull request** | Zahtevek za vključitev sprememb kode v glavno vejo projekta |
| **Postopno uvajanje (Gradual Rollout)** | Uvedba nove kode najprej za majhen delež uporabnikov, nato za vse |
| **Možnost vrnitve nazaj (Rollback)** | Zmožnost hitrega preklopa na prejšnjo, delujočo različico sistema |
| **CI/CD (Continuous Integration/Continuous Deployment)** | Avtomatizirani cevovod za gradnjo, testiranje in uvajanje programske opreme |
| **Avtonomni agent (Autonomous Agent)** | UI orodje, ki samostojno izvede celotno razvojno nalogo v ozadju |
| **Copilot** | UI pomočnik v razvojnem okolju, ki predlaga kodo v realnem času |
| **Skill** | Vnaprej definirano navodilo za agenta, ki zagotavlja dosledno kakovost in ponovljivost |
| **Celoten sklad (Full Stack)** | Razvoj vseh plasti aplikacije: čelni del, zaledni del in podatkovna plast |
| **Smart Events** | Mini IS za priporočanje dogodkov — učni primer za prikaz UI-podprtega razvoja |
| **Everything Claude Code (ECC)** | Projekt z 38 agenti, 156 skilli in 72 ukazi; zmagovalec na Anthropic Hackathonu |
