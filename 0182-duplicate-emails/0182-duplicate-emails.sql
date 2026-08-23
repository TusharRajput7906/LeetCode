# Write your MySQL query statement below
-- Select Distinct e.email from Person e
-- join Person m
-- on e.email=m.email
-- where e.id!=m.id

Select email
from Person
group by email
having count(email)>1