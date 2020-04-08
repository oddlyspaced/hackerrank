// https://www.hackerrank.com/challenges/students-marks-sum/problem
#include<stdio.h>
#include<stdlib.h>
int marks_sum(int* marks, int students, char gen) {
    int sum = 0;
    int i = 0;
    if (gen == 'g') {
        i = 1;
        marks++;
    }
    for (; i < students; i += 2) {
        sum += *marks;
        marks++;
        marks++;
    }
    return sum;
}

int main() {
    int number_of_students;
    char gender;
    int sum;
  
    scanf("%d", &number_of_students);
    int *marks = (int *) malloc(number_of_students * sizeof (int));
 
    for (int student = 0; student < number_of_students; student++) {
        scanf("%d", (marks + student));
    }
    
    scanf(" %c", &gender);
    
    sum = marks_sum(marks, number_of_students, gender);
    printf("%d", sum);
    free(marks);
 
    return 0;
}