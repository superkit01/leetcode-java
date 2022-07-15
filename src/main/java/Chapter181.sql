SELECT
	e. NAME AS `Employee`
FROM
	Employee AS e,
	(
		SELECT
			id,
			salary
		FROM
			Employee
	) AS tmp
WHERE
	e.managerId = tmp.id
AND e.salary > tmp.salary