// https://www.hackerrank.com/challenges/printing-tokens-/problem
#include<stdio.h>

int main() {
    char str[1024];
    gets(str);
    char token[1024];
    for (int j = 0; j < 1024; j++) {
        token[j] = '\0';
    }
    int index = 0;
    int i = 0;
    while (1) {
        if (str[i] == ' ') {
            printf("%s\n", token);
            for (int j = 0; j < 1024; j++) {
                token[j] = '\0';
            }
            index = 0;
        }
        else if(str[i] == '\0') {
            printf("%s\n", token);
            break;
        }
        else {
            token[index++] = str[i];
        }
        i++;
    }
}