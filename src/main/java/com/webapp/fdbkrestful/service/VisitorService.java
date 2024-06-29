package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.VisitorDto;

import java.util.List;

public interface VisitorService {
    public VisitorDto createVisitor(VisitorDto visitorDto);

    public VisitorDto getVisitorByID(int id);

    public List<VisitorDto> getAllVisitors();

    public VisitorDto updateVisitor(int id, VisitorDto visitorDto);

    public VisitorDto deleteVisitor(int id);
}
