SELECT query_name , round(avg(rating/position),2) as quality, 
round(sum(rating<3)/count(query_name)*100,2) as poor_query_percentage 
FROM Queries
group by query_name;