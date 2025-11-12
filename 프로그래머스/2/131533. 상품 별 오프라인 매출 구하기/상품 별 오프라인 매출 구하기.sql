SELECT p.PRODUCT_CODE, sum(p.price * os.sales_amount) as sales
from PRODUCT p 
left join OFFLINE_SALE os 
on p.PRODUCT_ID = os.PRODUCT_ID
group by p.PRODUCT_CODE
order by 2 desc, 1