package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.ResponseDto;
import com.webapp.fdbkrestful.entity.Response;
import com.webapp.fdbkrestful.mapper.TextQuestionMapper;
import com.webapp.fdbkrestful.mapper.ResponseMapper;
import com.webapp.fdbkrestful.repository.ResponseRepository;
import com.webapp.fdbkrestful.service.ResponseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ResponseServiceImpl implements ResponseService {
    ResponseRepository responseRepository;

    @Override
    public ResponseDto createResponse(ResponseDto responseDto) {
        Response response = ResponseMapper.mapToResponse(responseDto);
        Response createdResponse = responseRepository.save(response);
        return ResponseMapper.mapToResponseDto(createdResponse);
    }

    @Override
    public ResponseDto getResponseByID(int id) {
        Response fetchedResponse = responseRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return ResponseMapper.mapToResponseDto(fetchedResponse);
    }

    @Override
    public List<ResponseDto> getAllResponses() {

        return responseRepository.findAll().stream().map(ResponseMapper::mapToResponseDto).toList();
    }

    @Override
    public ResponseDto updateResponse(int id, ResponseDto responseDto) {
        Response fetchedResponse = responseRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));

        fetchedResponse.setQuestion(TextQuestionMapper.mapToTextQuestion(responseDto.getQuestionDto()));
        responseRepository.save(fetchedResponse);
        return ResponseMapper.mapToResponseDto(fetchedResponse);
    }

    @Override
    public ResponseDto deleteResponse(int id) {
        Response fetchedResponse = responseRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        responseRepository.deleteById(id);
        return ResponseMapper.mapToResponseDto(fetchedResponse);
    }
}
