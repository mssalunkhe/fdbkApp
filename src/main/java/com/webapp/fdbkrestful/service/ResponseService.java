package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.ResponseDto;

import java.util.List;

public interface ResponseService {
    public ResponseDto createResponse(ResponseDto responseDto);

    public ResponseDto getResponseByID(int id);

    public List<ResponseDto> getAllResponses();

    public ResponseDto updateResponse(int id, ResponseDto responseDto);

    public ResponseDto deleteResponse(int id);
}
