package com.infm255.parkManagementSystem.controller;

import com.infm255.parkManagementSystem.domain.Park;
import com.infm255.parkManagementSystem.services.ParkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("parks")
@RequiredArgsConstructor
public class ParkController {

    private final ParkService parkService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Park> getAllParks() {
        return parkService.getAllParks();
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Optional<Park> getParkInfoById(@PathVariable("id") Long id) {
        return parkService.getParkInfoById(id);
    }

    @PostMapping(value = "add", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<String> createPark(@Valid @RequestBody List<Park> parks) {
        parkService.addParks(parks);
        return new ResponseEntity<>("Parks inserted successfully", HttpStatus.OK);

    }
}
