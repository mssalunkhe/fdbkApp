package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.TextQuestionDto;
import com.webapp.fdbkrestful.service.TextQuestionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/textQuestion")
public class TextQuestionController {
    private TextQuestionService textQuestionService;

    @PostMapping
    public ResponseEntity<TextQuestionDto> createTextQuestion(@RequestBody TextQuestionDto textQuestionDto) {
        TextQuestionDto createdTextQuestion = textQuestionService.createTextQuestion(textQuestionDto);
        return new ResponseEntity<>(createdTextQuestion, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<TextQuestionDto> getTextQuestionById(@PathVariable("id") int id) {
        TextQuestionDto fetchedTextQuestion = textQuestionService.getTextQuestionByID(id);
        return ResponseEntity.ok(fetchedTextQuestion);
    }

    @GetMapping()
    public ResponseEntity<List<TextQuestionDto>> getAllTextQuestions() {
        List<TextQuestionDto> fetchedTextQuestiones = textQuestionService.getAllTextQuestions();
        return ResponseEntity.ok(fetchedTextQuestiones);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<TextQuestionDto> deleteTextQuestionById(@PathVariable("id") int id) {
        TextQuestionDto deletedTextQuestion = textQuestionService.deleteTextQuestion(id);
        return ResponseEntity.ok(deletedTextQuestion);
    }

    @PutMapping("{id}")
    public ResponseEntity<TextQuestionDto> updateTextQuestion(@PathVariable("id") int id, @RequestBody TextQuestionDto textQuestionDto) {
        TextQuestionDto updatedTextQuestion = textQuestionService.updateTextQuestion(id, textQuestionDto);
        return ResponseEntity.ok(updatedTextQuestion);
    }
}
