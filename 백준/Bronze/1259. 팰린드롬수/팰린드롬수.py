while True:
    n = input()    
    if n == '0':
        break
    s =''
    for j in reversed(n):
        s += j
    if n != s:
        print("no")
    elif n == s:
        print('yes')

