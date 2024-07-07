package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.BatchToCoursesetMapDto;
import com.webapp.fdbkrestful.service.BatchToCoursesetMapService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/batchToCoursesetMap")
public class BatchToCoursesetMapController {
    private BatchToCoursesetMapService batchToCoursesetMapService;

    @PostMapping
    public ResponseEntity<BatchToCoursesetMapDto> createBatchToCoursesetMap(@RequestBody BatchToCoursesetMapDto batchToCoursesetMapDto){
        BatchToCoursesetMapDto createdBatchToCoursesetMap = batchToCoursesetMapService.createBatchToCoursesetMap(batchToCoursesetMapDto);
        return  new ResponseEntity<>(createdBatchToCoursesetMap, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<BatchToCoursesetMapDto> getBatchToCoursesetMapById(@PathVariable("id") int id){
        BatchToCoursesetMapDto fetchedBatchToCoursesetMap = batchToCoursesetMapService.getBatchToCoursesetMapByID(id);
        return ResponseEntity.ok(fetchedBatchToCoursesetMap);
    }
    @GetMapping()
    public ResponseEntity<List<BatchToCoursesetMapDto>> getAllBatchToCoursesetMapes(){
        List<BatchToCoursesetMapDto> fetchedBatchToCoursesetMapes = batchToCoursesetMapService.getAllBatchToCoursesetMapes();
        return ResponseEntity.ok(fetchedBatchToCoursesetMapes);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<BatchToCoursesetMapDto> deleteBatchToCoursesetMapById(@PathVariable("id") int id){
        BatchToCoursesetMapDto deletedBatchToCoursesetMap = batchToCoursesetMapService.deleteBatchToCoursesetMap(id);
        return ResponseEntity.ok(deletedBatchToCoursesetMap);
    }
    @PutMapping("{id}")
    public ResponseEntity<BatchToCoursesetMapDto> updateBatchToCoursesetMap(@PathVariable("id") int id,@RequestBody BatchToCoursesetMapDto batchToCoursesetMapDto){
        BatchToCoursesetMapDto updatedBatchToCoursesetMap = batchToCoursesetMapService.updateBatchToCoursesetMap(id, batchToCoursesetMapDto);
        return  ResponseEntity.ok(updatedBatchToCoursesetMap);
    }
}
