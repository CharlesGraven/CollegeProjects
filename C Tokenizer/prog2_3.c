//  CS320  Assignment#2 - prog2_3.c
//  
//  Reads space delimited user input up to two tokens
//  and returns the inputs type(either STR or INT)
//  into the output seperated by spaces. 
//
//  Created by Charles Graven 9/28/17
//

#include<stdio.h>
#include<ctype.h>
#include<string.h>

int main(int argc, char* argv[])
{
  char line[255];
  char *delim;
  int size = 0;
  int noErrors = 0;

  printf("Assignment #2-3,CharlesGraven, c.j.gravenn@gmail.com\n");

    //Keep going if there are errors
    while(noErrors == 0){
    int arr[40] = { 0 };
    printf("> ");
    fgets(line, sizeof(line), stdin);
    delim = strtok(line, " ");
    line[66] = '\0';

    for(int j = 0; delim!=NULL; j++){
        
        int len = strlen(delim);
        for(int i = 0; i < len;i++){
            
            int x = isdigit(delim[i]);
             
            //Problem! \n makes an int a string if it is put last
            if(delim[i]=='\n'&&len==1) --size;

            else if(((arr[j]!=1)&&(x!=0))||(delim[i]=='\n'&&isdigit(delim[i-1])!=0)) arr[j] = 0;
 
            else arr[j] = 1;
        }
        delim = strtok(NULL," ");
        size++;
    }

    //Check for correct size
    if(size<=2&&size>0){
        for(int i = 0; i < size; i++){
            if(arr[i]==0) printf("INT ");
            else printf("STR ");
        }
        noErrors=1;
    }else printf("ERROR! Incorrect number of tokens found.");
    printf("\n");
    
    size = 0;
   }
 }
  
