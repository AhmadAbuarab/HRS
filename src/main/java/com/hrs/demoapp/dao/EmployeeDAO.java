package com.hrs.demoapp.dao;

import com.hrs.demoapp.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

    @Override
    List<Employee> findAll();

    // find employee by status , active/inactive
    List<Employee> findByStatus(int status);

    // find employee by department id
    List<Employee> findByDepartmentId(int departmentId);

    // list top 3 salaries
    List<Employee> findTop3ByOrderBySalaryDesc();

}
