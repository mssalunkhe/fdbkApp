package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.entity.Feedback;
import com.webapp.fdbkrestful.entity.Question;
import com.webapp.fdbkrestful.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDto {
    private long id;

    private Feedback feedback;

    private User giver;

    private User taker;

    private Question question;
    private String answer;
}
