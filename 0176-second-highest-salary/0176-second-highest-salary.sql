# Write your MySQL query statement below
-- Select salary as SecondHighestSalary from Employee
-- where salary <(select max(salary) from Employee)
-- order by salary desc
-- limit 1

SELECT (
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
) AS SecondHighestSalary;