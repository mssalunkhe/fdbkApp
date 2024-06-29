package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.ParentDto;

import java.util.List;

public interface ParentService {
    public ParentDto createParent(ParentDto parentDto);

    public ParentDto getParentByID(int id);

    public List<ParentDto> getAllParents();

    public ParentDto updateParent(int id, ParentDto parentDto);

    public ParentDto deleteParent(int id);
}
