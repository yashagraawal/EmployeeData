package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}
