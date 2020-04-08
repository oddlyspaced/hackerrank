#!/bin/bash
javac $1
IFS="."
read -a strarr <<< "$1"
echo "Executing class..."
java ${strarr[0]}
