#include <stdio.h>

struct emp
{
     char name[30];
     int age;
     char gender;
};

int main() {
     FILE *employee = fopen("Employee.txt", "w");
     struct emp emp1;
     printf("Enter Name, Age and Gender\n");
	scanf("%s %d %c", &emp1.name, &emp1.age, &emp1.gender);
	fprintf(employee, "%s %d %c", emp1.name, emp1.age, emp1.gender);
	fclose(employee);
}
