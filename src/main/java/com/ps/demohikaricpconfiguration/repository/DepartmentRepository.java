package com.ps.demohikaricpconfiguration.repository;

import com.ps.demohikaricpconfiguration.entities.Departments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Departments, Integer> {
}
