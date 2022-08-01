SELECT 
    p.Email 
FROM 
    Person AS p
GROUP BY 
    P.Email
HAVING COUNT(*)>1;
