# Write your MySQL query statement belows
select s.user_id,round(avg(if(c.action='confirmed',1,0)),2) as confirmation_rate from signups s
left join confirmations c using(user_id)
group by user_id;