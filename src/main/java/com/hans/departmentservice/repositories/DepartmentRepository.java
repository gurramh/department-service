package com.hans.departmentservice.repositories;

import com.hans.departmentservice.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
