package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.ResponseDto;
import com.webapp.fdbkrestful.service.ResponseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/response")
public class ResponseController {
    private ResponseService responseService;

    @PostMapping
    public ResponseEntity<ResponseDto> createResponse(@RequestBody ResponseDto responseDto) {
        ResponseDto createdResponse = responseService.createResponse(responseDto);
        return new ResponseEntity<>(createdResponse, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getResponseById(@PathVariable("id") int id) {
        ResponseDto fetchedResponse = responseService.getResponseByID(id);
        return ResponseEntity.ok(fetchedResponse);
    }

    @GetMapping()
    public ResponseEntity<List<ResponseDto>> getAllResponses() {
        List<ResponseDto> fetchedResponsees = responseService.getAllResponses();
        return ResponseEntity.ok(fetchedResponsees);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ResponseDto> deleteResponseById(@PathVariable("id") int id) {
        ResponseDto deletedResponse = responseService.deleteResponse(id);
        return ResponseEntity.ok(deletedResponse);
    }

    @PutMapping("{id}")
    public ResponseEntity<ResponseDto> updateResponse(@PathVariable("id") int id, @RequestBody ResponseDto responseDto) {
        ResponseDto updatedResponse = responseService.updateResponse(id, responseDto);
        return ResponseEntity.ok(updatedResponse);
    }
}
