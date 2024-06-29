package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.ParentDto;
import com.webapp.fdbkrestful.service.ParentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/parent")
public class ParentController {
    private ParentService parentService;

    @PostMapping
    public ResponseEntity<ParentDto> createParent(@RequestBody ParentDto parentDto) {
        ParentDto createdParent = parentService.createParent(parentDto);
        return new ResponseEntity<>(createdParent, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ParentDto> getParentById(@PathVariable("id") int id) {
        ParentDto fetchedParent = parentService.getParentByID(id);
        return ResponseEntity.ok(fetchedParent);
    }

    @GetMapping()
    public ResponseEntity<List<ParentDto>> getAllParents() {
        List<ParentDto> fetchedParents = parentService.getAllParents();
        return ResponseEntity.ok(fetchedParents);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ParentDto> deleteParentById(@PathVariable("id") int id) {
        ParentDto deletedParent = parentService.deleteParent(id);
        return ResponseEntity.ok(deletedParent);
    }

    @PutMapping("{id}")
    public ResponseEntity<ParentDto> updateParent(@PathVariable("id") int id, @RequestBody ParentDto parentDto) {
        ParentDto updatedParent = parentService.updateParent(id, parentDto);
        return ResponseEntity.ok(updatedParent);
    }
}
