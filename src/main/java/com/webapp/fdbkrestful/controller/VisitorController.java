package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.VisitorDto;
import com.webapp.fdbkrestful.service.VisitorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/visitor")
public class VisitorController {
    private VisitorService visitorService;

    @PostMapping
    public ResponseEntity<VisitorDto> createVisitor(@RequestBody VisitorDto visitorDto) {
        VisitorDto createdVisitor = visitorService.createVisitor(visitorDto);
        return new ResponseEntity<>(createdVisitor, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<VisitorDto> getVisitorById(@PathVariable("id") int id) {
        VisitorDto fetchedVisitor = visitorService.getVisitorByID(id);
        return ResponseEntity.ok(fetchedVisitor);
    }

    @GetMapping()
    public ResponseEntity<List<VisitorDto>> getAllVisitores() {
        List<VisitorDto> fetchedVisitors = visitorService.getAllVisitors();
        return ResponseEntity.ok(fetchedVisitors);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<VisitorDto> deleteVisitorById(@PathVariable("id") int id) {
        VisitorDto deletedVisitor = visitorService.deleteVisitor(id);
        return ResponseEntity.ok(deletedVisitor);
    }

    @PutMapping("{id}")
    public ResponseEntity<VisitorDto> updateVisitor(@PathVariable("id") int id, @RequestBody VisitorDto visitorDto) {
        VisitorDto updatedVisitor = visitorService.updateVisitor(id, visitorDto);
        return ResponseEntity.ok(updatedVisitor);
    }
}
