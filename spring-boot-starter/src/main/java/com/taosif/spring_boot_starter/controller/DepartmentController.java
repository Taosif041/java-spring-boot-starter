package com.taosif.spring_boot_starter.controller;

import com.taosif.spring_boot_starter.entity.Department;
import com.taosif.spring_boot_starter.service.Interfaces.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return  departmentService.saveDepartment(department);
    }
}
