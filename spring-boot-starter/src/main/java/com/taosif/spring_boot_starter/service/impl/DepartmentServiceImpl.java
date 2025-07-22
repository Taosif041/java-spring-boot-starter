package com.taosif.spring_boot_starter.service.impl;

import com.taosif.spring_boot_starter.entity.Department;
import com.taosif.spring_boot_starter.repository.DepartmentRepository;
import com.taosif.spring_boot_starter.service.Interfaces.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
