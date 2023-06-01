# Write your MySQL query statement below
# Solution 1
# SELECT email
# FROM (SELECT count(email) as count, email
#       FROM Person
#       GROUP BY email) p
# WHERE p.count > 1;

# Solution 2
SELECT email
FROM Person
GROUP BY email
HAVING count(email) > 1; 