# Write your MySQL query statement below
select name
from customer
where referee_id is null or referee_id != 2; -- We should use "IS NULL" rather "!= null"