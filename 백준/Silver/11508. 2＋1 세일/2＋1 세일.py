import sys
n = int(input())
l = list()
for i in range(n):
    l.append( int(sys.stdin.readline()))

l = sorted(l, reverse=True)
for x in range(2,n,3):
    l[x] = 0
print(sum(l))
