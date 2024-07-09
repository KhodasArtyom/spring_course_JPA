package com.artemhodas.spring.sprinboot.springboot_datajpa.dao;


import com.artemhodas.spring.sprinboot.springboot_datajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public List<Employee> findAllByName(String name);



}
