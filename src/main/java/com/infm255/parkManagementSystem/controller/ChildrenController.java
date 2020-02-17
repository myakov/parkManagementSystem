package com.infm255.parkManagementSystem.controller;


import com.infm255.parkManagementSystem.domain.Children;
import com.infm255.parkManagementSystem.repository.ChildrenRepository;
import com.infm255.parkManagementSystem.services.ChildrenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("child")
@RequiredArgsConstructor
public class ChildrenController {

    private final ChildrenService childrenService;


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Children> getAllChilds() {
        return childrenService.getAllChildren();
    }

    @PostMapping(value = "add", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<String> createChildren(@Valid @RequestBody List<Children> childrenList) {
        childrenService.addChild(childrenList);
        return new ResponseEntity<>("Children inserted successfully", HttpStatus.OK);
    }



}

