package com.ps.demohikaricpconfiguration.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Departments {
    private String deptNo;
    private String deptName;
    private Collection<DeptEmp> deptEmpsByDeptNo;
    private Collection<DeptManager> deptManagersByDeptNo;

    @Id
    @Column(name = "dept_no", nullable = false, length = 4)
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Basic
    @Column(name = "dept_name", nullable = false, length = 40)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departments that = (Departments) o;
        return Objects.equals(deptNo, that.deptNo) &&
                Objects.equals(deptName, that.deptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptNo, deptName);
    }

    @OneToMany(mappedBy = "departmentsByDeptNo")
    public Collection<DeptEmp> getDeptEmpsByDeptNo() {
        return deptEmpsByDeptNo;
    }

    public void setDeptEmpsByDeptNo(Collection<DeptEmp> deptEmpsByDeptNo) {
        this.deptEmpsByDeptNo = deptEmpsByDeptNo;
    }

    @OneToMany(mappedBy = "departmentsByDeptNo")
    public Collection<DeptManager> getDeptManagersByDeptNo() {
        return deptManagersByDeptNo;
    }

    public void setDeptManagersByDeptNo(Collection<DeptManager> deptManagersByDeptNo) {
        this.deptManagersByDeptNo = deptManagersByDeptNo;
    }
}
