package com.hrs.demoapp.service;

import com.hrs.demoapp.dao.EmployeeDAO;
import com.hrs.demoapp.model.Employee;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDao;

    private List<Employee> employeeList = new CopyOnWriteArrayList<>();

    /**
     * add new employee
     *
     * @param employee
     * @return
     */
     public Employee addEmployee(Employee employee) {
         return employeeDao.save(employee);
    }

    /**
     * get all employees
     *
     * @return
     */
    public List<Employee> getEmployees(){

         return employeeDao.findAll();
    }

    /**
     * get top paid employees
     *
     * @return
     */
    public List<Employee> getTopPaid(){

        return employeeDao.findTop3ByOrderBySalaryDesc();
    }

    /**
     * get employee by id
     *
     * @param employeeId
     * @return
     */
    public Employee getEmployee(int employeeId){

        return employeeDao.findById(employeeId).get();
    }

    /**
     * get employees by status, active / inactive
     *
     * @param status
     * @return
     */
    public List<Employee> getEmployeeByStatus(int status) {

         return employeeDao.findByStatus(status);
    }

    /**
     * get employees by department id
     *
     * @param departmentId
     * @return
     */
    public List<Employee> getEmployeeByDepartmentId(int departmentId) {

        return employeeDao.findByDepartmentId(departmentId);

    }

    /**
     * raise employee salary by ratio
     *
     * @param employeeId
     * @param ratio
     * @return
     */
    public String updateEmployeeSalary(int employeeId, double ratio) {

        Employee employee = employeeDao.findById(employeeId).get();
        double oldSalary = employee.getSalary();
        double newSalary = oldSalary + (oldSalary * ratio);
        employee.setSalary(newSalary);
        this.updateEmployee(employeeId, employee);

        return String.format("Employee %s %s, Old Salary %f, New Salary %f", employee.getFirstName(), employee.getLastName(), oldSalary, newSalary);
    }

    /**
     * update employee
     *
     * @param employeeId
     * @param employee
     * @return
     */
    public Employee updateEmployee(int employeeId, Employee employee) {

        employee.setId(employeeId);
         return employeeDao.save(employee);
    }

    /**
     * delete employee
     *
     * @param employeeId
     */
    public void deleteEmployee(int employeeId) {

         employeeDao.deleteById(employeeId);
    }
}
