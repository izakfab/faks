#!/bin/bash

if [ $# -ne 1 ]; then
  echo "Usage: $0 ProgramName (without .java)"
  exit 1
fi

PROG="$1"
WRONG=0

javac "$PROG".java

for f in in/test*.in; do
  F="${f:3}"
  echo "===== Running $F ====="
  java "$PROG" < "$f" > "res/${F%.in}.res"
  if ! diff -q "out/${F%.in}.out" "res/${F%.in}.res" > /dev/null; then
	  cat $f > "err/${F%.in}.err"
	  echo "Wrong answer for test $F"
	  WRONG=$((WRONG+1))
  fi
done
echo "Wrong answers: $WRONG"
