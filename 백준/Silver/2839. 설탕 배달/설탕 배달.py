n = int(input())
l = list()
fr = n // 5
thr = n // 3
if n % 5 == 0:
    l.append(fr)
elif n % 3 == 0:
    l.append(thr)

for i in range(1,fr+1):
    for j in range(1,thr+1):
        f = 5*i + 3*j
        if n==f:
            l.append(i+j)
            break
    
if not l:
    l.append(-1)
l = sorted(l)
print(l[0])
