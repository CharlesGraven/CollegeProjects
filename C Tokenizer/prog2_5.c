//  CS320  Assignment#2 - prog2_5.c
//  
//  Reads space delimited user input up to two tokens
//  and returns the inputs type(either STR or INT)
//  into the output seperated by spaces. Only accepts a single STR
//  or a combination of STR and INT otherwise an error will display
//  .The program will. Loop until a single String caseinsensitive "QUIT" is read.
//
//  Created by Charles Graven 9/28/17
//

#include<stdio.h>
#include<ctype.h>
#include<string.h>

int main(int argc, char* argv[])
{
  char line[100];
  char *delim;
  int size = 0;
  int arr[30] = { 0 };
  char *quit = "QUIT";    
  char *quitInput;
  
    
  int boolQuit = 1;
  printf("Assignment #2-5,CharlesGraven, c.j.gravenn@gmail.com\n");

  while(boolQuit != 0){  

  printf("> ");
  fgets(line, sizeof(line), stdin);

    
  delim = strtok(line, " ");
    
    for(int j = 0; delim!=NULL; j++){
        
        int len = strlen(delim);
        for(int i = 0; i < len;i++){
            
            int x = isdigit(delim[i]);
             
            //Problem! \n makes an int a string if it is put last
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
    else if((size==2)&&(((arr[0]==1&&arr[1]==0)))){
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
   
    if(boolQuit!=0) printf("\n");

    //reset impacted varaibles
    size=0;
    arr[0] = 0;
    arr[1] = 0;
    }
 }
