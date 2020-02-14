package com.infm255.parkManagementSystem.repository;

import com.infm255.parkManagementSystem.domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
