package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.McqDto;
import com.webapp.fdbkrestful.entity.Mcq;
import com.webapp.fdbkrestful.mapper.McqMapper;
import com.webapp.fdbkrestful.repository.McqRepository;
import com.webapp.fdbkrestful.service.McqService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class McqServiceImpl implements McqService {
    McqRepository mcqRepository;

    @Override
    public McqDto createMcq(McqDto mcqDto) {
        Mcq mcq = McqMapper.mapToMcq(mcqDto);
        Mcq createdMcq = mcqRepository.save(mcq);
        return McqMapper.mapToMcqDto(createdMcq);
    }

    @Override
    public McqDto getMcqByID(int id) {
        Mcq fetchedMcq = mcqRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return McqMapper.mapToMcqDto(fetchedMcq);
    }

    @Override
    public List<McqDto> getAllMcqs() {

        return mcqRepository.findAll().stream().map(McqMapper::mapToMcqDto).toList();
    }

    @Override
    public McqDto updateMcq(int id, McqDto mcqDto) {
        Mcq fetchedMcq = mcqRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedMcq.setText(mcqDto.getText());
        fetchedMcq.setOptions(mcqDto.getOptions());
        mcqRepository.save(fetchedMcq);
        return McqMapper.mapToMcqDto(fetchedMcq);
    }

    @Override
    public McqDto deleteMcq(int id) {
        Mcq fetchedMcq = mcqRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        mcqRepository.deleteById(id);
        return McqMapper.mapToMcqDto(fetchedMcq);
    }
}
