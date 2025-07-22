package com.taosif.spring_boot_starter.repository;

import com.taosif.spring_boot_starter.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
