# Write your MySQL query statement below
SELECT name AS Employee
FROM Employee AS e1
WHERE salary > (SELECT salary FROM Employee AS e2 WHERE e2.id = e1.managerId);