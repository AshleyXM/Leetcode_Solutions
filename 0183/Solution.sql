# Write your MySQL query statement below
select name as Customers
from customers as ct
left join orders as od
on ct.id = od.customerId
where customerId is null;