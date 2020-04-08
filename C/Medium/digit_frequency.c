// https://www.hackerrank.com/challenges/frequency-of-digits-1/problem
#include<stdio.h>

int main() {
    char str[1024];
    gets(str);
    int count[10];
    for (int i = 0; i < 10; i++)
    count[i] = 0;
    for (int i = 0; str[i] != '\0'; i++) {
        int ascii = (int)str[i] - 48;
        if (ascii >= 0 && ascii <= 9) {
            count[ascii]++;
        }
    }
    for (int i = 0; i < 10; i++) {
        printf("%d ", count[i]);
    }
}