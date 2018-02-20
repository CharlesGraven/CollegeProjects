//  CS320  Assignment#2 - prog2_2.c
//  
//  Reads space delimited user input
//  and returns the inputs type(either STR or INT)
//  into the output seperated by spaces
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
  int arr[40] = { 0 };

  printf("Assignment #2-2,CharlesGraven, c.j.gravenn@gmail.com\n");
  printf("> ");
  fgets(line, sizeof(line), stdin);
  
  line[66] = '\0';
    
    delim = strtok(line, " ");

    for(int j = 0; delim!=NULL; j++){
        
        int len = strlen(delim);
        for(int i = 0; i < len;i++){
            
            int x = isdigit(delim[i]);
             
            //Extra spaces after input should shrink the size
            if(delim[i]=='\n'&&len==1) --size;

            if((arr[j]==0)&&(x!=0)){
                
                //a '\n' character will turn an int into a string
                //so this makes sure the type will be correct
                if(delim[i]=='\n'){
                    for(int z = 0; z < len-1; z++){
                        int t = isdigit(delim[z]);
                        if(t!=0&&arr[j]!=1){
                            arr[j]=0;
                        }else arr[j] = 1;
                    }
                }else arr[j] = 0;
                
            }
            else arr[j] = 1;
        }
        delim = strtok(NULL," ");
        size++;
    }

    for(int i = 0; i < size; i++){
        if(arr[i]==0) printf("INT ");
        else printf("STR ");
    }
    printf("\n");
    
 }
