# Write your MySQL query statement below
SELECT id ,movie,description ,rating 
FROM Cinema 
 
group by id,movie,description,rating
having id%2=1 and description<>"boring"
order by rating desc;
