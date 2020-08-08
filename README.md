# HRS
HR system

### Authintication
* User : admin
* Password : password

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


