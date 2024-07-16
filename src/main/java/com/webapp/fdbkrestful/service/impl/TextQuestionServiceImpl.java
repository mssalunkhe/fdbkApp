package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.TextQuestionDto;
import com.webapp.fdbkrestful.entity.TextQuestion;
import com.webapp.fdbkrestful.mapper.TextQuestionMapper;
import com.webapp.fdbkrestful.repository.TextQuestionRepository;
import com.webapp.fdbkrestful.service.TextQuestionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TextQuestionServiceImpl implements TextQuestionService {
    TextQuestionRepository textQuestionRepository;

    @Override
    public TextQuestionDto createTextQuestion(TextQuestionDto textQuestionDto) {
        TextQuestion textQuestion = TextQuestionMapper.mapToTextQuestion(textQuestionDto);
        TextQuestion createdTextQuestion = textQuestionRepository.save(textQuestion);
        return TextQuestionMapper.mapToTextQuestionDto(createdTextQuestion);
    }

    @Override
    public TextQuestionDto getTextQuestionByID(int id) {
        TextQuestion fetchedTextQuestion = textQuestionRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return TextQuestionMapper.mapToTextQuestionDto(fetchedTextQuestion);
    }

    @Override
    public List<TextQuestionDto> getAllTextQuestions() {

        return textQuestionRepository.findAll().stream().map(TextQuestionMapper::mapToTextQuestionDto).toList();
    }

    @Override
    public TextQuestionDto updateTextQuestion(int id, TextQuestionDto textQuestionDto) {
        TextQuestion fetchedTextQuestion = textQuestionRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedTextQuestion.setText(textQuestionDto.getText());

        textQuestionRepository.save(fetchedTextQuestion);
        return TextQuestionMapper.mapToTextQuestionDto(fetchedTextQuestion);
    }

    @Override
    public TextQuestionDto deleteTextQuestion(int id) {
        TextQuestion fetchedTextQuestion = textQuestionRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        textQuestionRepository.deleteById(id);
        return TextQuestionMapper.mapToTextQuestionDto(fetchedTextQuestion);
    }
}
