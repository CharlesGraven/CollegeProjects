
CS320 Assignment#2 9/27/2017
----------------------------

Author Information
-----------------------------
Charles Graven
c.j.gravenn@gmail.com

Overview
------------------------------------------------
The projects goal is to demonstrate how 
tokenization and user input work in C. Below is 
a brief description of each of the different files 
that compose the project.

prog2_1.c
-------------
Description: When run the input will accept any number of space
delimited tokens.The total input of all the tokens can be up to 65 characters including spaces, after 65 anymore characters will be ignored.Each token will then be seperated and be printed in the output on seperate lines. The space in the input being an indicator of a new line for each token. Each token on each line will also be surrounded with '=' signs.

Compilation: gcc prog2_1.c
Run: ./a.out

prog2_2.c
-------------
Description: When run the input will accept any number of space delimited tokes. The total of all tokens can be 65 including spaces, after 65 anymore characters will be ignored. Each space will delimit a new token. Each token will be read and determined whether it is a String or Integer using the function isdigit. If the token contains anything that is not an integer then it will be determined a string, and if it holds all integers then it will be an integer. Each tokens assigned definition(either STR for string, or INT for integer) will be then printed to the output space delimited in the order that it came into the input.

Compilation: gcc prog2_2.c
Run: ./a.out

prog2_3.c
-------------
Description: When run input will accept two or less space delimited tokens. Anymore than these two tokens will result in an error. A maximum of 65 characters can be read in, anymore being ignored. The program will run until two or less tokens are properly read in by input. The output will be the assigned definition(STR or INT) determined by isdigit, and printed out in the oreder read in by input.

Compilation: gcc prog2_3.c
Run: ./a.out

prog2_4.c
-------------
Description: While running input will accept two or less space delimited tokens. Anymore than these two tokens will result in an error. A maximum of 20 characters can be read in, anymore will result in an error. The program will run until a single string case insensative reads "QUIT". After each input the appropriate assigned definition of each token(STR or INT) will be shown by output then the user will be prompted for another input. This should, of course, go on until the "QUIT" string is read in.

Compilation: gcc prog2_4.c
Run: ./a.out

prog2_5.c
-------------
Description: While running the program will read in only two kinds of input on each line. Either a single token which must be a string or two tokens which must be a string and an int in that order, otherwise an error will print. If the input matches then the assigned typer(STR or INT) will be printed to the screen space delimited. The program accepts a maximum of 65 characters, anymore will result in an error. The program will run until a single string caseinsensitive "QUIT" is read.

Compilation: gcc prog2_5.c
Run: ./a.out

prog2_6.c
-------------
Description: Unlike the above files, this file accepts a command line argument at runtime. The command line argument must be an integer and there must only be one, otherwise it will result in an error. The command line argument will determine how many times the program is run. The program will accept two or less space delimited strings which will be determined to either be a STR or an INT. Only a single STR, or a combination of STR INT in that order will work, otherwise an error will be shown. The program will run as many times as specified in the comman line or until the program reaches a single string case insenitive "QUIT".

Compilation: gcc prog2_6.c
Run: ./a.out 'argument'
