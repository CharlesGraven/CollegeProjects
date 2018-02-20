//  CS320  Assignment#2 - prog2_6.c
//  
//  Takes in a command line argument which must be a single
//  integer which dictates how many times the program will run.
//  While running the program will read space delimited user input up to two tokens
//  and returns the inputs type(either STR or INT)
//  into the output seperated by spaces. The program will 
//  loop until a single String caseinsensitive "QUIT" is read or if the number of runs is over.
//
//  Created by Charles Graven 9/28/17
//

#include<stdio.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>

int digit(char *str);

int main(int argc, char *argv[])
{
      
  int boolQuit = 1;
  char *numRuns = argv[1];
  int runs = 0; 
  char *ptr;

  if(argc!=2){
     printf("ERROR! Program 6 accepts 1 command line argument.\n");
     boolQuit = 0;
  }else if(digit(numRuns)==0){
        printf("ERROR! Expected integer argument.\n");
        runs = 0;
  }else runs = strtol(numRuns,&ptr,10);

  char line[100];
  char *delim;
  int size = 0;
  char *quit = "QUIT";    
  char *quitInput;

  printf("Assignment #2-6, Charles Graven, c.j.gravenn@gmail.com\n");

  while(runs!=0){  
    
  int arr[40] = { 0 };
  printf("> ");
  fgets(line, sizeof(line), stdin);

    
  delim = strtok(line, " ");
    
    for(int j = 0; delim!=NULL; j++){
        
        int len = strlen(delim);
        for(int i = 0; i < len;i++){
            
            int x = isdigit(delim[i]);
            
            //If an individual newline char is read in ignore it
            if(delim[i]=='\n'&&len==1){ 
                --size;
            }
            else if(((arr[j]!=1)&&(x!=0))||(delim[i]=='\n'&&isdigit(delim[i-1])!=0)) arr[j] = 0;
 
            else arr[j] = 1;
            
        }
        delim = strtok(NULL," ");
        size++;
    }

    if((strlen(line)-1)>65) printf("ERROR! Input String too long.");
    else if(((size==2)&&(arr[0]==1&&arr[1]==0))){
        for(int i = 0; i < size; i++){
            if(arr[i]==0) printf("INT ");
            else printf("STR ");
        }
    }else if(size==1&&arr[0]==1){
         quitInput = strtok(line, " ");
         quitInput = strtok(line, "\n");
         boolQuit = strcasecmp(quitInput, quit);
            if(boolQuit==0);
            else printf("STR ");
    }else if(size==1)printf("ERROR! Expected STR.");
     else if(size==2)printf("ERROR! Expected STR INT.");
    else printf("ERROR! Incorrect number of tokens found.");
    
    size=0;
    runs=runs-1;

    if(boolQuit!=0) printf("\n");
    else runs = 0;
    }
 }

/*
* Checks an input string to see whether it
* is an int or a string
* @param the string to be checked
* @return 0 if it is a string
*/
int digit(char *str){
    for(int i =0; i < strlen(str);i++){
        int x = isdigit(str[i]);
        if(x==0) return 0;
    }
}
