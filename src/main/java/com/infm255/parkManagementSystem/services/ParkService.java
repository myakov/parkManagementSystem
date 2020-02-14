package com.infm255.parkManagementSystem.services;

import com.infm255.parkManagementSystem.domain.Park;

import java.util.List;

public interface ParkService {

    List<Park> getAllParks();

    List<Park> addParks(List<Park> parks);
}
