package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.BatchDto;

import java.util.List;

public interface BatchService {
    public BatchDto createBatch(BatchDto batchDto);
    public BatchDto getBatchByID(int id);
    public List<BatchDto> getAllBatches();
    public  BatchDto updateBatch(int id,BatchDto batchDto);
    public BatchDto deleteBatch(int id);
}
