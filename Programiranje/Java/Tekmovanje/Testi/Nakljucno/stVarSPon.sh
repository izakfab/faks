#! /bin/bash

if [ $# -ne 2 ]; then
	echo "Uporaba: $0 N K"
	exit 1
fi

N=$1
K=$2

echo "$N ^ $K" | BC_LINE_LENGTH=99999 bc
