package com.infm255.parkManagementSystem.services;

import com.infm255.parkManagementSystem.domain.Park;

import java.util.List;
import java.util.Optional;

public interface ParkService {

    List<Park> getAllParks();

    Optional<Park> getParkInfoById(Long id);

    List<Park> addParks(List<Park> parks);
}
