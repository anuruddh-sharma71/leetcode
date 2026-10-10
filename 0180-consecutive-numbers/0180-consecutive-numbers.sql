# Write your MySQL query statement below
SELECT DISTINCT l1.num AS ConsecutiveNums
FROM (
    SELECT num, 
           id,
           LEAD(num, 1) OVER (ORDER BY id) AS next_num,
           LEAD(num, 2) OVER (ORDER BY id) AS next_next_num
    FROM Logs
) l1
WHERE l1.num = l1.next_num AND l1.num = l1.next_next_num;