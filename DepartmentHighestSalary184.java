SELECT Department.Name AS Department, Employee.Name AS Employee, Max(Salary) OVER (PARTITION BY Department ORDER BY Salary) AS Salary
FROM Employee JOIN Department ON Employee.DepartmentId = Department.Id
