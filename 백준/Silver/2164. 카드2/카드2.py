from collections import deque

n = int(input())
l = deque()
for i in range(1, n+1):
  l.append(i)

while len(l) > 1:
    l.popleft()
    l.rotate(-1)
print(l[0])