package com.infm255.parkManagementSystem.services;

import com.infm255.parkManagementSystem.domain.Children;

import java.util.List;

public interface ChildrenService {

    List<Children> getAllChildren();

    List<Children> addChild(List<Children> children);

}
