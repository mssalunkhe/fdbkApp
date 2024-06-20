package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.BatchDto;
import com.webapp.fdbkrestful.entity.Batch;

public class BatchMapper {
    public static BatchDto mapToBatchDto(Batch batch){
        return new BatchDto(batch.getId(), batch.getName(), batch.getDescription());
    }
    public static Batch mapToBatch(BatchDto batchDto){
        return new Batch(batchDto.getId(), batchDto.getName(), batchDto.getDescription());
    }
}
