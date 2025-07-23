package com.taosif.spring_boot_starter.controller;

import com.taosif.spring_boot_starter.entity.Department;
import com.taosif.spring_boot_starter.service.Interfaces.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        LOGGER.info("inside save data");
        return  departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        LOGGER.info("inside get all");
        return  departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartment(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department with ID " + departmentId + " deleted successfully!";
    }

    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName) {
        return departmentService.getDepartmentByDepartmentName(departmentName);
    }

}