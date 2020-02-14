package com.infm255.parkManagementSystem.services.impl;

import com.infm255.parkManagementSystem.domain.Park;
import com.infm255.parkManagementSystem.repository.ParkRepository;
import com.infm255.parkManagementSystem.services.ParkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ParkServiceImpl implements ParkService {

    private final ParkRepository parkRepository;

    @Override
    public List<Park> getAllParks() {
        return parkRepository.findAll();
    }

    @Override
    public List<Park> addParks(List<Park> parks) {
        return parkRepository.saveAll(parks);
    }
}
