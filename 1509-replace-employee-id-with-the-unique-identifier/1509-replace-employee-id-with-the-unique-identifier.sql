# Write your MySQL query statement below
select unique_id, name from EmployeeUNI right join Employees ON EmployeeUNI.id=Employees.id;