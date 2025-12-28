#! /bin/bash

if [ $# -ne 2 ]; then
	echo "Uporaba: $0 N K"
	exit 1
fi

N=$1
K=$2

echo "define f(x) {if (x>1) {return x*f(x-1)}; return 1}; f($N + $K - 1)/(f($K)*f($N - 1))" | BC_LINE_LENGTH=99999 bc
