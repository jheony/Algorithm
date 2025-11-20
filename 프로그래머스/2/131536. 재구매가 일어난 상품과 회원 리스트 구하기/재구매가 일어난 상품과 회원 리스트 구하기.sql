-- 코드를 입력하세요
select user_id, product_id
from(
select *,
    count(1) cnt
from ONLINE_SALE
group by user_id, product_id
) a
where cnt>1
order by user_id, product_id desc