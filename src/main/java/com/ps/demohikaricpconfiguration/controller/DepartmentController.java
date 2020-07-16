package com.ps.demohikaricpconfiguration.controller;

import com.ps.demohikaricpconfiguration.entities.Departments;
import com.ps.demohikaricpconfiguration.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("departments")
    public List<Departments> getAll(){
        return departmentService.getAllDepartments();
    }
}
