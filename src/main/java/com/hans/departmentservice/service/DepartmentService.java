package com.hans.departmentservice.service;

import com.hans.departmentservice.model.Department;
import com.hans.departmentservice.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Iterable<Department> getAllDepartments() {
        return  departmentRepository.findAll();
    }

    public Department getDepartment(Long id) {
        return departmentRepository.findById(id).orElse(new Department(0L, "NA", "NA"));
    }


}
