// https://www.hackerrank.com/challenges/1d-arrays-in-c/problem
#include<stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int sum = 0;
    for (int i = 0; i < n; i++) {
        int s;
        scanf("%d", &s);
        sum = sum + s;
    }
    printf("%d", sum);
}