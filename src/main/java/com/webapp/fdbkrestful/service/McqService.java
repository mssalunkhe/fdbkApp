package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.McqDto;

import java.util.List;

public interface McqService {
    public McqDto createMcq(McqDto mcqDto);

    public McqDto getMcqByID(int id);

    public List<McqDto> getAllMcqs();

    public McqDto updateMcq(int id, McqDto mcqDto);

    public McqDto deleteMcq(int id);
}
