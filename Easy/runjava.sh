#!/bin/bash
javac $1
IFS="."
read -a strarr <<< "$1"
java ${strarr[0]}
