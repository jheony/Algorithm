str = input()
r =''
for i in str:
    if i >= 'a' and i <= 'z':
        r = r + i.upper()
    elif i>='A' and i<='Z':
        r = r + i.lower()
print(r)