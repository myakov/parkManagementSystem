package com.infm255.parkManagementSystem.controller;

import com.infm255.parkManagementSystem.domain.Children;
import com.infm255.parkManagementSystem.domain.Manager;
import com.infm255.parkManagementSystem.services.ChildrenService;
import com.infm255.parkManagementSystem.services.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("manager")
@RequiredArgsConstructor
public class ManagerController {

    private final ManagerService managerService;


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Manager> getAllManagers() {
        return managerService.getAllManagers();
    }

    @PostMapping(value = "add", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<String> createManager(@Valid @RequestBody List<Manager> managers) {
        managerService.addManager(managers);
        return new ResponseEntity<>("Managers inserted successfully", HttpStatus.OK);

    }
}
