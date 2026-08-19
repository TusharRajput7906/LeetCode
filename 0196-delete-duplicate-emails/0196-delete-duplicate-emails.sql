# Write your MySQL query statement below
Delete p1
from Person p1
Join Person p2
ON p1.email=p2.email
And p1.id>p2.id