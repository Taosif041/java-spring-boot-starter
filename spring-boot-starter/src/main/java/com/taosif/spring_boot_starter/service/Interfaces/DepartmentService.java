package com.taosif.spring_boot_starter.service.Interfaces;

import com.taosif.spring_boot_starter.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> getAllDepartments();
    public Department getDepartmentById(Long departmentId);
    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department getDepartmentByDepartmentName(String departmentName);
}
