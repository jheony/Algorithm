SELECT h.flavor 
from FIRST_HALF h inner join ICECREAM_INFO i on h.flavor = i.flavor
where total_order >= 3000 
    and ingredient_type = 'fruit_based'
order by total_order desc
