import sys

n = int(input())
l = (int(sys.stdin.readline()) for __ in range(n))

l = sorted(l)
for i in l:
    print(i)
