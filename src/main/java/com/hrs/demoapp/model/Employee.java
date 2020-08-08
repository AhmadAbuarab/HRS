package com.hrs.demoapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private int status;
    private double salary;
    private String cvPath;
    private int departmentId;
    private Date createdDate;

    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * setCreatedDate
     *
     * @param createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * getId
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * setId
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getFirstName
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setFirstName
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getLastName
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setLastName
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getStatus
     *
     * @return
     */
    public int getStatus() {
        return status;
    }

    /**
     * setStatus
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * getSalary
     *
     * @return
     */
    public double getSalary() {
        return salary;
    }

    /**
     * setSalary
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * getCvPath
     *
     * @return
     */
    public String getCvPath() {
        return cvPath;
    }

    /**
     * setCvPath
     *
     * @param cvPath
     */
    public void setCvPath(String cvPath) {
        this.cvPath = cvPath;
    }

    /**
     * getDepartmentId
     *
     * @return
     */
    public int getDepartmentId() {
        return departmentId;
    }

    /**
     * departmentId
     *
     * @param departmentId
     */
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
