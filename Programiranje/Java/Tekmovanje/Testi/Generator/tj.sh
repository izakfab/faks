#!/bin/bash

if [ $# -ne 1 ]; then
  echo "Usage: $0 ProgramName (without .java)"
  exit 1
fi

PROG="$1"
WRONG=0

javac "$PROG".java

for f in test*.in; do
  echo "===== Running $f ====="
  java "$PROG" < "$f" > "${f%.in}.res"
  if ! diff -q "${f%.in}.out" "${f%.in}.res" > /dev/null; then
	  cat $f > ${f%.in}.err
	  echo "Wrong answer for test $f"
	  WRONG=$((WRONG+1))
  fi
done
echo "Wrong answers: $WRONG"
