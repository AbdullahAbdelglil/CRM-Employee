DROP USER IF EXISTS 'Employee'@'%';

CREATE USER 'Employee'@'%'IDENTIFIED BY 'employee2023';

GRANT ALL PRIVILEGES ON *.* TO 'Employee'@'%';  