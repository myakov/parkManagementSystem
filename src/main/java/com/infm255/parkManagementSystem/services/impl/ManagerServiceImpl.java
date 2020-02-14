package com.infm255.parkManagementSystem.services.impl;

import com.infm255.parkManagementSystem.domain.Manager;
import com.infm255.parkManagementSystem.repository.ManagerRepository;
import com.infm255.parkManagementSystem.services.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {

    private final ManagerRepository managerRepository;

    @Override
    public List<Manager> getAllManagers() {
        return managerRepository.findAll();
    }

    @Override
    public List<Manager> addManager(List<Manager> managers) {
        return managerRepository.saveAll(managers);
    }


}
