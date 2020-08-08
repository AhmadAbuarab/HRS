package com.hrs.demoapp.api;


import com.hrs.demoapp.model.Employee;
import com.hrs.demoapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeResources {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {

        Date dateobj = new Date();
        employee.setCreatedDate(dateobj);
        return employeeService.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping(value = "/top")
    public List<Employee> getTopEmployees() {
        return employeeService.getTopPaid();
    }

    @GetMapping(value = "/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") int employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @PutMapping(value = "/{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(employeeId, employee);
    }

    @DeleteMapping(value = "/{employeeId}")
    public void deletemployee(@PathVariable("employeeId") int employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

    @GetMapping(value = "/status/{status}")
    public List<Employee> getEmployeeByStatus(@PathVariable("status") int status) {
        return employeeService.getEmployeeByStatus(status);
    }

    @GetMapping(value = "/department/{departmentId}")
    public List<Employee> getEmployeeByDepartment(@PathVariable("departmentId") int departmentId) {
        return employeeService.getEmployeeByDepartmentId(departmentId);
    }

    @PutMapping(value = "/raise")
    public String updateEmployeeSalary(@RequestParam(value="id") int employeeId, @RequestParam(value="ratio") double ratio) {
        return employeeService.updateEmployeeSalary(employeeId, ratio);
    }
}
