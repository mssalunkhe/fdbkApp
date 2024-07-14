package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.QuestionnaireDto;

import java.util.List;

public interface QuestionnaireService {
    public QuestionnaireDto createQuestionnaire(QuestionnaireDto questionnaireDto);

    public QuestionnaireDto getQuestionnaireByID(int id);

    public List<QuestionnaireDto> getAllQuestionnaires();

    public QuestionnaireDto updateQuestionnaire(int id, QuestionnaireDto questionnaireDto);

    public QuestionnaireDto deleteQuestionnaire(int id);
}
