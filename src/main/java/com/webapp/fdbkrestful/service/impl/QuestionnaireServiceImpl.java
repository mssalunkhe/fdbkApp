package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.QuestionnaireDto;
import com.webapp.fdbkrestful.entity.Questionnaire;
import com.webapp.fdbkrestful.mapper.QuestionnaireMapper;
import com.webapp.fdbkrestful.repository.QuestionnaireRepository;
import com.webapp.fdbkrestful.service.QuestionnaireService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionnaireServiceImpl implements QuestionnaireService {
    QuestionnaireRepository questionnaireRepository;

    @Override
    public QuestionnaireDto createQuestionnaire(QuestionnaireDto questionnaireDto) {
        Questionnaire questionnaire = QuestionnaireMapper.mapToQuestionnaire(questionnaireDto);
        Questionnaire createdQuestionnaire = questionnaireRepository.save(questionnaire);
        return QuestionnaireMapper.mapToQuestionnaireDto(createdQuestionnaire);
    }

    @Override
    public QuestionnaireDto getQuestionnaireByID(int id) {
        Questionnaire fetchedQuestionnaire = questionnaireRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return QuestionnaireMapper.mapToQuestionnaireDto(fetchedQuestionnaire);
    }

    @Override
    public List<QuestionnaireDto> getAllQuestionnaires() {

        return questionnaireRepository.findAll().stream().map(QuestionnaireMapper::mapToQuestionnaireDto).toList();
    }

    @Override
    public QuestionnaireDto updateQuestionnaire(int id, QuestionnaireDto questionnaireDto) {
        Questionnaire fetchedQuestionnaire = questionnaireRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedQuestionnaire.setQuestions(questionnaireDto.getQuestions());
        fetchedQuestionnaire.setTitle(questionnaireDto.getTitle());
        questionnaireRepository.save(fetchedQuestionnaire);
        return QuestionnaireMapper.mapToQuestionnaireDto(fetchedQuestionnaire);
    }

    @Override
    public QuestionnaireDto deleteQuestionnaire(int id) {
        Questionnaire fetchedQuestionnaire = questionnaireRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        questionnaireRepository.deleteById(id);
        return QuestionnaireMapper.mapToQuestionnaireDto(fetchedQuestionnaire);
    }
}
