prog3_1.cpp:
Creates a Lua environment inside C to execute a lua file. Takes
in a single command line argument with the name of the lua file
to be executed.

prog3_2.lua:
Turns an infix math expression into a postfix expression. This proccess
is done because the computers can easily use postfix while humans use
infix. This function is done by using a stack for the operations to be pushed onto
and a queue for the numbers to be read off of. The stack works by pushing operations
onto the stack if the stack is empty or the operation has higher precedence than
the other operations on the stack. Popping into the output occurs when the operation has
equal or lesser precedece than the other operations on the stack. After a number is read through
the queue it is automaically placed on the output string. Not a complex function to understand at all.

prog3_3.cpp:
Creates a Lua environment inside C to execute the InfixToPostfix function
with the string input to stdin, and output to the console. Takes
in a single string from stdin which will be converted from infix to postfix
inside of the lua function and then returned and printed in C.
