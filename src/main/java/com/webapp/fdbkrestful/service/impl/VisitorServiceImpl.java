package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.VisitorDto;
import com.webapp.fdbkrestful.entity.Visitor;
import com.webapp.fdbkrestful.mapper.VisitorMapper;
import com.webapp.fdbkrestful.repository.VisitorRepository;
import com.webapp.fdbkrestful.service.VisitorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VisitorServiceImpl implements VisitorService {
    VisitorRepository visitorRepository;

    @Override
    public VisitorDto createVisitor(VisitorDto visitorDto) {
        Visitor visitor = VisitorMapper.mapToVisitor(visitorDto);
        Visitor createdVisitor = visitorRepository.save(visitor);
        return VisitorMapper.mapToVisitorDto(createdVisitor);
    }

    @Override
    public VisitorDto getVisitorByID(int id) {
        Visitor fetchedVisitor = visitorRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return VisitorMapper.mapToVisitorDto(fetchedVisitor);
    }

    @Override
    public List<VisitorDto> getAllVisitors() {

        return visitorRepository.findAll().stream().map(VisitorMapper::mapToVisitorDto).toList();
    }

    @Override
    public VisitorDto updateVisitor(int id, VisitorDto visitorDto) {
        Visitor fetchedVisitor = visitorRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedVisitor.setName(visitorDto.getName());
        fetchedVisitor.setName(visitorDto.getName());
        visitorRepository.save(fetchedVisitor);
        return VisitorMapper.mapToVisitorDto(fetchedVisitor);
    }

    @Override
    public VisitorDto deleteVisitor(int id) {
        Visitor fetchedVisitor = visitorRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        visitorRepository.deleteById(id);
        return VisitorMapper.mapToVisitorDto(fetchedVisitor);
    }
}
