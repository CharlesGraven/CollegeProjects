import StackMachine
import sys

print("Assignment #4-2, Charles Graven,c.j.gravenn@gmail.com")

stack = StackMachine.StackMachine()

lines = []
x = 0
pushTime = False;

with open(sys.argv[1]) as f:
   lines = f.readlines()

lines = [x.strip() for x in lines]

for line in lines:
    line_delimited = line.split()
    for token in line_delimited:
        if (pushTime and token.isdigit()):
            stack.push(token)
            pushTime = False
        elif(token=='push'):
            pushTime = True
        elif(token == 'add'):
            stack.add()
            pushTime = False
        elif(token == 'mul'):
            stack.mul()
            pushTime = False
        elif(token == 'sub'):
            stack.sub()
            pushTime = False
        elif(token == 'div'):
            stack.div()
            pushTime = False
        elif(token == 'mod'):
            stack.mod()
            pushTime = False
        elif(token == 'pop'):
            print(stack.pop())
            pushTime = False

#if there are two tokens and the first is push and the second is a number
#then push onto the stack, if any of the aritmetic things are read then do #them. If a pop if called pop the value and return the value to stdout


