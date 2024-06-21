package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.BatchDto;
import com.webapp.fdbkrestful.service.BatchIService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/batch")
public class BatchController {
    private BatchIService batchIService;

    @PostMapping
    public ResponseEntity<BatchDto> createBatch(@RequestBody BatchDto batchDto){
        BatchDto createdBatch= batchIService.createBatch(batchDto);
        return  new ResponseEntity<>(createdBatch, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<BatchDto> getBatchById(@PathVariable("id") int id){
        BatchDto fetchedBatch = batchIService.getBatchByID(id);
        return ResponseEntity.ok(fetchedBatch);
    }
    @GetMapping()
    public ResponseEntity<List<BatchDto>> getAllBatches(){
        List<BatchDto> fetchedBatches = batchIService.getAllBatches();
        return ResponseEntity.ok(fetchedBatches);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<BatchDto> deleteBatchById(@PathVariable("id") int id){
        BatchDto deletedBatch = batchIService.deleteBatch(id);
        return ResponseEntity.ok(deletedBatch);
    }
    @PutMapping("{id}")
    public ResponseEntity<BatchDto> updateBatch(@PathVariable("id") int id,@RequestBody BatchDto batchDto){
        BatchDto updatedBatch= batchIService.updateBatch(id,batchDto);
        return  ResponseEntity.ok(updatedBatch);
    }
}
