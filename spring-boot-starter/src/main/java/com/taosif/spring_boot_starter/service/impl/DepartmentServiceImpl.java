package com.taosif.spring_boot_starter.service.impl;

import com.taosif.spring_boot_starter.entity.Department;
import com.taosif.spring_boot_starter.repository.DepartmentRepository;
import com.taosif.spring_boot_starter.service.Interfaces.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department currentData = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName()) &&
            !"".equalsIgnoreCase(department.getDepartmentName())){
            currentData.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())){
            currentData.setDepartmentAddress(department.getDepartmentAddress());
        }

        if(Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())){
            currentData.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepository.save(currentData);
    }

    @Override
    public Department getDepartmentByDepartmentName(String departmentName) {
        return departmentRepository.getDepartmentByDepartmentNameIgnoreCase(departmentName);
    }
}
