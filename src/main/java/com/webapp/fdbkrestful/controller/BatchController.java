package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.BatchDto;
import com.webapp.fdbkrestful.service.BatchService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/batch")
public class BatchController {
    private BatchService batchService;

    @PostMapping
    public ResponseEntity<BatchDto> createBatch(@RequestBody BatchDto batchDto){
        BatchDto createdBatch = batchService.createBatch(batchDto);
        return  new ResponseEntity<>(createdBatch, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<BatchDto> getBatchById(@PathVariable("id") int id){
        BatchDto fetchedBatch = batchService.getBatchByID(id);
        return ResponseEntity.ok(fetchedBatch);
    }
    @GetMapping()
    public ResponseEntity<List<BatchDto>> getAllBatches(){
        List<BatchDto> fetchedBatches = batchService.getAllBatches();
        return ResponseEntity.ok(fetchedBatches);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<BatchDto> deleteBatchById(@PathVariable("id") int id){
        BatchDto deletedBatch = batchService.deleteBatch(id);
        return ResponseEntity.ok(deletedBatch);
    }
    @PutMapping("{id}")
    public ResponseEntity<BatchDto> updateBatch(@PathVariable("id") int id,@RequestBody BatchDto batchDto){
        BatchDto updatedBatch = batchService.updateBatch(id, batchDto);
        return  ResponseEntity.ok(updatedBatch);
    }
}
