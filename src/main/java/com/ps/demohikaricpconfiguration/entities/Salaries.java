package com.ps.demohikaricpconfiguration.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(SalariesPK.class)
public class Salaries {
    private int empNo;
    private int salary;
    private Date fromDate;
    private Date toDate;
    private Employees employeesByEmpNo;

    @Id
    @Column(name = "emp_no", nullable = false)
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "salary", nullable = false)
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Id
    @Column(name = "from_date", nullable = false)
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "to_date", nullable = false)
    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salaries salaries = (Salaries) o;
        return empNo == salaries.empNo &&
                salary == salaries.salary &&
                Objects.equals(fromDate, salaries.fromDate) &&
                Objects.equals(toDate, salaries.toDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, salary, fromDate, toDate);
    }

    @ManyToOne
    @JoinColumn(name = "emp_no", referencedColumnName = "emp_no", nullable = false, insertable = false, updatable = false)
    public Employees getEmployeesByEmpNo() {
        return employeesByEmpNo;
    }

    public void setEmployeesByEmpNo(Employees employeesByEmpNo) {
        this.employeesByEmpNo = employeesByEmpNo;
    }
}
