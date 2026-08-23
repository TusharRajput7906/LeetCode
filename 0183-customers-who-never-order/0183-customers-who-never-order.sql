# Write your MySQL query statement below
Select c.name as Customers from Customers c
left join orders o
on c.id=o.customerId
where o.customerId is null;