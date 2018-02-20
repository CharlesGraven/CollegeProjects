Charles Graven Assignment4 Stack Machine
-----------------------------------------
In this project I created a StackMachine
that reads in numbers and basic arithmetic 
to form a calculator and simulate how
a programming language tokenizer does. 
-------------------------------------------

prog4_1.py
-------------------------------------------
Reads in a file name and tokenizes each line
by spaces(multiple spaces don't matter) and prints
each lines space delimited tokens seperated by 
commas. It takes one command line argument and
that is the file name.

python3 prog4_1.py file.txt

Example:
file.txt
2   4 2 11 9
55 33 92  1    1
2 3 0 1

Output
2,4,2,11,9
55,33,92,1,1
2,3,0,1

StackMachine.py
-----------------
A basic stack in python
which also computes multiplication,
division, addition, subtraction, and 
modulus by popping two numbers off the
stack, computing them and then pushs
the answer back onto the stack

prog4_2.py
------------------
Tokenizes the same way as prog4_1.py but reads for
'push','pop','add','div','sub','mul','mod' and any number
in order to build the stack. If push is read and a number comes next
then that number is pushed. Anytime an arithmetic operation is read
it will try to execute it. Anytime pop is found it pops off the stack
and prints to stdout
Example:

file.txt
push 3 push 5 add pop

Output
8