#include<stdio.h>
#include<conio.h>

void main()
{
int i=0,j=0;
int arr[4][3]={
		{1,2,3},
		{2,3,4},
		{3,4,5},
		{4,5,6}
	      };

clrscr();

	for(i=0;i<4;i++)
	{
		 for(j=0;j<3;j++)
		{
		printf("arr[%d] [%d] = %d \n",i,j,arr[i][j]);
		 }
	}
getch();
}

		//variable_name[rows][columns]={value1,value2,value3....n};

	       //	int m1[2][2]={10,20,30,40};