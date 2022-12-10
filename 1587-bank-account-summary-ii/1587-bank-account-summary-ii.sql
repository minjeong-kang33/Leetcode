# Write your MySQL query statement below
SELECT name, sum(amount)as balance
FROM Users U JOIN Transactions T
ON U.account = T.account
GROUP BY U.account
HAVING sum(amount)> 10000;