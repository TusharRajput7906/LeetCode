# Write your MySQL query statement below
SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING count(Distinct product_key)=(select count(product_key) from Product)