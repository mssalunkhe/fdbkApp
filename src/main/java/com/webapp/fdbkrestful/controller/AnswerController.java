package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.AnswerDto;
import com.webapp.fdbkrestful.service.AnswerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/answer")
public class AnswerController {
    private AnswerService answerService;

    @PostMapping
    public ResponseEntity<AnswerDto> createAnswer(@RequestBody AnswerDto answerDto) {
        AnswerDto createdAnswer = answerService.createAnswer(answerDto);
        return new ResponseEntity<>(createdAnswer, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<AnswerDto> getAnswerById(@PathVariable("id") int id) {
        AnswerDto fetchedAnswer = answerService.getAnswerByID(id);
        return ResponseEntity.ok(fetchedAnswer);
    }

    @GetMapping()
    public ResponseEntity<List<AnswerDto>> getAllAnswers() {
        List<AnswerDto> fetchedAnsweres = answerService.getAllAnswers();
        return ResponseEntity.ok(fetchedAnsweres);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<AnswerDto> deleteAnswerById(@PathVariable("id") int id) {
        AnswerDto deletedAnswer = answerService.deleteAnswer(id);
        return ResponseEntity.ok(deletedAnswer);
    }

    @PutMapping("{id}")
    public ResponseEntity<AnswerDto> updateAnswer(@PathVariable("id") int id, @RequestBody AnswerDto answerDto) {
        AnswerDto updatedAnswer = answerService.updateAnswer(id, answerDto);
        return ResponseEntity.ok(updatedAnswer);
    }
}
