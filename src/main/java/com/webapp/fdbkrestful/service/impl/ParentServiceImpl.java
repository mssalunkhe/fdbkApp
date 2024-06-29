package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.ParentDto;
import com.webapp.fdbkrestful.entity.Parent;
import com.webapp.fdbkrestful.mapper.ParentMapper;
import com.webapp.fdbkrestful.repository.ParentRepository;
import com.webapp.fdbkrestful.service.ParentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ParentServiceImpl implements ParentService {
    ParentRepository parentRepository;

    @Override
    public ParentDto createParent(ParentDto parentDto) {
        Parent parent = ParentMapper.mapToParent(parentDto);
        Parent createdParent = parentRepository.save(parent);
        return ParentMapper.mapToParentDto(createdParent);
    }

    @Override
    public ParentDto getParentByID(int id) {
        Parent fetchedParent = parentRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return ParentMapper.mapToParentDto(fetchedParent);
    }

    @Override
    public List<ParentDto> getAllParents() {

        return parentRepository.findAll().stream().map(ParentMapper::mapToParentDto).toList();
    }

    @Override
    public ParentDto updateParent(int id, ParentDto parentDto) {
        Parent fetchedParent = parentRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedParent.setName(parentDto.getName());
        fetchedParent.setWards(parentDto.getWards());
        parentRepository.save(fetchedParent);
        return ParentMapper.mapToParentDto(fetchedParent);
    }

    @Override
    public ParentDto deleteParent(int id) {
        Parent fetchedParent = parentRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        parentRepository.deleteById(id);
        return ParentMapper.mapToParentDto(fetchedParent);
    }
}
