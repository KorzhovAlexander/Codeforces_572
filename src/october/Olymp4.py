c=list(map(str,range(10)))
s=(input())
for i in range(len(s)):
    if s[i] in c:
        s=s.replace(s[i]+s[i+1],int(s[i])*s[i+1])
print(s)
