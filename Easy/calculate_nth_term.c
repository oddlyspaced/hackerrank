// https://www.hackerrank.com/challenges/recursion-in-c/problem
#include <stdio.h>

int find_nth_term(int n, int a, int b, int c) {
    if (n == 0) {
        return c;
    }
    int sum = a + b + c;
    a = b;
    b = c;
    c = sum;
    return find_nth_term(--n, a, b, c);
}

int main() {
    int n, a, b, c; 
    scanf("%d %d %d %d", &n, &a, &b, &c);
    int ans = find_nth_term(n - 3, a, b, c);
    printf("%d", ans); 
    return 0;
}