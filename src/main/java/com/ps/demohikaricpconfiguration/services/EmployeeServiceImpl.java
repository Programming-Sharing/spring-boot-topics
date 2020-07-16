package com.ps.demohikaricpconfiguration.services;

import com.ps.demohikaricpconfiguration.entities.Departments;
import com.ps.demohikaricpconfiguration.repository.DepartmentRepository;
import com.ps.demohikaricpconfiguration.entities.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Departments> getAllDepartments(){
        List<Departments> employeesList = new ArrayList<>();
        departmentRepository.findAll().iterator().forEachRemaining(employeesList::add);
        return employeesList;
    }
}
