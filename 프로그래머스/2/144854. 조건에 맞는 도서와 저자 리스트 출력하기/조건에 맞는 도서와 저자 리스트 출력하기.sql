-- 코드를 입력하세요
SELECT 
    b.BOOK_ID, 
    a.AUTHOR_NAME,
    date_format(date(b.PUBLISHED_DATE), '%Y-%m-%d') 'PUBLISHED_DATE'
from book b inner join author a on b.AUTHOR_ID = a.AUTHOR_ID
where b.category = '경제'
order by b.PUBLISHED_DATE