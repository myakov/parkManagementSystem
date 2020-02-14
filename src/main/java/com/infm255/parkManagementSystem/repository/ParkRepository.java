package com.infm255.parkManagementSystem.repository;

import com.infm255.parkManagementSystem.domain.Park;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkRepository extends JpaRepository<Park, Long> {
}
