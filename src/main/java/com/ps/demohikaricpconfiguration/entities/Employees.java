package com.ps.demohikaricpconfiguration.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Employees {
    private int empNo;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private Date hireDate;
    private Collection<DeptEmp> deptEmpsByEmpNo;
    private Collection<DeptManager> deptManagersByEmpNo;
    private Collection<Salaries> salariesByEmpNo;
    private Collection<Titles> titlesByEmpNo;

    @Id
    @Column(name = "emp_no", nullable = false)
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "birth_date", nullable = false)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 14)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 16)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "gender", nullable = false)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "hire_date", nullable = false)
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return empNo == employees.empNo &&
                Objects.equals(birthDate, employees.birthDate) &&
                Objects.equals(firstName, employees.firstName) &&
                Objects.equals(lastName, employees.lastName) &&
                Objects.equals(gender, employees.gender) &&
                Objects.equals(hireDate, employees.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, birthDate, firstName, lastName, gender, hireDate);
    }

    @OneToMany(mappedBy = "employeesByEmpNo")
    public Collection<DeptEmp> getDeptEmpsByEmpNo() {
        return deptEmpsByEmpNo;
    }

    public void setDeptEmpsByEmpNo(Collection<DeptEmp> deptEmpsByEmpNo) {
        this.deptEmpsByEmpNo = deptEmpsByEmpNo;
    }

    @OneToMany(mappedBy = "employeesByEmpNo")
    public Collection<DeptManager> getDeptManagersByEmpNo() {
        return deptManagersByEmpNo;
    }

    public void setDeptManagersByEmpNo(Collection<DeptManager> deptManagersByEmpNo) {
        this.deptManagersByEmpNo = deptManagersByEmpNo;
    }

    @OneToMany(mappedBy = "employeesByEmpNo")
    public Collection<Salaries> getSalariesByEmpNo() {
        return salariesByEmpNo;
    }

    public void setSalariesByEmpNo(Collection<Salaries> salariesByEmpNo) {
        this.salariesByEmpNo = salariesByEmpNo;
    }

    @OneToMany(mappedBy = "employeesByEmpNo")
    public Collection<Titles> getTitlesByEmpNo() {
        return titlesByEmpNo;
    }

    public void setTitlesByEmpNo(Collection<Titles> titlesByEmpNo) {
        this.titlesByEmpNo = titlesByEmpNo;
    }
}
