//  CS320  Assignment#2 - prog2_4.c
//  
//  Reads space delimited user input up to two tokens
//  and returns the inputs type(either STR or INT)
//  into the output seperated by spaces. The program will 
//  loop until a single String caseinsensitive "QUIT" is read.
//
//  Created by Charles Graven 9/28/17
//

#include<stdio.h>
#include<ctype.h>
#include<string.h>

int getSize(char array[]);

int main(int argc, char* argv[])
{

  char line[255];
  char *delim;
  int size = 0;
  char *quit = "QUIT";    
  char *quitInput;
  
    
  int boolQuit = 1;
  printf("Assignment #2-4,CharlesGraven, c.j.gravenn@gmail.com\n");

  while(boolQuit != 0){  
    
  int arr[30] = { 0 };

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
   
    if(getSize(line)>20) printf("ERROR! Input string too long.");
    else if(size==2){
        for(int i = 0; i < size; i++){
            if(arr[i]==0) printf("INT ");
            else printf("STR ");
        }
    }else if(size==1){
        if(arr[0]==0)printf("INT ");
        else{
            //strtok twice in order to get rid of " " and "\n"            
            quitInput = strtok(line, " ");
            quitInput = strtok(line, "\n");
            boolQuit = strcasecmp(quitInput, quit);//Get whether the string was "quit"
            if(boolQuit==0);
            else printf("STR ");
        }
    }
    else printf("ERROR! Incorrect number of tokens found.");
    
    if(boolQuit!=0) printf("\n");

    size=0;
    }
 }

/*
*Gets the size of the input excluding 
*the newline character
*@param string to read
*@return the number of characters
*/
int getSize(char array[]){
    int count = 0;    
    for(int i = 0; array[i]!='\n';i++){
        count++;
    }
    return count;
}
