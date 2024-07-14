package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.QuestionnaireDto;
import com.webapp.fdbkrestful.service.QuestionnaireService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/questionnaire")
public class QuestionnaireController {
    private QuestionnaireService questionnaireService;

    @PostMapping
    public ResponseEntity<QuestionnaireDto> createQuestionnaire(@RequestBody QuestionnaireDto questionnaireDto) {
        QuestionnaireDto createdQuestionnaire = questionnaireService.createQuestionnaire(questionnaireDto);
        return new ResponseEntity<>(createdQuestionnaire, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<QuestionnaireDto> getQuestionnaireById(@PathVariable("id") int id) {
        QuestionnaireDto fetchedQuestionnaire = questionnaireService.getQuestionnaireByID(id);
        return ResponseEntity.ok(fetchedQuestionnaire);
    }

    @GetMapping()
    public ResponseEntity<List<QuestionnaireDto>> getAllQuestionnaires() {
        List<QuestionnaireDto> fetchedQuestionnairees = questionnaireService.getAllQuestionnaires();
        return ResponseEntity.ok(fetchedQuestionnairees);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<QuestionnaireDto> deleteQuestionnaireById(@PathVariable("id") int id) {
        QuestionnaireDto deletedQuestionnaire = questionnaireService.deleteQuestionnaire(id);
        return ResponseEntity.ok(deletedQuestionnaire);
    }

    @PutMapping("{id}")
    public ResponseEntity<QuestionnaireDto> updateQuestionnaire(@PathVariable("id") int id, @RequestBody QuestionnaireDto questionnaireDto) {
        QuestionnaireDto updatedQuestionnaire = questionnaireService.updateQuestionnaire(id, questionnaireDto);
        return ResponseEntity.ok(updatedQuestionnaire);
    }
}
