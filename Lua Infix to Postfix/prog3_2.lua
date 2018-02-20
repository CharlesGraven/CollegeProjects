function InfixToPostfix(string1)

  toreturn = ''

function hasPrecedence(val)
  if(head==1)then
    return false
    end
  if((val=="*" or val=="/" or val=="%") and (peek()=="+" or peek()=="-"))then 
    return false
    end
  if(val=="-" or val=="+")then 
      return true 
    end
    return true
end


  head = 1,
  table stack = {}

  function isEmpty()
    if(head==1)then return true end
    return false
  end
  
 function push(var)
    stack[head] = var
    head=head+1
  end
    
  function peek()
    return stack[head-1]
  end
    
  function pop()
    head=head-1
    return stack[head]
  end
    
 function delimitBySpace(str)
        local delimited={}; 
        i=1
        for str in string.gmatch(str, "([^".." ".."]+)") 
        do
            delimited[i] = str
            i = i + 1
        end
        return delimited
end

--use i as length of the array
array = delimitBySpace(string1)

c = 1
while i > 0 do
  v = array[c]
  if tonumber(array[c]) ~= nil then
    toreturn = toreturn .. ' ' .. array[c]
  else
    while(hasPrecedence(array[c]))do
      toreturn = toreturn .. ' ' .. pop()
    end
    push(array[c])
  end 
  --then pop everything off
  i = i-1
  c = c+1
end
while(head>2)do
      print(pop())
    end
  
  return toreturn
end
