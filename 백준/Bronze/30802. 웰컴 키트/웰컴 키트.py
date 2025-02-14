n = int(input())
l = list(map(int, input().split()))
t, p = map(int, input().split())
cnt = 0

for i in l:
    if i > t:
        cnt += i//t
        i = i % t
    if i != 0:
        cnt += 1

print(cnt)
print(n//p, n%p)
