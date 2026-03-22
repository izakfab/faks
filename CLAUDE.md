# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository Overview

University coursework repository for student **63250060** (Izak Fabjan). Three subject areas:

- `Programiranje/` — Programming (Java + C)
- `OsnoveDigitanihVezij/` — Digital circuits (Logisim `.circ` files)
- `Fizika/` — Physics materials

## File Naming Convention

All submitted files use the student ID suffix: `DNxx_63250060.java` or `DNxx_63250060.c`

## Java Assignments (`Programiranje/Java/DomaceNaloge/`)

Compile and run a homework assignment:
```bash
javac DNxx_63250060.java
java DNxx_63250060 < test.in
```

Run against a specific test case (e.g., from `DNxx_javniTesti/`):
```bash
java DNxx_63250060 < DNxx_javniTesti/test01.in
```

Compare against expected output:
```bash
java DNxx_63250060 < DNxx_javniTesti/test01.in | diff - DNxx_javniTesti/test01.out
```

## C Assignments (`Programiranje/C/DomaceNaloge/`)

Subparts `a/` and `b/` correspond to sub-problems of the same DN. Compile and run:
```bash
gcc -o dn1 DN01a_63250060.c
./dn1 < test.in
```

## Tekmovanje (Competition, `Programiranje/Java/Tekmovanje/`)

The test runner script `Testi/Generator/tj.sh` compiles and runs all tests:
```bash
cd Testi/Generator
./tj.sh Tekm_63250060
```
Expects test files in `in/testNN.in`, reference outputs in `out/testNN.out`, writes results to `res/`.

## Test Format

Each test set contains:
- `testNN.in` — input
- `testNN.out` — expected output
- `testNN.res` — actual output (generated after running)
- `prikaz.htm` — HTML results report from the online judge

Public tests: `DNxx_javniTesti/`
Hidden tests: `DNxx_skritiTesti/`

## Architecture Notes

- Java programs are single-file, single-class (`public class DNxx_63250060`), reading from `stdin` and writing to `stdout`.
- C programs use only `stdio.h` (no `printf`/`scanf` in early assignments — `putchar`/`getchar` only, implementing I/O manually).
- DN06 and DN07 have starting scaffolding in `izhodisce/` subdirectories (multiple files with partial implementations to complete).
- ODV assignments use Logisim circuit files (`.circ`); open with Logisim Evolution.
