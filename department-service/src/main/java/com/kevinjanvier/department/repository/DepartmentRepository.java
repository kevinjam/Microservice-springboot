package com.kevinjanvier.department.repository;

import com.kevinjanvier.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentId(Long departmentId);
}
