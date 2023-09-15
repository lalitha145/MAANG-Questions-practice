SELECT e.name from EMPLOYEE e
INNER JOIN EMPLOYEE m
on e.id=m.managerId
group by m.managerId
having count(e.id)>=5;