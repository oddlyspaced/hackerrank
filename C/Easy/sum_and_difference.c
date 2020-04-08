// https://www.hackerrank.com/challenges/sum-numbers-c/problem
#include<stdio.h>
int main() {
    int a, b;
    float x, y;
    scanf("%d %d %f %f", &a, &b, &x, &y);
    int s1 = a + b;
    float s2 = x + y;
    int d1 = a - b;
    float d2 = x - y;
    printf("%d %d\n%.1f %.1f", s1, d1, s2, d2);
    return 0;
}