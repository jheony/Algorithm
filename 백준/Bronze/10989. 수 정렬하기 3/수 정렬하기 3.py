import sys
n = int(input())
l = {}
for i in range(n):
    x = int(sys.stdin.readline())
    if l.get(x):
        l[x] += 1
    else:
        l[x] = 1

for k in sorted(l):
    for v in range(l[k]):
        print(k)
