package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.AnswerDto;
import com.webapp.fdbkrestful.entity.Answer;
import com.webapp.fdbkrestful.mapper.AnswerMapper;
import com.webapp.fdbkrestful.repository.AnswerRepository;
import com.webapp.fdbkrestful.service.AnswerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AnswerServiceImpl implements AnswerService {
    AnswerRepository answerRepository;

    @Override
    public AnswerDto createAnswer(AnswerDto answerDto) {
        Answer answer = AnswerMapper.mapToAnswer(answerDto);
        Answer createdAnswer = answerRepository.save(answer);
        return AnswerMapper.mapToAnswerDto(createdAnswer);
    }

    @Override
    public AnswerDto getAnswerByID(int id) {
        Answer fetchedAnswer = answerRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return AnswerMapper.mapToAnswerDto(fetchedAnswer);
    }

    @Override
    public List<AnswerDto> getAllAnswers() {

        return answerRepository.findAll().stream().map(AnswerMapper::mapToAnswerDto).toList();
    }

    @Override
    public AnswerDto updateAnswer(int id, AnswerDto answerDto) {
        Answer fetchedAnswer = answerRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedAnswer.setFeedback(answerDto.getFeedback());
        fetchedAnswer.setQuestion(answerDto.getQuestion());
        answerRepository.save(fetchedAnswer);
        return AnswerMapper.mapToAnswerDto(fetchedAnswer);
    }

    @Override
    public AnswerDto deleteAnswer(int id) {
        Answer fetchedAnswer = answerRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        answerRepository.deleteById(id);
        return AnswerMapper.mapToAnswerDto(fetchedAnswer);
    }
}
