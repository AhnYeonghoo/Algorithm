n = list(input())
count = 0

if n[0] == " ":
    count +=1
if n[len(n)-1] == " ":
    count +=1
    
print(n.count(" ") - count + 1)
    
    