# HRS
* Simple API for a small HR system.

### Authintication

To use this application you can select -> Authorization tab in postman 
-> authorization type : Basic Auth 
* User : admin
* Password : password

### Employee table
```mysql
CREATE TABLE `hrs`.`employee`(
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `salary` FLOAT NULL,
  `department_id` INT NULL,
  `cv_path` VARCHAR(255) NULL,
  `created_date` DATETIME NULL,
  `status` INT NULL,
  PRIMARY KEY (`id`));
```
### Usage
*  Add a new Employee
```java
Request: POST /employee
Body:
{	
    "firstName": "ahmad",
    "lastName": "abuarab",
    "status": 1,
    "salary": 5000.3,
    "cvPath": "link here",
    "departmentId": 1
}
Response : 
Body:
{	
    "id": "1",
    "firstName": "ahmad",
    "lastName": "abuarab",
    "status": 1,
    "salary": 5000.3,
    "cvPath": "link here",
    "departmentId": 1
}
```
*  Get all Employees
```java
Request: GET /employee
Response:
{	
    "id": 1
    "firstName": "ahmad",
    "lastName": "abuarab",
    "status": 1,
    "salary": 5000.3,
    "cvPath": "link here",
    "departmentId": 1
}
{	
    "id": 2
    "firstName": "Ali",
    "lastName": "Ali",
    "status": 1,
    "salary": 4000.3,
    "cvPath": "link here",
    "departmentId": 2
}
    "id": 3
    "firstName": "Joe",
    "lastName": "Joe",
    "status": 1,
    "salary": 2000.3,
    "cvPath": "link here",
    "departmentId": 1
```

*  Get Employee by id
```java
Request: GET /employee/1
Response:
{	
    "id": 1
    "firstName": "ahmad",
    "lastName": "abuarab",
    "status": 1,
    "salary": 5000.3,
    "cvPath": "link here",
    "departmentId": 1
}
```

*  Get top 3 paid Employees
```java
Request: GET /employee/top/
Response:
{	
    "id": 1
    "firstName": "ahmad",
    "lastName": "abuarab",
    "status": 1,
    "salary": 5000.3,
    "cvPath": "link here",
    "departmentId": 1
}
{	
    "id": 2
    "firstName": "ali",
    "lastName": "ali",
    "status": 1,
    "salary": 3000.3,
    "cvPath": "link here",
    "departmentId": 2
}
{	
    "id": 3
    "firstName": "Joe",
    "lastName": "Joe",
    "status": 1,
    "salary": 2000.3,
    "cvPath": "link here",
    "departmentId": 1
}
```

*  Update Employee
```java
Request: PUT /employee/1
Request Body:
{	
    "firstName": "updated",
    "lastName": "abuarab",
    "status": 1,
    "salary": 5000.3,
    "cvPath": "link here",
    "departmentId": 1
}
Response Body:
{	  
    "id" : 1
    "firstName": "updated",
    "lastName": "abuarab",
    "status": 1,
    "salary": 5000.3,
    "cvPath": "link here",
    "departmentId": 1
}
```

*  Delete Employee
```java
Request: DELETE /employee/1

```

*  Get Employee by status, active/inactive
```java
Request: GET /employee/status/0
Response:
{	
    "id": 1
    "firstName": "Muna",
    "lastName": "Ahmad",
    "status": 0,
    "salary": 8000.3,
    "cvPath": "link here",
    "departmentId": 3
}
```

*  Get Employee by department
```java
Request: GET /employee/department/4
Response:
{	
    "id": 1
    "firstName": "Mohammad",
    "lastName": "Ali",
    "status": 1,
    "salary": 1000.3,
    "cvPath": "link here",
    "departmentId": 4
}
```

*  Raise Employee salary by ratio
```java
Request: PUT /employee/raise
id: 1
ratio : 2.5
```

