package com.webapp.fdbkrestful.controller;

import com.webapp.fdbkrestful.dto.FeedbackDto;
import com.webapp.fdbkrestful.service.FeedbackService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/feedback")
public class FeedbackController {
    private FeedbackService feedbackService;

    @PostMapping
    public ResponseEntity<FeedbackDto> createFeedback(@RequestBody FeedbackDto feedbackDto) {
        FeedbackDto createdFeedback = feedbackService.createFeedback(feedbackDto);
        return new ResponseEntity<>(createdFeedback, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<FeedbackDto> getFeedbackById(@PathVariable("id") int id) {
        FeedbackDto fetchedFeedback = feedbackService.getFeedbackByID(id);
        return ResponseEntity.ok(fetchedFeedback);
    }

    @GetMapping()
    public ResponseEntity<List<FeedbackDto>> getAllFeedbacks() {
        List<FeedbackDto> fetchedFeedbacks = feedbackService.getAllFeedbacks();
        return ResponseEntity.ok(fetchedFeedbacks);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<FeedbackDto> deleteFeedbackById(@PathVariable("id") int id) {
        FeedbackDto deletedFeedback = feedbackService.deleteFeedback(id);
        return ResponseEntity.ok(deletedFeedback);
    }

    @PutMapping("{id}")
    public ResponseEntity<FeedbackDto> updateFeedback(@PathVariable("id") int id, @RequestBody FeedbackDto feedbackDto) {
        FeedbackDto updatedFeedback = feedbackService.updateFeedback(id, feedbackDto);
        return ResponseEntity.ok(updatedFeedback);
    }
}
