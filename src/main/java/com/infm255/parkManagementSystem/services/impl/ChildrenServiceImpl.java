package com.infm255.parkManagementSystem.services.impl;

import com.infm255.parkManagementSystem.domain.Children;
import com.infm255.parkManagementSystem.repository.ChildrenRepository;
import com.infm255.parkManagementSystem.services.ChildrenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChildrenServiceImpl implements ChildrenService {

    private final ChildrenRepository childrenRepository;

    @Override
    public List<Children> getAllChildren() {
        return childrenRepository.findAll();
    }

    @Override
    public List<Children> addChild(List<Children> childrenList) {
        return childrenRepository.saveAll(childrenList);
    }
}
