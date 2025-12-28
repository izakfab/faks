#! /bin/bash
RAND=$(head -c 128 /dev/urandom | od -An -tu8 | tr -d ' ' | tr -d '\n')
echo "$RAND % ($1) + 1" | BC_LINE_LENGTH=99999 bc
