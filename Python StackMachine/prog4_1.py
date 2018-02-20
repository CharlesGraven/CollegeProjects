import sys

print("Assignment #4-1, Charles Graven,c.j.gravenn@gmail.com")

lines = []
x = 0

with open(sys.argv[1]) as f:
   lines = f.readlines()

lines = [x.strip() for x in lines]

for line in lines:
    line_delimited = line.split()
    #for token in line_delimited:
    formated = ",".join(line_delimited)
    #    print(token+', ',end='')
    print(formated)
    #print("\n")
    
     




