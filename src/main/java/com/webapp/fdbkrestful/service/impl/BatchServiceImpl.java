package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.BatchDto;
import com.webapp.fdbkrestful.entity.Batch;
import com.webapp.fdbkrestful.mapper.BatchMapper;
import com.webapp.fdbkrestful.repository.BatchRepository;
import com.webapp.fdbkrestful.service.BatchIService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BatchServiceImpl implements BatchIService {
    BatchRepository batchRepository;
    @Override
    public BatchDto createBatch(BatchDto batchDto) {
        Batch batch= BatchMapper.mapToBatch(batchDto);
        Batch createdBatch= batchRepository.save(batch);
        return BatchMapper.mapToBatchDto(createdBatch);
    }

    @Override
    public BatchDto getBatchByID(int id) {
        batchRepository.ge
    }

    @Override
    public List<BatchDto> getAllBatches() {
        return null;
    }

    @Override
    public BatchDto updateBatch(int id, BatchDto batchDto) {
        return null;
    }

    @Override
    public BatchDto deleteBatch(int id) {
        return null;
    }
}
