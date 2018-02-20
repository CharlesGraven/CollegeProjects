//  CS320  Assignment#2 - prog2_1.c
//  
//  Reads space delimited user input
//  and returns the input seperated in
//  new lines, surrounded by '='s
//
//  Created by Charles Graven 9/28/17
//

#include<stdio.h>
#include<string.h>

int main(int argc, char* argv[])
{
  char line[255];
  char *ch;

  printf("Assignment #2-1, Charles Graven, c.j.gravenn@gmail.com\n");
    
  fgets(line, sizeof(line), stdin);
    
  line[66] = '\0';
  ch = strtok(line, " ");

  //If the space delimited token is NULL stop
  while (ch != NULL) {
    int len = strlen(ch);
    if(ch[0]=='\n');
    else if(ch[len-1]=='\n'){
        printf("=");
        for(int i = 0; i < len-1; i++)
            printf("%c",ch[i]);
        printf("=\n");
    }
    else printf("=%s=\n", ch);

    ch = strtok(NULL, " ");
  }

  return 0;
}
