package com.ps.demohikaricpconfiguration.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(TitlesPK.class)
public class Titles {
    private int empNo;
    private String title;
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

    @Id
    @Column(name = "title", nullable = false, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "to_date", nullable = true)
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
        Titles titles = (Titles) o;
        return empNo == titles.empNo &&
                Objects.equals(title, titles.title) &&
                Objects.equals(fromDate, titles.fromDate) &&
                Objects.equals(toDate, titles.toDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, title, fromDate, toDate);
    }

    @ManyToOne
    @JoinColumn(name = "emp_no", referencedColumnName = "emp_no", nullable = false , insertable = false, updatable = false)
    public Employees getEmployeesByEmpNo() {
        return employeesByEmpNo;
    }

    public void setEmployeesByEmpNo(Employees employeesByEmpNo) {
        this.employeesByEmpNo = employeesByEmpNo;
    }
}
