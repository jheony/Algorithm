def solution(chicken):
    answer = -1
    c = chicken // 10
    r = chicken % 10 + c
    while (r >= 10):
	    x = r//10
	    c += x
	    r = r % 10 + x 
    answer = c
    return answer