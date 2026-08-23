# Write your MySQL query statement below
-- Select salary as SecondHighestSalary from Employee
-- where salary <(select max(salary) from Employee)
-- order by salary desc
-- limit 1

SELECT (
    Select salary  from Employee
where salary <(select max(salary) from Employee)
order by salary desc
limit 1
) AS SecondHighestSalary;