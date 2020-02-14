package com.infm255.parkManagementSystem.services;

import com.infm255.parkManagementSystem.domain.Manager;

import java.util.List;

public interface ManagerService {

    List<Manager> getAllManagers();

    List<Manager> addManager(List<Manager> managers);

}
