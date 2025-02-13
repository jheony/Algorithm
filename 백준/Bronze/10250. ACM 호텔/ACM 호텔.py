import sys
n = int(input())
for i in range(n):
    h,w,n = map(int, sys.stdin.readline().split())
    if  n > h:
        for a in range(w):
            for b in range(h):
                n -= 1
                if n == 0:
                    x = b+1
                    y = a+1
    else:
        x = n
        y = 1
    print(x*100+y)
