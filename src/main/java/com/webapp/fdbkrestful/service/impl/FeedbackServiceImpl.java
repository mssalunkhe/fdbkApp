package com.webapp.fdbkrestful.service.impl;

import com.webapp.fdbkrestful.dto.FeedbackDto;
import com.webapp.fdbkrestful.entity.Feedback;
import com.webapp.fdbkrestful.mapper.FeedbackMapper;
import com.webapp.fdbkrestful.repository.FeedbackRepository;
import com.webapp.fdbkrestful.service.FeedbackService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {
    FeedbackRepository feedbackRepository;

    @Override
    public FeedbackDto createFeedback(FeedbackDto feedbackDto) {
        Feedback feedback = FeedbackMapper.mapToFeedback(feedbackDto);
        Feedback createdFeedback = feedbackRepository.save(feedback);
        return FeedbackMapper.mapToFeedbackDto(createdFeedback);
    }

    @Override
    public FeedbackDto getFeedbackByID(int id) {
        Feedback fetchedFeedback = feedbackRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        return FeedbackMapper.mapToFeedbackDto(fetchedFeedback);
    }

    @Override
    public List<FeedbackDto> getAllFeedbacks() {

        return feedbackRepository.findAll().stream().map(FeedbackMapper::mapToFeedbackDto).toList();
    }

    @Override
    public FeedbackDto updateFeedback(int id, FeedbackDto feedbackDto) {
        Feedback fetchedFeedback = feedbackRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found"));
        fetchedFeedback.setTitle(feedbackDto.getTitle());
        fetchedFeedback.setDescription(feedbackDto.getDescription());
        feedbackRepository.save(fetchedFeedback);
        return FeedbackMapper.mapToFeedbackDto(fetchedFeedback);
    }

    @Override
    public FeedbackDto deleteFeedback(int id) {
        Feedback fetchedFeedback = feedbackRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found for deletion"));
        feedbackRepository.deleteById(id);
        return FeedbackMapper.mapToFeedbackDto(fetchedFeedback);
    }
}
