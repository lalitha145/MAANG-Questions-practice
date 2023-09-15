SELECT contest_id , round(count(distinct user_id)/(select count(user_id) from users)*100,2) as percentage
from Register
group by contest_Id
order by percentage desc,contest_id;