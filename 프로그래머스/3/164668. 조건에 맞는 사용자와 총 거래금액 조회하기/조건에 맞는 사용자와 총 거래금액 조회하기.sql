-- 코드를 
# 회원 ID, 닉네임, 총거래금액을 조회하는 SQL문을 작성해주세요. 
# 결과는 총거래금액을 기준으로 오름차순 정렬해주세요.


SELECT WRITER_ID, nickname, sum(price)
from USED_GOODS_BOARD b inner join USED_GOODS_USER u 
    on b.WRITER_ID = u.USER_ID	
where STATUS='DONE'
group by WRITER_ID
having sum(price)>=700000
order by 3