// https://www.hackerrank.com/challenges/bitwise-operators-in-c/problem
#include<stdio.h>
int main() {
    int n, k;
    scanf("%d %d", &n, &k);
    int max = 0;
    for (int i = 1; i < n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i < j) {
                int op = i&j;
                if (op > max && op < k) {
                    max = op;
                }
            }
        }
    }
    // and
    printf("%d\n", max);

    max = 0;
    for (int i = 1; i < n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i < j) {
                int op = i|j;
                if (op > max && op < k) {
                    max = op;
                }
            }
        }
    }
    // or
    printf("%d\n", max);

    max = 0;
    for (int i = 1; i < n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i < j) {
                int op = i^j;
                if (op > max && op < k) {
                    max = op;
                }
            }
        }
    }
    // xor
    printf("%d\n", max);
    return 0;
}