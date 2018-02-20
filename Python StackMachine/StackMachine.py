import sys

class StackMachine:
    def __init__(self):
        self.data = []
    def push(self,x):
        self.data.append(x)
    def pop(self):
        return self.data.pop()
    def add(self):
        if(len(self.data)>1):
            one = self.data.pop()
            two = self.data.pop()
            ans = (int)(one) + (int)(two)
            self.data.append(ans)
    def mul(self):
        if(len(self.data)>1):
            one = self.data.pop()
            two = self.data.pop()
            ans = (int)(one) * (int)(two)
            self.data.append(ans)
    def sub(self):
        if(len(self.data)>1):
            one = self.data.pop()
            two = self.data.pop()
            ans = (int)(one) - (int)(two)
            self.data.append(ans)
    def div(self):
        if(len(self.data)>1):
            one = self.data.pop()
            two = self.data.pop()
            ans = (int)(one)/(int)(two)
            self.data.append(ans)
    def mod(self):
        if(len(self.data)>1):
            one = self.data.pop()
            two = self.data.pop()
            ans = (int)(one) % (int)(two)
            self.data.append(ans)
