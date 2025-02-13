n = int(input())
s = total = 0
l = list(map(int,input().split()))

l = sorted(l)
for i in l:
    s= s+i
    total = total + s

print(total)
